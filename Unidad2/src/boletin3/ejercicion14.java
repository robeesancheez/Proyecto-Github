package boletin3;

import java.util.Scanner;

public class ejercicion14 {

	public static void main(String[] args) {
		
		/* Pedir un n�mero n y dibujar un tri�ngulo rect�ngulo 
		 * de n elementos de lado, utilizando para ello asteriscos 
		 * (*). Por ejemplo, para n=4 */
		
		Scanner sc=new Scanner(System.in);
		byte fila;
		byte columna;
		
		System.out.println("Introduce un tama�o: ");
		byte lado=sc.nextByte();
		sc.close();
		
		for (fila = 0; fila < lado; fila++) {
			for (columna = 0; columna < lado - fila; columna++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
