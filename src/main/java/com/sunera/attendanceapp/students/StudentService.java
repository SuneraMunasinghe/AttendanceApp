package com.sunera.attendanceapp.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	StudentDao studentDao;
	
	public List<Student> getAllStudents() {
		return studentDao.findAll();
	}

	public String addAttendance(Student student) {
		studentDao.save(student);
		return "Attendance added succesfully!";
	}
	
	
}
