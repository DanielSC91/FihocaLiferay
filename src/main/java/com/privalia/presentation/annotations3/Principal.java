package com.privalia.presentation.annotations3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();

        //String packageName = Principal.class.getPackage().getName();
        
        annotationContext.scan(Principal.class.getPackage().getName());
        annotationContext.refresh();
        
        HelloWorld helloWorld = 
        		(HelloWorld) annotationContext.getBean("helloWorld"); // invoca al constructor con @Autowired de HelloWorld
        
        System.out.println(helloWorld.getHello());
        
        annotationContext.close();        
        
	}

}
