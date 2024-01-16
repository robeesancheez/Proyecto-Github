package boletin3;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		/* Escribir una aplicación que pida un número n, 
		 * y escriba los números desde 1 hasta n */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero: ");
		byte num=sc.nextByte();
		byte i;
		
		for (i = 1; i <= num; i++) {
			System.out.println(i);
		}
				
	}

}