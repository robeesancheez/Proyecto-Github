package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen1 {

	public static void main(String[] args) {
		
		String cod;
		String alumnoMediaAlta = "";
		String menosDuracionTitulo = "";
		String depMasProf = "";
		String depMenosMediaAnyosProf = "";
		String[] espec = new String[2];

		byte i;
		int contA = 0;
		float contB = 0f;
		float contProf = 0f;
		int numEspec = 0;
		int notaMedia = 0;
		int contF = 0;
		int sumaAnyosProf = 0;
		int totalAsigB = 0;
		int numEspc = 0;
		int maxProf = Integer.MIN_VALUE;
		int mediaEsoAlta = Integer.MIN_VALUE;
		
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			
			System.out.println("Introduce el codigo de departamento o de clase (D-C): ");
			cod=sc.next();
			
			if (cod.equals("fin")) {     
				break;
			}
		
			switch (cod.charAt(0)) {
				case 'D':
					System.out.println("Introduce el nombre del departamento");
					String dep=sc.next();
				
					System.out.println("¿Cuantos profesores hay?");
					int cantProf=sc.nextInt();

					if (cantProf > maxProf) {		
						maxProf = cantProf;         
						depMasProf = dep;			
					}
					
					for (i = 0; i < cantProf; i++) {
						System.out.println("Nombre del profesor");
						String prof=sc.next();
						contProf++;
						
						System.out.println("Años en el centro");
						int anyosProf=sc.nextInt();
						sumaAnyosProf += anyosProf;
						
						double mediaAnyosProf = sumaAnyosProf / contProf;
						if (anyosProf < mediaAnyosProf) {    						  
							mediaAnyosProf = anyosProf;		
							depMenosMediaAnyosProf = dep;	
						}
					}
					break;
			
				case 'C':
					System.out.println("Introduce una letra (dependiendo si es Bach, ESO, PCPI o FP)");
					char clase=sc.next().charAt(0);
				
					switch (clase) {
						case 'B':
							System.out.println("Numero de asignaturas que cursa:");
							double asigB=sc.nextByte();
							contB++;
							totalAsigB += asigB;		
							break;
				
						case 'E':
							while (true) {
								System.out.println("Nombre del alumno:");
								String alumno=sc.next();
								contA++;
								
								if (alumno.equals("fin")) {
									break;
								}
					
								System.out.println("Nota media del alumno:");
								double media=sc.nextDouble();
								notaMedia += media;
								
								if (contA < 20) {
									if (notaMedia / contA > mediaEsoAlta / contA) {  
										media = mediaEsoAlta;						
										alumnoMediaAlta = alumno;					
										}
									}
							}
							break;
							
						case 'P':
							System.out.println("Nombre de la especialidad:");
							String espc=sc.next();
						    if (numEspec < 2) {
		                        espec[numEspec] = espc;
		                        numEspec++;
		                    }
							break;

						case 'F':
							System.out.println("Nombre del titulo:");
							String titulo=sc.next();
					
							System.out.println("Horas totales de duracion del ciclo:");
							int horasF=sc.nextInt();
							
							if (horasF > 1500) {		
								contF++;				
							}
							if (horasF < 2500) {					
								menosDuracionTitulo = titulo;		
								break;	
							}
						}
					}
				}
		
		System.out.println("El departamento con mas profesores es: " + depMasProf);
		System.out.println("El alumno " + alumnoMediaAlta + " es el alumno con la nota media mas alta.");
		System.out.println("Las ultimas dos especialidades han sido: ");
		for (i = 0; i < numEspec; i++) {
	            System.out.print(espec[i] + " y ");
	        }
		float mediaAsigB = totalAsigB / contB;
		System.out.println("\n" + "La media de asignaturas en bachillerato es de asignaturas: " + mediaAsigB);
		System.out.println("El numero de ciclos con mas de 1.500 horas es de " + contF + " ciclos");
		System.out.println("El ciclo con menos duracion es " + menosDuracionTitulo);
		System.out.println("El departamento con menor media de años de permanencia en el centro de sus profesores es: " + depMenosMediaAnyosProf);
		if (numEspc < 2) {
			System.out.println("Hay menos de dos especialidades.");
		}
	}
}