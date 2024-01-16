package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen4 {

	public static void main(String[] args) {
		
		String clase = "";
		String alumno = "";
		String tutor = "";
		String claseMasAprobGlobal = "";
		String tutorMenorSusp = "";
		
		boolean contPrimerosTresControlesAprob = false;
		int contAprobGlobalMax = 0;
		int notaControl = 0;
		int notaExamen = 0;
		int notaClase = 0;
		int contAprobEnUnaClase = 0;
		int contExamenAprob = 0;
		int contTotalAlumnos = 0;
		float notaGlobal = 0f;
		float porcentSusp = 0;
		float menorPorcentSuspActual = 101f;
		boolean tresPrimerosControlAprob = false;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Introduce el nombre de la clase:");
		clase=sc.next();
		
		while (!clase.equals("fin")) {
			
			int contAlumno = 0;
			int contAprobGlobal = 0;
			int contSuspGlobal = 0;
			int contControlAprob = 0;
			
			System.out.println("Introduce el nombre del tutor:");
			tutor=sc.next();
			
			System.out.println("Introduce el nombre del alumno:");
			alumno=sc.next();
			
			while (!alumno.equals("fin")) {
				
				contTotalAlumnos++;
				System.out.println("Introduce la nota obtenida en el control:");
				notaControl=sc.nextInt();
				
				System.out.println("Introduce la nota obtenida en el examen:");
				notaExamen=sc.nextInt();
				
				System.out.println("Introduce la nota de clase:");
				notaClase=sc.nextInt();
				
				contAlumno++;
				
				notaGlobal = notaControl*0.3F + notaExamen*0.6f + notaClase*0.1f;
				if (notaGlobal >= 5) {
					contAprobGlobal++;
				}
				else {
					contSuspGlobal++;
				}
				
				if (notaExamen >= 5) {
					contExamenAprob++;
				}
				
				if (contAlumno == 3 && contAprobGlobal == 3) {
					tresPrimerosControlAprob = true;
				}
				
				System.out.println("Introduce el nombre del alumno:");
				alumno=sc.next();
			}
			
			porcentSusp= 100f*contSuspGlobal / contAlumno;
			if (porcentSusp < menorPorcentSuspActual) {
				menorPorcentSuspActual = porcentSusp;
				tutorMenorSusp = tutor;
			}
			
			if (contAprobGlobal > contAprobGlobalMax) {
				contAprobGlobalMax = contAprobGlobal;
				claseMasAprobGlobal = clase;
				}
			
			if (contAprobGlobal > contSuspGlobal) {
				contAprobEnUnaClase++;
			}
			
			
			System.out.println("Introduce el nombre de la clase:");
			clase=sc.next();
		}
		
		System.out.println("La clase con mayor numero de alumnos con la nota global aprobada es: " + claseMasAprobGlobal);
		System.out.println("El tutor con menor porcentaje de suspensos en notas globales es " + tutorMenorSusp + " con un " + menorPorcentSuspActual + "%");
		System.out.println("El numero de clases con mas aprobados que suspensos globales es: " + contAprobEnUnaClase); 
		System.out.println("El porcentaje de alumnos con el examen final aprobado es de un " + (float) contExamenAprob/contTotalAlumnos*100 + "%");
		if (tresPrimerosControlAprob = true) {
			System.out.println("Hay alguna clase donde los tres primeros alumnos introducidos tienen el control aprobado");
		}
	}
}