package boletin1;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime tres números: ");
		long num=sc.nextLong();
		long num2=sc.nextLong();
		long num3=sc.nextLong();
		
		if (num > num2 && num > num3) {
			System.out.println("El número 1 es el mayor de todos");
		}
		else {
			if (num2 > num3) {
				System.out.println("El número 2 es el mayor de todos");
			}
			else {
				System.out.println("El número 3 es el mayor de todos");
			}
		}

	}

}
