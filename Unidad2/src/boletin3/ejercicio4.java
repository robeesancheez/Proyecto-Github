package boletin3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		/* Escribir una aplicaci�n que pida un n�mero n, 
		 * y escriba los n�meros desde 1 hasta n */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero: ");
		byte num=sc.nextByte();
		byte i;
		
		for (i = 1; i <= num; i++) {
			System.out.println(i);
		}
				
	}

}