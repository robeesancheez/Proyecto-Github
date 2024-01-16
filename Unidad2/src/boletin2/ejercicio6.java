package boletin2;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		/* Escribe un programa que calcule el salario semanal de un trabajador teniendo 
		 * en cuenta que las horas ordinarias (40 primeras horas de trabajo a la semana) 
		 * se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la 
		 * hora. */
		
		Scanner sc=new Scanner(System.in);
	    System.out.print("Dime el número de horas trabajadas en 1 semana: ");
	    int horasTrabaj=sc.nextInt();
	    int sueldo;
	    
	    if (horasTrabaj <= 40) {
	      sueldo = 12 * horasTrabaj;
	    } else {
	      sueldo = (40 * 12) + ((horasTrabaj - 40) * 16);
	    }
	    System.out.println("El sueldo semanal es de " + sueldo + " euros");
	    sc.close();
	  }

	}
