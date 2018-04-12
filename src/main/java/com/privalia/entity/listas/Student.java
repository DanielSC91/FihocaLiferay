package com.privalia.entity.listas;


import java.util.List;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component(value = "student")
@PropertySource(value="classpath:config.properties")
public class Student {

	private int idStudent;
	private String name;
	private String surname;
	private int age;
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
