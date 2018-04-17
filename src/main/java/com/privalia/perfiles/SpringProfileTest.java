package com.privalia.perfiles;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringProfileTest {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
//		context.getEnvironment().setActiveProfiles("dev");
		context.getEnvironment().setActiveProfiles("prod");
		context.scan("com.privalia.perfiles");
		context.refresh();
		User user = context.getBean(User.class);
		System.out.println("id: " + user.id + ", Name: " + user.name);
		context.close();
		
	}

}
