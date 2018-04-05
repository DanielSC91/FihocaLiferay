package com.privalia.presentation.annotations2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// Se puede obviar el value, ya que por defecto coge el nombre de la clase en minusculas --> helloWorld
@Component(value = "helloWorld")
public class HelloWorld {
	
	
	private String  hello;

	public String getHello() {
		return hello;
	}

	@Autowired
	@Value("Hello World from Annotations!")
	public void setHello(String hello) {
		this.hello = hello;
	}
	
	public HelloWorld(){
		
	}

	public HelloWorld(String hello) {
		super();
		this.hello = hello;
	}
	
	
}
