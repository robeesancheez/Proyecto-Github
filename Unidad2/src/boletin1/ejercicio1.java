package boletin1;

import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
		
		/*
		 * 
		* @author: Roberto
		* 
		*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce un número: ");
		int num=sc.nextInt();
		
		if (num > 0) {
			System.out.println("Es positivo");
		} 
		else {
			System.out.println("Es negativo");
		}
	}

}
