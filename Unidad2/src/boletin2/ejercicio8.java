package boletin2;

import java.util.Scanner;

public class ejercicio8 {

	public static void main(String[] args) {
		
		/* Realiza un minicuestionario con 5 preguntas tipo test sobre las asignaturas 
		 * que se imparten en el curso. Cada pregunta acertada sumará un punto. El 
		 * programa mostrará al final la calificación obtenida */
		
		byte puntuacion = 0;
		Scanner sc=new Scanner(System.in);
		System.out.println("¡Bienvenido a este cuestionario sobre el curso!");
		System.out.println("Cada pregunta respondida correcta, es 1 pt. \n");
		System.out.println("Primera pregunta. ¿Cómo se introduce una variable decimal en Java?");
		System.out.println(" 1. int \n 2. boolean \n 3. double");
		byte p1=sc.nextByte();
		sc.close();
		
		switch (p1) {
		case 3:
			puntuacion ++;
			break;
		}
		
		System.out.println("Segunda pregunta. ¿Cómo se llama el actual estándar de codificación de caracteres?");
		System.out.println(" 1. UNICODE \n 2. ASCII \n 3. EBCDIC");
		byte p2=sc.nextByte();
		
		switch (p2) {
		case 1:
			puntuacion ++;
			break;
		}
				
		System.out.println("Tercera pregunta. ¿Cómo se escribe un párrafo en HTML?");
		System.out.println(" 1. <tr> \n 2. <p> \n 3. <em>");
		byte p3=sc.nextByte();
		
		switch (p3) {
		case 2:
			puntuacion ++;
			break;
		}
		
		System.out.println("Cuarta pregunta. ¿Cómo se dibuja en diagrama de flujo el inicio y el final del algoritmo?");
		System.out.println(" 1. Un óvalo \n 2. Un rectángulo \n 3. Un rombo");
		byte p4=sc.nextByte();
		
		switch (p4) {
		case 1:
			puntuacion ++;
			break;
		}
		
		System.out.println("Cuarta pregunta. ¿Cómo se expresa la clave primaria en base de datos?");
		System.out.println(" 1. UK \n 2. FK \n 3. PK");
		byte p5=sc.nextByte();
		
		switch (p5) {
		case 3:
			puntuacion ++;
			break;
		}
		
		System.out.println("\nTu puntuación es de: " + puntuacion);
		
	}

}
