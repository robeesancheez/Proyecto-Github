package boletin3;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		/*Realizar una aplicación que genere un número aleatorio 
		 * entre 1 y 100. El jugador debe ir probando números 
		 * tratando de acertarlo. El programa debe indicar "mayor" 
		 * o "menor" según el número secreto sea mayor o menor que 
		 * el introducido por el usuario. El proceso finaliza cuando 
		 * el usuario acierta o cuando se rinde (introduciendo un -1). */
		
		int num = (int) (Math.random() * 100) + 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Intenta adivinar el numero oculto (0-100):");
		int numResp=sc.nextInt();
		
		if (numResp !=-1) {
			while (numResp != num) {
				if (num > numResp) {
					System.out.println("Es mayor");
				}
				else {
					System.out.println("Es menor");
				}
				System.out.println("\nIntentalo de nuevo: ");
				numResp=sc.nextInt();
			}
			
		}
		
	}

}