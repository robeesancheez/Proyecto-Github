package boletin2;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		// Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.//
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un número entre 0 y 9.999:");
		short num=sc.nextShort();
		sc.close();
		
		if (num >= 0 && num <= 9) {
			System.out.println("Tiene 1 cifra");
		}
		else {
			if (num >= 10 && num <= 99) {
				System.out.println("Tiene 2 cifras");
			}
			else {
				if (num >= 100&& num <= 999) {
					System.out.println("Tiene 3 cifras");
				}
				else {
					if (num >= 1000 && num <= 9999) {
						System.out.println("Tiene 4 cifras");
					}
				}
			}
			
		}
		sc.close();
	}

}
