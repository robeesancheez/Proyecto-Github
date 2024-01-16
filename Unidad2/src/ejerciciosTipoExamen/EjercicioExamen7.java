package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen7 {

	public static void main(String[] args) {
		
		String cuerpo;
		String nombreCuerpo = " ";
		String nombreSat;
		String cuerpoMasCercaSol = " ";
		String cuerpoMasSat = " ";
		String cuerpoMasSat2 = " ";
		char rotacion;
		
		byte i;
		byte numSat = 0;
		byte totalCuerpos = 0;
		byte totalSat = 0;
		byte cuerpoConSat = 0;
		long distSol = 0;
		long distSolMax = Long.MAX_VALUE;
		float diametroMedio = 0.0f;
		float porcentTienenSat = 0.0f;
		int diametroCuerpo;
		int diametroSat;
		int sumaDiametroSat = 0;
		int sumaDiametroCuerpo = 0;
		int numSatMax = Integer.MIN_VALUE;
		int numSatMax2 = Integer.MIN_VALUE;
		int diametroCuerpoMax = Integer.MIN_VALUE;
		boolean hayRotacion = false;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el nombre del cuerpo celeste (estrella, planeta o agujero)");
		cuerpo=sc.next();
		
		while(!cuerpo.equals("fin")) {
			
			totalCuerpos++;
			
			System.out.println("Nombre del cuerpo celeste elegido:");
			nombreCuerpo=sc.next();
			
			System.out.println("Distancia al Sol:");
			distSol=sc.nextLong();
			
			System.out.println("Introduce el diametro:");
			diametroCuerpo=sc.nextInt();
			sumaDiametroCuerpo += diametroCuerpo;
			
			if (cuerpo.equals("estrella") || cuerpo.equals("Estrella") || (cuerpo.equals("planeta") || cuerpo.equals("Planeta"))) {
				
				System.out.println("Numero de satelites que tiene:");
				numSat=sc.nextByte();
				totalSat += numSat;
				
				for (i = 1; i <= numSat; i++) {
					
					System.out.println("Nombre del satelite:");
					nombreSat=sc.next();
					
					System.out.println("Introduce su diametro:");
					diametroSat=sc.nextInt();
					sumaDiametroSat += diametroSat;
					
					System.out.println("¿Tiene rotación síncrona respecto del cuerpo sobre el que orbita? (S/N)");
					rotacion=sc.next().charAt(0);
					
					if (rotacion == 'S' || rotacion == 's') {
						hayRotacion = true;
					}
				}
				
				if (numSat > numSatMax) {
					numSatMax2 = numSatMax;
					cuerpoMasSat2 = cuerpoMasSat;
					numSatMax = numSat;
					cuerpoMasSat = nombreCuerpo;
				}
				else {
					if (numSat > numSatMax2) {
						numSatMax2 = numSat;
						cuerpoMasSat2 = nombreCuerpo;
					}
				}
			}
			
			if (numSat > 0) {
				cuerpoConSat++;
				System.out.println(nombreCuerpo + " tiene satelites con rotacion sincrona: " + hayRotacion);;
			}
			
			if (distSol < 230000000) {
				if (diametroCuerpo > diametroCuerpoMax) {
					diametroCuerpoMax = diametroCuerpo;
				}
			}
			
			if (distSol < distSolMax) {
				distSolMax = distSol;
				cuerpoMasCercaSol = nombreCuerpo;
			}
			
			System.out.println("Introduce el nombre del cuerpo celeste (estrella, planeta o agujero)");
			cuerpo=sc.next();
		}
		sc.close();
		
		porcentTienenSat = 100f * cuerpoConSat / totalCuerpos;
		System.out.println("El porcentaje de planetas que tienen algún satélite es del " + porcentTienenSat + " %");
		System.out.println("El nombre del cuerpo celeste mas cercano al Sol es: " + cuerpoMasCercaSol);
		diametroMedio = (float) (sumaDiametroCuerpo + sumaDiametroSat) / (totalCuerpos + totalSat);
		System.out.println("El diametro medio de todos los cuerpos celestres, incluyendo satelites, es: " + diametroMedio + " kms");
		System.out.println("Los cuerpos celestes que más satelites tienen son: " + cuerpoMasSat + " y " + cuerpoMasSat2);
		System.out.println("El diametro del cuerpo mas grande de entre los que estan a menos de 230000000 de distancia del Sol es: " + diametroCuerpoMax);
	}
}