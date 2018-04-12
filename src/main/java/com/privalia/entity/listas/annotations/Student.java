package com.privalia.entity.listas.annotations;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value = "student")
public class Student {

	@Value("23")
	private int idStudent;
	@Value("Pepin")
	private String name;
	@Value("Ridruejo")
	private String surname;
	@Value("99")
	private int age;
	@Autowired
	@Qualifier(value = "teachers")
	private List<Teacher> teachers;
	
	public Student() {
		
	}
	
	public Student(int idStudent, String name, String surname, int age, List<Teacher> listTeachers) {
		super();
		this.idStudent = idStudent;
		this.name = name;
		this.surname = surname;
		this.age = age;
		this.teachers = listTeachers;
	}

	public int getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [idStudent=");
		builder.append(idStudent);
		builder.append(", name=");
		builder.append(name);
		builder.append(", surname=");
		builder.append(surname);
		builder.append(", age=");
		builder.append(age);
		builder.append(", teachers=");
		builder.append(teachers);
		builder.append("]");
		return builder.toString();
	}

	/*
	// to resolve ${} in @Value
	public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	*/
}
