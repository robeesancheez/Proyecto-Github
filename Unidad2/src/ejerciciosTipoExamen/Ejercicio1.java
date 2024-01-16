package ejerciciosTipoExamen;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		char curso;
		String nombre = "";
		String nombreSobresaliente = "";
		
		byte a;
		byte tama�oGrupo = 0;
		byte suspensos = 0;
		byte sobresalientes = 0;
		
		double notaMedia = 0.0;
		double notaMediaAlta = 0.0;

		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce la letra del curso a elegir (A-D): ");
		curso=sc.next().charAt(0);
		
		switch(curso) {
		case 'A':
			tama�oGrupo = 25;
		case 'B':
			tama�oGrupo = 28;
		case 'C':
			tama�oGrupo = 31;
		case 'D':
			tama�oGrupo = 29;
		}
		
		for (a = 1; a <= tama�oGrupo; a++) {
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