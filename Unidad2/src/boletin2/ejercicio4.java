package boletin2;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		/* Se nos pide hacer un programa que pida al usuario el valor 
		 * del radio de una circunferencia y, a continuación, muestre 
		 * un pequeño menú con 3 opciones. */
		
		/* Dependiendo del número que marque el usuario, deberemos 
		 * mostrar el resultado correspondiente. */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el radio que desees: ");
		double rad=sc.nextDouble();
		
		System.out.println("¿Que desea hacer?");
		System.out.println("1. Calcular diámetro");
		System.out.println("2. Calcular perímetro");
		System.out.println("3. Calcular area");
		int opc=sc.nextInt();
		
		switch(opc) {
		case 1:
			System.out.println("El diámetro es: " + 2*rad);
			break;
		case 2:
			System.out.println("El perímetro es: " + 2*Math.PI*rad);
			break;
		case 3:
			System.out.println("El area es: " + Math.PI*rad*rad);
			break;
		}
		sc.close();
	}

}
