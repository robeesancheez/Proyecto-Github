package boletin1;

import java.util.Scanner;

public class ejercicio4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime dos n�meros: ");
		int num=sc.nextInt();
		int num2=sc.nextInt();
		
		if (num % 2 == 0 && num2 % 2 ==0) {
			System.out.println("Hay dos n�meros pares");
		}
		else {
			if (num % 2 == 0 || num2 % 2 == 0) {
				System.out.println("Hay un n�mero par"); 
			}
			else {
				System.out.println("No hay ningun n�mero par");
			}
		}
	}

}
