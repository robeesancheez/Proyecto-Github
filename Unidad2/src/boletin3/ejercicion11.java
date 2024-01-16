package boletin3;

public class ejercicion11 {

	public static void main(String[] args) {
		
		//Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10.//

		byte i;
		byte j;
		
		for (i = 1; i <= 10; i++) {
			System.out.println("Tabla del " + i);
			for (j = 1; j <= 10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
		}
		
	}

}
