package boletin3;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		
		/*Un centro educativo nos ha pedido que diseñemos 
		 * una aplicación para calcular datos estadísticos 
		 * de los alumnos. Se introducirán las edades de los 
		 * alumnos hasta que una de ellas sea negativa. La 
		 * aplicación mostrará la suma de las edades, la media,
		 * de cuántos alumnos hemos introducido su edad, y 
		 * cuántos alumnos son mayores de edad.*/
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la edad de X: ");
		short edad=sc.nextShort();
		short contador=0;
		short contadorMayores=0;
		short sumaEdades=0;
				
		while (edad >= 0) {
			if (edad >= 18) {
				contadorMayores++;
				System.out.println("Hay " + contadorMayores + " mayores");
			}
			else {
				System.out.println("Hay " + contadorMayores + " mayores");
			}
			
			contador++;
			sumaEdades += edad;
			System.out.println("Van " + contador + " alumnos registrados.");
			System.out.println("La suma es: " + sumaEdades);
			System.out.println("La media es: " + (edad + edad) / contador);
			
			System.out.println("\nIntroduce la edad de X: ");
			edad=sc.nextShort();
		}
		
	}

}