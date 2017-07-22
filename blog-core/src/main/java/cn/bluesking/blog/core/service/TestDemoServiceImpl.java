package cn.bluesking.blog.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bluesking.blog.model.entity.Students;
import cn.bluesking.blog.persist.mapper.StudentsMapper;

@Service
public class TestDemoServiceImpl implements TestDemoService {
	
	@Autowired
	private StudentsMapper mapper;
	
	public void test() {
		System.err.println("bean:" + mapper);
		Students students = mapper.selectByPrimaryKey("1");
		System.err.println(students.toString());
	}
	
}
