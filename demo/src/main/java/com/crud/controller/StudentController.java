package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.crud.model.Student;
import com.crud.service.StudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	StudentService studentService;

	@GetMapping("")
	public List<Student> getStudent() {
		return studentService.getAllStudents();
	}
	
	@GetMapping("/{id}")
	public Student getStudent(@PathVariable Integer id) {
		return studentService.getStudentById(id);
	}
	
	@PostMapping("/store")
	public Student saveStudent(@RequestBody Student student) {
		return studentService.create(student);	
	}
	
	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return studentService.update(student);
	}
    
	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable Integer id ) {
		return  studentService.deletestudent(id);
		
	}
	
	
}
