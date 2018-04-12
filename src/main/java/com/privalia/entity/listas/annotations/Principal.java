package com.privalia.entity.listas.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext();
		
		context.scan("com.privalia.entity.listas.annotations");
		context.refresh();
		
		Student student = context.getBean(Student.class);
		System.out.println(student);
		context.close();
		
	}

}
