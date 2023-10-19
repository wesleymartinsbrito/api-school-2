package com.school.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.demo.entities.Classe;
import com.school.demo.entities.Student;

@RestController
@RequestMapping(value="/students")
public class StudentController {

	@GetMapping
	public List<Student> getObjects() {
		Classe c1 = new Classe(1L, "Turma A");
		Classe c2 = new Classe(2L, "Turma B");
		
		Student s1 = new Student(1L, "Maria", 15, c1);
		Student s2 = new Student(2L, "João", 17, c2);
		Student s3 = new Student(3L, "Felipe", 14, c1);
		
		List<Student> list = Arrays.asList(s1, s2, s3);
		
		return list;
	}
}
