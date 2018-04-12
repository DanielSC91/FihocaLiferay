package com.privalia.entity.listas.annotations;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {
	
	@Bean(value = "student")
	public Student student() {
		Student student = new Student();
		student.setName("PEPITO");
		student.setSurname("APELLIDO");
		student.setAge(98);
		student.setIdStudent(12);
		student.setTeachers(teachers());
		return student;
	}
	
	//@Bean(value = "teachers")
	public List<Teacher> teachers() {
		List<Teacher> teachers = new ArrayList<Teacher>();
		teachers.add(new Teacher(1, "Pepe"));
		teachers.add(new Teacher(2, "Manolo"));
		return teachers;
		
	}
}
