package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext appContext = 
				new AnnotationConfigApplicationContext(MyConfig.class);
		
		Student student = (Student) appContext.getBean("student");
//		List<Teacher> teachers = (List<Teacher>) appContext.getBean("teachers");
//		student.setTeachers(teachers);
		
		System.out.println(student);
		
		appContext.close();
		
	}

}
