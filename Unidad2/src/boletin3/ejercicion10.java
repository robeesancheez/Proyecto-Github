package boletin3;

import java.util.Scanner;

public class ejercicion10 {

	public static void main(String[] args) {
		
		/*Implementar una aplicaci�n que pida un n�mero al 
		 * usuario entre el 1 y el 10, y calcule su tabla de
		 * multiplicar. El c�digo debe asegurarse de que el 
		 * n�mero introducido est� entre 1 y 10, y si no es as�, 
		 * volver a pedirlo hasta que lo cumpla. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un numero del 1 al 10:");
		byte num=sc.nextByte();
		
		do {
				System.out.println("Introduce un numero del 1 al 10:");
				num=sc.nextByte();
		} while (num < 1 || num >10);
		
		byte i;
		System.out.println("La tabla del " + num + ":");
		for (i = 0; i <= 10; i++) {
			System.out.println(num + "x" + i + "=" + num*i);
		}

	}

}
