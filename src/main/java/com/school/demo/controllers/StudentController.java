package com.school.demo.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.school.demo.entities.Classe;
import com.school.demo.entities.Student;

@RestController
@RequestMapping(value="/students")
public class StudentController {

	@GetMapping
	public ResponseEntity getObjects() {
		return ResponseEntity.ok("deu ok");
	}
}
