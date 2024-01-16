package boletin1;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número: ");
		int num=sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}
	}

}
