package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/* Crea un programa que pida un n�mero entero al usuario y 
		 * d� a una variable llamada par el valor 1 si ese n�mero 
		 * es par o el valor 0 si no es par. Hazlo primero con un 
		 * "if" y luego con un "operador condicional". */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un n�mero: ");
		int num=sc.nextInt();
		int par;
		sc.close();
		
		//Primero con el condicional "if"//
		
		if (num % 2 == 0) {
			par = 1;
		}
		else {
			par = 0;
		}
	
		System.out.println( "El numero vale " + par);
				
		//Ahora con el operador condicionar//
				
		par = num % 2 == 0 ? 1:0;
		System.out.print( "El numero vale " );
		System.out.println( par );

	}

}

