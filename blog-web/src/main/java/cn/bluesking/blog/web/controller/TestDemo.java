package cn.bluesking.blog.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.bluesking.blog.commons.util.ClassUtil;
import cn.bluesking.blog.service.demo.TestDemoService;
import cn.bluesking.blog.web.annotation.Log;

@Controller
public class TestDemo {
	
	/**
	 * slf4j日志配置
	 */
	private static final Logger _LOG = LoggerFactory.getLogger(TestDemo.class);
	
	@Autowired
	private TestDemoService service;
	
	@Log("测试")
	@RequestMapping("/test")
	public ModelAndView testDemo() {
		System.err.println("service:" + service);
		service.test();
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "hello springMVC");
		mv.setViewName("testDemo");
		return mv;
	}
	
}
