package com.school.demo.entities;

public class Student {

	private Long id;
	private String name;
	private Integer age;
	
	private Classe classe;
	
	public Student() {
		
	}

	public Student(Long id, String name, Integer age, Classe classe) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.classe = classe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}
	
	
	
}
