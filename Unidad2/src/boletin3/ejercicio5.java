package boletin3;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		/*Desarrollar un programa que solicite los valores 
		 * m�nimo y m�ximo de un rango. A continuaci�n, 
		 * solicitar� por teclado un valor que debe estar 
		 * dentro del rango. Si no es as�, volver� a solicitar 
		 * un n�mero, y as� repetidas veces hasta que el valor 
		 * est� dentro del rango. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un n�mero m�nimo para un rango:");
		byte min=sc.nextByte();
		System.out.println("Introduce un n�mero m�ximo para un rango:");
		byte max=sc.nextByte();
		System.out.println("Dime un n�mero que est� dentro del rango:");
		byte num=sc.nextByte();
		
		do {
				System.out.println("Dime un n�mero que est� dentro del rango:");
				num=sc.nextByte();
		} while (num < min || num > max);
		
	}

}