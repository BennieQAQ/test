package org.wesley.sms.test;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.wesley.sms.entity.Student;
import org.wesley.sms.service.IStudentService;

public class TestStudentService {

	private IStudentService studentService;
	
	@Before
	public void before() {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
		studentService = (IStudentService) context.getBean("studentService");
	}
	
	@Test
	public void testQueryAll() {
		for(Student student:studentService.queryAll()) {
			System.out.println(student);
		}
	}
	
	@Test
	public void testQueryByAccountAndPassword() {
		System.out.println(studentService.queryByAccountAndPassword("zhangsan", "123"));
	}
	
}
