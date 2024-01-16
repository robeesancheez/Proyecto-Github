package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen3 {

	public static void main(String[] args) {
		
		String equipo;
		String juagdorMayorFicha = "";
		String equipoMasRelacion = "";
		
		byte i;
		double contF = 0;
		int contJ = 0;
		int sumaPuntos = 0;
		int sumaJugadores = 0;
		int hayPL = 0;
		double sumaEdadDefensas = 0;
		double relacionJugadoresPuntosMax = Double.MIN_NORMAL;
		double precioFichaMax = Double.MIN_VALUE;
		
		Scanner sc=new Scanner (System.in);
		
		while (true) {
			System.out.println("Introduce el nombre del equipo: ");
			equipo=sc.next();
			
			if (equipo.equals("fin")) {     //Si introducimos "fin" en vez de un codigo, se detendra el programa//
				break;
			}
			
			System.out.println("Introduce el numero de puntos que tiene: ");
			int puntos=sc.nextInt();
			
			System.out.println("Introduce el numero de jugadores: ");
			int numJugadores=sc.nextInt();
			
			double relacionJugadoresPuntos = puntos / numJugadores;
			if (relacionJugadoresPuntos > relacionJugadoresPuntosMax) {
				relacionJugadoresPuntosMax = relacionJugadoresPuntos;
				equipoMasRelacion = equipo;
			}
			
			for (i = 1; i <= numJugadores; i++) {
				System.out.println("Introduce el nombre del jugador: ");
				String nombreJugador=sc.next();
				
				System.out.println("Introduce la edad del jugador: ");
				int edad=sc.nextInt();
				
				System.out.println("Introduce el precio de su ficha: ");
				double precioFicha=sc.nextDouble();
				
				if (numJugadores < 7) {
					if (precioFicha > precioFichaMax) {
						precioFichaMax = precioFicha;
						juagdorMayorFicha = nombreJugador;
					}
				}
				
				System.out.println("Introduce la posicion en la que juega (D, F, L o P): ");
				char posicion=sc.next().charAt(0);
				
				if ((posicion == 'P' || posicion == 'p' ) && (posicion == 'L' || posicion == 'l')) {
					hayPL=1;
				}
				
				switch (posicion) {
				case 'P', 'p':
					System.out.println("Introduce los goles encajados: ");
					int golesEncajados=sc.nextInt();
					break;
				case 'D', 'd':
					System.out.println("Introduce los goles marcados: ");
					int golesMarcados=sc.nextInt();
					break;
				case 'F', 'f':
					contF++;
					sumaEdadDefensas += edad;
					break;
				}
			}
		}
		
		double mediaAnyosDefensas = sumaEdadDefensas / contF;
		System.out.println("\n" + "La media de edades de los defensas de todos los equipos es de: " + mediaAnyosDefensas);
		System.out.println("El jugador con mayor precio de ficha (<7 juagdores por equipo) es: " + juagdorMayorFicha);
		System.out.println("El equipo que mas rendimiento obtiene de sus jugadores es: " + equipoMasRelacion);
		if (hayPL == 1) {
			System.out.println("Hay algun equipo que no tiene ni portero ni defensa");
		}

	}
}