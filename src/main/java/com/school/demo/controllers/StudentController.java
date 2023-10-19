package com.school.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.demo.entities.Classe;

@RestController
@RequestMapping(value="/students")
public class StudentController {

	@GetMapping
	public Classe getObjects() {
		Classe c1 = new Classe();
		c1.setId(1L);
		c1.setName("Turma A");
		return c1;
	}
}
