package org.wesley.sms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.wesley.sms.entity.Student;
import org.wesley.sms.mapper.StudentMapper;

@Service
public class StudentService implements IStudentService{

	@Autowired
	private StudentMapper studentMapper;
	
	@Override
	public Student queryByAccountAndPassword(String account, String password) {
		return studentMapper.findByAccountAndPassword(account,password);
	}

	@Transactional(readOnly = true)
	@Override
	public List<Student> queryAll() {
		return studentMapper.findAll();
	}





}
