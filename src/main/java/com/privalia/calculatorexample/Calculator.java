package com.privalia.calculatorexample;

//Objetivo:  ver como hago polimorfismo de Interfaces
public class Calculator implements ICalculator , Runnable{


	public int add(int num1, int num2) {
		return num1 + num2;
	}

	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	public int divide(int num1, int num2) {
		return num1 / num2;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
