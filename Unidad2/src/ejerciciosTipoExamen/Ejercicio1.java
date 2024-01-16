package ejerciciosTipoExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		char curso;
		String nombre = "";
		String nombreSobresaliente = "";
		
		byte a;
		byte tamañoGrupo = 0;
		byte suspensos = 0;
		byte sobresalientes = 0;
		
		double notaMedia = 0.0;
		double notaMediaAlta = 0.0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la letra del curso a elegir (A-D): ");
		curso=sc.next().charAt(0);
		
		switch(curso) {
		case 'A':
			tamañoGrupo = 25;
		case 'B':
			tamañoGrupo = 28;
		case 'C':
			tamañoGrupo = 31;
		case 'D':
			tamañoGrupo = 29;
		}
		
		for (a = 1; a <= tamañoGrupo; a++) {
			System.out.println("Dime el nombre del alumno: ");
			nombre=sc.next();
			System.out.println("Introduce la nota de su primer parcial: ");
			double nota1=sc.nextDouble();
			System.out.println("Introduce la nota de su segundo parcial: ");
			double nota2=sc.nextDouble();
			System.out.println("Introduce la nota de su tercer parcial: ");
			double nota3=sc.nextDouble();
			
			notaMedia = (nota1+nota2+nota3)/3;
			if (notaMedia > notaMediaAlta) {
				notaMediaAlta = notaMedia;
				nombreSobresaliente = nombre;
			}
			
			if (notaMedia < 5) {
				suspensos++;
			}
			
			if (notaMedia >= 9) {
				sobresalientes++;
				}
			break;
		}
		
		System.out.println("El alumno " + nombreSobresaliente + " de la clase " + curso + " tiene la media mas alta con un " + notaMediaAlta);
		System.out.println("Hay " + suspensos + " suspensos");
		if (sobresalientes > 0) {
			System.out.println("Existen sobresalientes");
		}
		sc.close();
	}
}