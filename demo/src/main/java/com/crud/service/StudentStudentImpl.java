package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.model.Student;
import com.crud.repository.StudentRepository;

@Service
public class StudentStudentImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public Student create(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	
	}

	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).get();
	}

	@Override
	public Student update(Student student) {
		// TODO Auto-generated method stub
		return studentRepository.save(student);
	}

	@Override
	public String deletestudent(Integer id) {
		studentRepository.deleteById(id);
		return "Record Deleted";
	}

	
}
