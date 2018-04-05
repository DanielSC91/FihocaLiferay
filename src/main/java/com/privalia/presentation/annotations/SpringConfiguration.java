package com.privalia.presentation.annotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfiguration {

	// Se puede quitar el atributo name ya que devuelve un objeto 
	// con el nombre del método
	@Bean(name = "helloWorld")
	public HelloWorld helloWorld() {
		return new HelloWorld("HOLAAAAAA");
	}
}
