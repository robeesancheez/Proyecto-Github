package boletin3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		/*Dise�ar un programa que muestre, para cada n�mero 
		 * introducido por teclado, si es par, si es positivo,
		 * y su cuadrado. El proceso terminar� cuando el n�mero 
		 * introducido por teclado sea 0. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un n�mero: ");
		byte num=sc.nextByte();
		sc.close();
		
		while (num != 0) {
			if (num > 0) {
				System.out.println("Es positivo");
			}
			else {
				System.out.println("Es negativo");
			}
			
			if (num % 2 == 0) {
				System.out.println("Es par");
			}
			else {
				System.out.println("Es impar");
			}
			System.out.println("Su cuadrado es: " + num*num);
			break;
		}

	}

}