package boletin3;

import java.util.Scanner;

public class ejercicion15 {

	public static void main(String[] args) {
		
		/* Realizar un programa que nos pida un número n, 
		 * y nos diga cuantos números hay entre 1 y n que 
		 * sean primos. Un número primo es aquel que sólo 
		 * es divisible por 1 y por él mismo. Ejemplo: Para 
		 * n=8: */
		
		boolean primo = true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num=sc.nextByte();
		
		for (int i=2; i < num; i++) {
			if (num % i == 0) {
				primo = false;
				if (primo = true)  {
					System.out.println(num + " -> es Primo");
				}
				else {
					System.out.println(num + " -> no es Primo");
				}
			}
		}
	}

}
