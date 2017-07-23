package cn.bluesking.blog.service.demo;

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
		students.setPHONE("110");
		mapper.updateByPrimaryKey(students);
		int i = 1 / 0;
		students.setPHONE("120");
		mapper.updateByPrimaryKey(students);
		System.err.println(students.toString());
	}
	
}
