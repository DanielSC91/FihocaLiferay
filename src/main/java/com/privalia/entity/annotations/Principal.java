package com.privalia.entity.annotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Se tiene que instanciar el objeto a través ApplicationConfigurationContext
// Student y Address tienen que ir con anotaciones
public class Principal {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotationContext = 
				new AnnotationConfigApplicationContext();
		
		annotationContext.scan("com.privalia.entity.annotations");//Principal.class.getPackage().getName());
		annotationContext.refresh();
		
		Student student = annotationContext.getBean(Student.class);//"student");
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(student.getIdStudent());
		stringBuilder.append(" ");
		stringBuilder.append(student.getName());
		stringBuilder.append(" ");
		stringBuilder.append(student.getSurname());
		stringBuilder.append(" ");
		stringBuilder.append(student.getAge());
		stringBuilder.append(" ");
		stringBuilder.append(student.getAddress().getIdAddress());
		stringBuilder.append(" ");
		stringBuilder.append(student.getAddress().getStreet());

		System.out.println(stringBuilder.toString());
		
		annotationContext.close();
	}

}
