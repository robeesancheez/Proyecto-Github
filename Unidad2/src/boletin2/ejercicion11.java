package boletin2;

import java.util.Scanner;

public class ejercicion11 {

	public static void main(String[] args) {
		
		/* Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día 
		siguiente. suponer que todos los meses tienen 30 días*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un dia: ");
		byte dia=sc.nextByte();
		
		System.out.println("Dime un mes: ");
		byte mes=sc.nextByte();
		
		System.out.println("Dime un año: ");
		short anyo=sc.nextShort();		
		sc.close();
		
		if (dia <= 30 && (mes == 4  || mes == 6 || mes == 9 || mes == 11)) {
			System.out.println("1/" + ++mes + "/" + anyo);
		}
		else {
			if (dia <= 31 && (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10)) {
				System.out.println("1/" + ++mes + "/" + anyo);
			}
			else {
				if (dia <= 28 && mes == 2) {
					System.out.println("1/" + ++mes + "/" + anyo);
				}
				else {
					if (dia <= 31 && mes <= 12) {
						System.out.println("1/1/" + ++anyo);
					}
					else {
						
					}
				}
			}
		}
	}
}