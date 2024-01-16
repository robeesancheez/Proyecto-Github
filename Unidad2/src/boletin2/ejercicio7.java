package boletin2;

import java.util.Scanner;

public class ejercicio7 {

	public static void main(String[] args) {
		
		/*Realiza un programa que resuelva una ecuación de segundo grado (del tipo 
		 * ax2+bx+c = 0). El programa deberá pedir los coeficientes de la ecuación 
		 * e indicar sus soluciones reales*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el valor de a, b y c para resolver ax2+bx+c=0: ");
		double a=sc.nextByte();
		double b=sc.nextByte();
		double c=sc.nextByte();
		sc.close();
		double raiz= b * b - 4 * a * c; 
		
		if (raiz > 0) {
			double ec1=(-b + Math.sqrt(raiz)) / (2 * a);
			double ec2=(-b - Math.sqrt(raiz)) / (2 * a);
			System.out.println("Las soluciones reales son: " + ec1 + " y " + ec2);
		}
		else {
			if (raiz == 0) {
				double ec1=-b / (2 * a);
				System.out.println("La única solucion real es: " + ec1);
			}
			else {
				System.out.println("No tiene soluciones reales");
			}
		}
		
	}

}
