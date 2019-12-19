package org.wesley.sms.handler;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.wesley.sms.entity.Student;
import org.wesley.sms.service.IStudentService;

@Controller
@RequestMapping("/student")
public class StudentHandler {

	@Autowired
	private IStudentService studentService;
	
	@RequestMapping("/login")
	public String login(Map<String,Object> map,String account,String password) {
		Student student = studentService.queryByAccountAndPassword(account,password);
		if(student!=null) {
			List<Student> studentList = studentService.queryAll();
			map.put("studentList", studentList);
			return "list";
		}else {
			return "redirect:/login.jsp";
		}
	}
}
