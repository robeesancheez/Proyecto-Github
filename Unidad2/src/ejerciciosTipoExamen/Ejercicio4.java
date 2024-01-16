package ejerciciosTipoExamen;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		String provinciaMasVotosA = "";
		String provinciaMasVotosB = "";
		String nombre = "";
		
		byte a;
		byte tamanoProv = 0;
		int totalVotosA = 0;
		int totalVotosB = 0;
		int votosAMax = 0;
		int votosBMax = 0;
		int totalAbs = 0;
		boolean absMin = false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime el numero de la region que quieras introducir los datos: ");
		byte region=sc.nextByte();
		
		switch (region) {
		case 1:
			tamanoProv = 10;
			break;
		case 2:
			tamanoProv = 4;
			break;
		case 3:
			tamanoProv = 6;
			break;
		case 4:
			tamanoProv = 2;
			break;
		}
		
		for (a = 1; a <= tamanoProv; a++) {
			System.out.println("\n" + "Dime el nombre de la provincia: ");
			nombre=sc.next();
			
			System.out.println("Introduce el numero de votos del partido A: ");
			int votosA=sc.nextInt();
			totalVotosA += votosA;
			
			System.out.println("Introduce el numero de votos del partido B: ");
			int votosB=sc.nextInt();
			totalVotosB += votosB;
			
			System.out.println("Introduce el numero de abstenciones: ");
			int abstenciones=sc.nextInt();
			totalAbs += abstenciones;
			
			if (votosA > votosAMax) {
				votosAMax = votosA;
				provinciaMasVotosA = nombre;	
			}
			
			if (votosB > votosBMax) {
				votosBMax = votosB;
				provinciaMasVotosB = nombre;	
			}
			
			if (abstenciones > 100000 && absMin == false) {
				absMin = true;
			}	
		}
		
		float porcentVotos = 100f * (totalVotosA + totalVotosB) / (totalVotosA + totalVotosB + totalAbs);
		float porcentAbs = 100f * totalAbs / (totalVotosA + totalVotosB + totalAbs);
		
		System.out.println("\n" + "El porcentaje de votos totales han sido de un " + porcentVotos + "%");
		System.out.println("El porcentaje de abstenciones han sido de un " + porcentAbs + "%");
		System.out.println("La provincia con el mayor numero de votos por el partido A ha sido: " + provinciaMasVotosA);
		System.out.println("La provincia con el mayor numero de votos por el partido B ha sido: " + provinciaMasVotosB);
		if (absMin = true) {
			System.out.println("Alta abstención");
		}
	}
}
