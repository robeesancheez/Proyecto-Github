package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen2 {

	public static void main(String[] args) {
		
		String provincia;
		String localidad;
		String provMaxExt = "";
		String nomLocNum1 = "";
		String nomLocNum2 = "";
		String nomLocNum3 = "";
		String locMenosDensidad = "";
		String nombreProvMasJuz = "";

		byte i;
		byte contProvJuz = 0;
		byte contLoc = 0;
		byte contProv = 0;
		byte contLocProv = 0;
		byte numLocPorProv = 0;
		float minimaDensidad = 1000f;
		float densidad = 0f;
		float mediaMaxExtProv = 0f;
		float sumaExt = 0f;
		float porcentLocJuz = 0f;
		float maxPorcentLocJuz = 0f;
		float mediaExt = 0f;
		float mediaExtMax = 0f;
		boolean pronvinciaMenosTresLoc = false;

		
		Scanner sc=new Scanner(System.in);
		System.out.println("¿Cuantas provincias va a procesar?");
		byte provincias=sc.nextByte();
		
		for (i = 1; i <= provincias; i++) {
			
			numLocPorProv = 0;
			
			System.out.println("Introduce el nombre de la provincia:");
			provincia=sc.next();
			
			System.out.println("Introduce el nombre de la localidad:");
			localidad=sc.next();
				
				while (!localidad.equals("fin")) {
					
					int habsLocNum1 = 0;
					int habsLocNum2 = 0;
					int habsLocNum3 = 0;
					
					System.out.println("Numero de habitantes:");
					int habitantes=sc.nextInt();
					
					System.out.println("Extension de su termino municipal:");
					float ext=sc.nextFloat();
					
					System.out.println("¿Tiene juzgados propios? ('s' o 'n')");
					char juzgados=sc.next().charAt(0);
					
					if (juzgados == 'S' || juzgados == 's') {
						contProvJuz++;
					}
					
					contLoc++;
					
					if(habitantes > habsLocNum1)
					{
						habsLocNum3 = habsLocNum2;
						nomLocNum3 = nomLocNum2;
						
						habsLocNum2 = habsLocNum1;
						nomLocNum2 = nomLocNum1;
						
						habsLocNum1 = habitantes;
						nomLocNum1 = localidad;
					}
					else
						if(habitantes > habsLocNum2)
						{
							habsLocNum3 = habsLocNum2;
							nomLocNum3 = nomLocNum2;

							habsLocNum2 = habitantes;
							nomLocNum2 = localidad;
						}
						else
							if(habitantes > habsLocNum3)
							{
								habsLocNum3 = habitantes;
								nomLocNum3 = localidad;
							}
					
					sumaExt += ext;
					numLocPorProv++;
					
					densidad = habitantes / ext;
					if (densidad < minimaDensidad) {
						minimaDensidad = densidad;
						locMenosDensidad = localidad;
					}
					
					System.out.println("Introduce el nombre de la localidad:");
					localidad=sc.next();
				}
				
				porcentLocJuz = (float) (contProvJuz * 100) / contLoc;
				if (porcentLocJuz > maxPorcentLocJuz)  {
					maxPorcentLocJuz = porcentLocJuz;
					nombreProvMasJuz = provincia;
				}
				
				if (numLocPorProv < 3) {
					pronvinciaMenosTresLoc = true;
				}
				
				mediaExt = sumaExt / numLocPorProv;
				if (mediaExt > mediaExtMax) {
					mediaExtMax = mediaExt;
					provMaxExt = provincia;
				}
			}
		
		System.out.println("La provincia con mayor extension media de sus localidades es: " + provMaxExt);
		System.out.println("Las tres localidades con mas habitantes son: " + nomLocNum1 + ", "  + nomLocNum2 + " y " + nomLocNum3);
		
		System.out.println("El numero medio de localidades por provincias es " + (float) contLoc/provincias);
		
		if (pronvinciaMenosTresLoc = true) {
			System.out.println("Hay provincias que tienen menos de 3 localidades");
		}
		System.out.println("La provincia con menos densidad de poblacion es " + locMenosDensidad);
		System.out.println("La provincia con el mayor porcentaje de localidades con juzgados es de " + nombreProvMasJuz);
	}
}
