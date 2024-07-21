package com.sunera.attendanceapp.students;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@GetMapping("/allstudents")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	@PostMapping("/addattendance")
	public String addAttendance(@RequestBody Student student) {
		return studentService.addAttendance(student);
	}
	
}
