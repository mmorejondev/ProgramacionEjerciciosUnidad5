package com.ejud5.ej6;

public class Principal {

	public static int dividir(int a, int b) throws ArithmeticException{
		if (b==0) {
			throw new ArithmeticException("El divisor no puede ser 0");
		}else {
			return a/b;
		}
	}
	public static void main(String[] args) {

		try {
			System.out.println("El resultado de la division es: " + dividir(8,0));
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	
	}

}
