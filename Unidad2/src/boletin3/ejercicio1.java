package boletin3;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		/*Diseñar un programa que muestre, para cada número 
		 * introducido por teclado, si es par, si es positivo,
		 * y su cuadrado. El proceso terminará cuando el número 
		 * introducido por teclado sea 0. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
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