package boletin3;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		//Pedir un número y calcular su factorial//
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número para calcular su factorial:");
		int num=sc.nextInt();
		int i;
		int fac = 1;
		
		for (i = 1; i <= num; i++) {
			fac = fac * i;
			System.out.println(num + "! = " + fac);
		}
	}

}
