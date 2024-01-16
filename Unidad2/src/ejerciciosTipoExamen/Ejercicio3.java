package ejerciciosTipoExamen;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		byte i = 1;
		short piezas = 0;
		int dias = 0;
		int diaMasPiezas = 0;
		int piezasMax = 0;
		short sumaPiezas = 0;
		int piezasMinima = Integer.MAX_VALUE;
		boolean piezasMin = false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un mes (número): ");
		byte mes=sc.nextByte();
		
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12:
			dias = 31;
			break;
		case 4, 6, 9, 11:
			dias = 30;
			break;
		case 2:
			dias = 28;
			break;
		}
		
		for (i = 1; i <= dias; i++) {
			System.out.println("Piezas fabricadas el dia " + i + ": ");
			piezas=sc.nextShort();
			sumaPiezas += piezas;
			
			if (piezas < piezasMinima) {
				piezasMinima = piezas;
			}
			
			if (piezas > piezasMax) {
				piezasMax = piezas;
				diaMasPiezas = i;
			}
			
			if (piezas < 300 && piezasMin == false) {
				piezasMin = true;
			}
		}
		
		System.out.println("\n" + "El dia " + diaMasPiezas + " fue el dia con mas piezas fabricadas con " + piezasMax + " piezas.");
		System.out.println("El minimo de piezas fabricadas fueron: " + piezasMinima + " piezas");
		System.out.println("Se han fabricado: " + sumaPiezas + " motores");
		if (piezasMin = true) {
			System.out.println("Existen dias por debajo del minimo");
		}
	}
	
}