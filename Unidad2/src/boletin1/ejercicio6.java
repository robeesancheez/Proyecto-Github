package boletin1;

import java.util.Scanner;

public class ejercicio6 {

	public static void main(String[] args) {
		
		float grav=9.8f;
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el tiempo para calcular la velocidad: ");
		int tiempo=sc.nextInt();
		
		if (tiempo == 0 || tiempo < 0) {
			System.out.println("Tiempo incorrecto");
		}
		else {
			System.out.println("La velocidad es: " + tiempo*grav);
		}

	}

}
