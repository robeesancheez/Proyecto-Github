package boletin3;

import java.util.Scanner;

public class ejercicion12 {

	public static void main(String[] args) {
		
		/*Pedir 5 calificaciones de alumnos. El programa debe decir, 
		 * al final, si hay algún suspenso o no lo hay. Nota: cuidado,
		 * si hay 2 suspensos, no debe decirlo dos veces */

		Scanner sc=new Scanner(System.in);
		byte nota;
		byte contador = 0;
		byte i;
		
		for (i = 1; i <= 5 ; i++) {
			System.out.println("Introduce la nota:");
			nota=sc.nextByte();
			
			if (nota < 5) {
				contador ++;
			} 
		}
		
		if (contador > 0) {
			System.out.println("Hay suspensos.");
		}
		else {
			System.out.println("No hay suspensos.");
		}
	}

}
