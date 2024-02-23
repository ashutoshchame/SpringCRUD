package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.model.Student;

public interface StudentRepository extends JpaRepository <Student,Integer>{

}
