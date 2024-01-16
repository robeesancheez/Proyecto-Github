	package boletin2;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		/* Crea un programa que pida dos n�meros de tipo byte al usuario 
		 * y cree a una variable menor, que tenga el valor del menor de 
		 * esos dos n�meros. Hazlo primero con un "if" y luego con un 
		 * "operador condicional"*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime dos n�meros: ");
		byte num1=sc.nextByte();
		byte num2=sc.nextByte();
		byte menor;
		
		//Primero con el condicional "if"//
		
		if (num2 > num1) {
			menor = num1;
		}
		else {
			menor = num2;
		}
		System.out.println("El menor es: " + menor);
		
		//Ahora con el operador condicionar//
		
		menor = (num2 > num1) ? num1 : num2;
		System.out.println("El menor es: " + menor);
		
		sc.close();
	}
}
