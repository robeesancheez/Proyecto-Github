package ejerciciosTipoExamen;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		char tipo = ' ';
		
		byte i;
		double sumaAlturas = 0;
		double alturaMaxima = 0;
		double alturaMinima = Double.MAX_VALUE;
		double diametroMaximo = 0;
		double diametroMinimo = Double.MAX_VALUE;
		double sumaEdades = 0;
		boolean arbolesAltos = false;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuantos arboles desea introducir?");
		int numArboles=sc.nextShort();

		for (i = 1; i <= numArboles; i++) {
			System.out.println("\n" + "Elije el tipo de arbol (A o B):");
			tipo=sc.next().charAt(0);
			
			System.out.println("Introduce la altura del arbol:");
			double altura=sc.nextDouble();
			
			System.out.println("Introduce el diametro del arbol:");
			double diametro=sc.nextDouble();
			
			if (tipo == 'B') {
				System.out.println("Edad del arbol:");
				int edad=sc.nextInt();
				sumaEdades += edad;
			}
			
			if (altura > alturaMaxima) {
				alturaMaxima = altura;
			}
			
			if (altura < alturaMinima) {
				alturaMinima = altura;
			}
			
			if (diametro > diametroMaximo) {
				diametroMaximo = diametro;
			}
			
			if (diametro < diametroMinimo) {
                diametroMinimo = diametro;
            }
			
			if (altura > 30 && arbolesAltos == false) {
				arbolesAltos = true;
			}
			
			sumaAlturas += altura;
		}
		
		double mediaEdad = sumaEdades / numArboles;
		double mediaAlturas = sumaAlturas / numArboles;
		
		System.out.println("\n" + "La altura maxima es de " + alturaMaxima);
		System.out.println("La altura minima es de " + alturaMinima);
		System.out.println("El diametro maximo es de " + diametroMaximo);
		System.out.println("El diametro minimo es de " + diametroMinimo);
		System.out.println("La media de altura es de " + mediaAlturas);
		if (tipo == 'B') {
			System.out.println("La media de edad es de " + mediaEdad);
		}
		if (arbolesAltos = true) {
			System.out.println("Existen arboles de mas de 30cm");
		}
	}

}
