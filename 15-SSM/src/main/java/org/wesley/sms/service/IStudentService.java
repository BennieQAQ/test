package org.wesley.sms.service;

import java.util.List;

import org.wesley.sms.entity.Student;

public interface IStudentService {

	Student queryByAccountAndPassword(String account,String password);
	
	List<Student> queryAll();
	
}
