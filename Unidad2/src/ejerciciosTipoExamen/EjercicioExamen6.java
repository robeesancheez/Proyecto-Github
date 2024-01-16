package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String nombre = "";
		String titulo = "";
		String libroMasVendido = "";
		String libroMasVendidoMasDosLibros = "";
		String libroMasBarato = "";
		String libroMasBarato2 = "";
		char autorClienteMasGasta = ' ';
		char sexo = ' ';
		
		byte i;
		byte contLibros = 0;
		byte contMujeres = 0;
		byte contHombres = 0;
		byte contMujeresMasTresLibros = 0;
		byte hayAutorMasDosLibros = 0;
		int numAutores;
		int unidades = 0;
		float gastoTotal;
		float gastoTotalMax = 0f;
		float precioUnitario = 0f;
		float precioMax = 0f;
		float precioMin = Float.MAX_VALUE;
		float precioMin2 = Float.MAX_VALUE;
		
		
		
		System.out.println("Introduce el numero de autores:");
		numAutores=sc.nextInt();
		for (i = 1; i <= numAutores; i++) {
			
			System.out.println("Introduce el nombre del autor/a:");
			nombre=sc.next();
			
			System.out.println("Introduce el sexo del autor/a:");
			sexo=sc.next().charAt(0);
			
			System.out.println("Introduce el titulo del libro:");
			titulo=sc.next();
			
			gastoTotal = 0;
			
			while(!titulo.equals("fin")) {
				
				contLibros++;
				System.out.println("Introduce el precio unitario:");
				precioUnitario=sc.nextFloat();
				
				System.out.println("Introduce las unidades vendidas:");
				unidades=sc.nextInt();
				
				gastoTotal += (unidades * precioUnitario);
				
				if (precioUnitario > precioMax) {
					precioMax = precioUnitario;
					libroMasVendido = titulo;
				}
				
				if (gastoTotal > gastoTotalMax) {
					gastoTotalMax = gastoTotal;
					autorClienteMasGasta = sexo;
				}
				
				
				
				if (precioUnitario < precioMin) {
					precioMin = precioUnitario;
					libroMasBarato = titulo;
				}
				else {
					if (precioUnitario < precioMin2) {
						precioMin2 = precioUnitario;
						libroMasBarato2 = libroMasBarato;
					}
				}
				
				
				
				System.out.println("Introduce el titulo del libro:");
				titulo=sc.next();
			}
			
			if (sexo == 'M' || sexo == 'm') {
				contMujeres++;
				if (contLibros >= 3) {
					contMujeresMasTresLibros++;
				}
			}
			else {
				contHombres++;
			}
			
			if (contLibros > 2) {
				libroMasVendidoMasDosLibros = libroMasVendido;
			}
			else {
				hayAutorMasDosLibros++;
			}
			
		}
		
		System.out.println("El porcentaje de autoras es de un " + (float) 100 * (contMujeres) / (contMujeres+contHombres) + "%");
		if (autorClienteMasGasta == 'M') {
			System.out.println("El sexo del autor en el que mas dinero ha gastado un cliente es Mujer");
		}
		else {
			System.out.println("El sexo del autor en el que mas dinero ha gastado un cliente es Hombre");
		}
		System.out.println("El numero de autoras que han escrito 3 o mas libros es: " + contMujeresMasTresLibros);
		System.out.println("Los dos libros mas baratos son: " + libroMasBarato + " y " + libroMasBarato2);
		if (hayAutorMasDosLibros == 0) {
			System.out.println("Ningun autor ha escrito mas de dos libros");
		}
		else {
			System.out.println("El libro mas caro por un autor que ha vendido mas de dos libros es: " + libroMasVendidoMasDosLibros);
		}
	}
}