package boletin3;

import java.util.Scanner;

public class ejercicion13 {

	public static void main(String[] args) {
		
		/* Dadas 6 notas, escribir la cantidad de alumnos 
		 * aprobados, condicionados (=4) y suspensos. */

		Scanner sc=new Scanner(System.in);
		byte nota;
		byte aprobados = 0;
		byte condicionados = 0;
		byte suspensos = 0;
		byte i;
		
		for (i = 1; i <= 6 ; i++) {
			System.out.println("Introduce la nota:");
			nota=sc.nextByte();
			
			if (nota >= 5) {
				aprobados ++;
			}
			
			if (nota < 4) {
				suspensos++;
			} 
			
			if (nota == 4) {
				condicionados++;
			}
		}
		
		System.out.println("Hay " + aprobados + " aprobados.");
		System.out.println("Hay " + condicionados + " condicionados.");
		System.out.println("Hay " + suspensos + " suspensos.");
	}

}
