package cn.bluesking.blog.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.bluesking.blog.core.service.TestDemoService;

@Controller
public class TestDemo {
	
	@Autowired
	private TestDemoService service;
	
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
