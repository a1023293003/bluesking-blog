package cn.bluesking.blog.web.aspect;


import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.bluesking.blog.web.annotation.Log;

/**
 * 日志操作切面类
 * 
 * @author 随心
 *
 */
@Aspect		// 声明这是一个切面类
@Order(1)	// 设置切面优先级:如果多个切面,可通过优先级控制斜面的执行顺序(数值越小,优先级越高)
@Component	// 把LoggerAspect注册成bean,放到IOC容器中
public class LoggerAspect {

	/**
	 * slf4j日志配置
	 */
	private static final Logger _LOG = LoggerFactory.getLogger(LoggerAspect.class);
	
	/**
	 * 切面切入点表达式
	 */
	private static final String ASPECT_POINTCUT_EXPRESSION = "execution(public * cn.bluesking.blog.web.*controller.*.*(..))";
	
	/**
	 * 定义一个方法用于声明切入点表达式,后面增强方法需要注解引用改方法名
	 */
	@Pointcut(ASPECT_POINTCUT_EXPRESSION)
	public void aspectMethod() {};
	
	/**
	 * 环绕增强
	 * <pre>
	 * 记录web层控制器的操作日志信息,及相关异常信息.
	 * </pre>
	 * @param joinPoint [ProceedingJoinPoint]目标类连接点对象
	 * @throws Throwable 
	 */
	@Around("aspectMethod()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		Object result = null;
		long beginTime = 0;
		long endTime = 0;
		boolean state = true;
		try {
			beginTime = new Date().getTime();
			System.err.println("方法起始时间：" + new Timestamp(beginTime).toString());
			// 执行方法
			result = joinPoint.proceed(joinPoint.getArgs());
			Class<?>[] params = ((MethodSignature) joinPoint.getSignature()).getMethod().getParameterTypes();
			// 从上下文中获取request
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
			System.err.println("url:" + request.getRequestURI() + "、" + request.getRequestURL());
			System.err.println("ip：" + request.getRemoteAddr() + "、" + request.getHeader("x-forwarded-for") + "、" + request.getHeader("Proxy-Client-IP") + "、" + request.getHeader("WL-Proxy-Client-IP"));
			String methodName = joinPoint.getSignature().getName();
			System.err.println("方法名：" + methodName);
			System.err.println("方法参数：" + params.length);
			System.err.println("方法对象：" + joinPoint.getTarget());
			System.err.println("操作描述：" + joinPoint.getTarget().getClass().getDeclaredMethod(methodName, params).getAnnotation(Log.class).value());
		} catch (Throwable e) {
			state = false;
			System.err.println("异常信息：" + e);
			throw e;
		} finally {
			endTime = new Date().getTime();
			System.err.println("方法结束时间：" + new Timestamp(endTime).toString());
			System.err.println("state：" + state);
			System.err.println("操作时间：" + (endTime - beginTime));
		}
		return result;
	}
	
}
