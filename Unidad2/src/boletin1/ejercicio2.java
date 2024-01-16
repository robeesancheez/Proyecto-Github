package boletin1;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el número 12: ");
		int num=sc.nextInt();
		
		if (num == 12) {
			System.out.println("Correcto");
		} 
		else {
			System.out.println("Incorrecto");
		}
	}

}
