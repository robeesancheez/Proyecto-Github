package control;

import java.util.Scanner;

public class Control {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String mes = "";
		String mesCaluroso = "";
		String mesCaluroso2 = "";
		String mesMenorProp = "";
		String estado = "";
		String tipoEstado = "";
		
		byte i;
		byte dias;
		byte diaDelMes;
		byte diaDelMesCaluroso = 0;
		byte diaDelMesCaluroso2 = 0;
		byte diaNublado;
		byte ciclogenesis = 0;
		byte mesesConCiclogenesis = 0;
		byte diasLluviosos;
		int humedad;
		int mayorHumedad = 0;
		int viento = 0;
		float tempMedia = 0f;
		float mayorTempMedia = 0f;
		float mayorTempMedia2 = 0f;
		float menorPropDiasNublados = Float.MAX_VALUE;
		boolean hayMesConMenosTresDiasLLuviosos = false;
		
		
		System.out.println("Introduce un mes del año:");
		mes=sc.next();
		
		while (!mes.equals("ya")) {
			
			System.out.println("Introduce el numero de dias de los cuales quieres introducir los datos climatologicos:");
			dias=sc.nextByte();
			
			ciclogenesis = 0;
			diasLluviosos = 0;
			diaNublado = 0;
					
			for (i = 1; i <= dias; i++) {
				System.out.println("Introduce el numero del dia del mes:");
				diaDelMes=sc.nextByte();
				
				System.out.println("Introduce la temperatura media:");
				tempMedia=sc.nextFloat();
				
				System.out.println("Introduce la humedad:");
				humedad=sc.nextInt();
				
				System.out.println("Introduce la velocidad del viento");
				viento=sc.nextInt();
				
				System.out.println("Estado del dia (soleado/nublado/lluvioso):");
				estado=sc.next();
				
				//Apartado a) //
				
				if (humedad > mayorHumedad) { 
					mayorHumedad = humedad;
					tipoEstado = estado;
				}
				
				//Apartado c.1), contador de ciclogenesis//
				if (viento > 40 || tempMedia < 0) {
					ciclogenesis++;
				}
				
				//Apartado d) //
				if (tempMedia > mayorTempMedia) {
					
					mayorTempMedia2 = mayorTempMedia;
					diaDelMesCaluroso2 = diaDelMesCaluroso;
					mesCaluroso2 = mesCaluroso;
					
					mayorTempMedia = tempMedia;
					diaDelMesCaluroso = diaDelMes;
					mesCaluroso = mes;
				} 
				else {
					if (tempMedia > mayorTempMedia2) {
						mayorTempMedia2 = tempMedia;
						diaDelMesCaluroso2 = diaDelMes;
						mesCaluroso2 = mes;
					}
				}
				
				//Apartado e.1), contador de dias lluviosos//
				if (estado.equals("lluvioso")) {
					diasLluviosos++;
				}
				
				//Apartado b.1), contador de dias nublados//
				if (estado.equals("nublado")) {
					diaNublado++;
				}
			}

			//Apartado b.2), calculo de la proporcion de dias nublados//
			float propDiasNublados = diaNublado / dias;
			if (propDiasNublados < menorPropDiasNublados) {
				menorPropDiasNublados = propDiasNublados;
				mesMenorProp = mes;
			}
			
			//Apartado c.2), contador de meses que tienen Ciclogenesis//
			if (ciclogenesis > 0) {
				mesesConCiclogenesis++;
			}
			
			// Apartado e.2), si en ese mes se han introducido mas de 10 dias y menos de 3 dias son lluviosos, habra algun mes que tiene menos de tres dias lluviosos//
			if (dias > 10 && diasLluviosos < 3) {
				hayMesConMenosTresDiasLLuviosos = true;
			}
			
			System.out.println("\n" + "Introduce un mes del año:");
			mes=sc.next();
		}
		sc.close();
		
		System.out.println("\n" + "a) El estado del cielo del dia en el que hubo mas humedad es: " + tipoEstado);
		System.out.println("b) El mes en el que la proporcion de dias nublados ha sido menor es " + mesMenorProp);
		System.out.println("c) El numero de meses con algun dia de ciclogenesis son: " + mesesConCiclogenesis);
		System.out.println("d) Los dos dias más calurosos de todo el año son: " + diaDelMesCaluroso + "/" + mesCaluroso + " y " + diaDelMesCaluroso2 + "/" + mesCaluroso2);
		if (hayMesConMenosTresDiasLLuviosos = true) {
			System.out.println("e) Ha habido algun mes con menos de tres dias lluvioso.");
		} 
		else {
			System.out.println("e) No ha habido ningun mes con menos de tres dias lluvioso");
		}
	}
}