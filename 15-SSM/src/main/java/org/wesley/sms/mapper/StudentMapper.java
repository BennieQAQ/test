package org.wesley.sms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import org.wesley.sms.entity.Student;

@Repository
public interface StudentMapper {
	
	Student findByAccountAndPassword(@Param("account") String account,@Param("password") String password);
	
	List<Student> findAll();
	
}
