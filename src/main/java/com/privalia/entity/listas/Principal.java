package com.privalia.entity.listas;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Se tiene que instanciar el objeto a través ApplicationConfigurationContext
// Student y Address tienen que ir con anotaciones
public class Principal {

	public static void main(String[] args) {

		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("spring-config.xml");
		
		Student student = (Student) context.getBean("student2");

		System.out.println(student.toString());
		
		context.close();
	}

}
