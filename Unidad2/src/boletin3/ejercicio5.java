package boletin3;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		/*Desarrollar un programa que solicite los valores 
		 * mínimo y máximo de un rango. A continuación, 
		 * solicitará por teclado un valor que debe estar 
		 * dentro del rango. Si no es así, volverá a solicitar 
		 * un número, y así repetidas veces hasta que el valor 
		 * esté dentro del rango. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número mínimo para un rango:");
		byte min=sc.nextByte();
		System.out.println("Introduce un número máximo para un rango:");
		byte max=sc.nextByte();
		System.out.println("Dime un número que esté dentro del rango:");
		byte num=sc.nextByte();
		
		do {
				System.out.println("Dime un número que esté dentro del rango:");
				num=sc.nextByte();
		} while (num < min || num > max);
		
	}

}