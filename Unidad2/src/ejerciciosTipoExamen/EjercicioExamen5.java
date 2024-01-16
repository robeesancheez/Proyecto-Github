package ejerciciosTipoExamen;

import java.util.Scanner;

public class EjercicioExamen5 {
	
	public static void main(String[] args) {

		String clienteEmail = "";
		String codigoArt = "";
		String codArtMasCaroCliente = "";
		String codArtMasCaroMax = "";
		String clienteMasGasta = "";
		char clienteMaxArts = ' ';
		char premium = ' ';
	
		byte contPremiumSi = 0;
		byte contPremiumNo = 0;
		byte contArt;
		byte contMasCincoArtPremium = 0;
		int contArtTotalCliente;
		int maxArtTotalesUnCliente = 0;
		float gastoTotalCliente;
		float precioMasCaroMax = 0;
		float precioMasCaroArtsCliente;
		float gastoTotalMax = 0f;
		float gastoPremiums = 0f;
		float gastoNormales = 0f;
		
		
		Scanner sc=new Scanner (System.in);
	
		System.out.println("Introduce la cuenta de email del cliente:");
		clienteEmail=sc.next();
		
		while (!clienteEmail.equals("fin")) {
				
				precioMasCaroArtsCliente = 0;
				contArt = 0;
				contArtTotalCliente = 0;
				gastoTotalCliente = 0;

				System.out.println("¿Eres cliente premium? S/N");
				premium=sc.next().charAt(0);
			
				System.out.println("Introduce el codigo del articulo:");
				codigoArt=sc.next();

				while (!codigoArt.equals("fin")) {
					
					contArt++;
					System.out.println("Cantidad de unidades compradas:");
					int cantUnidCompradas=sc.nextInt();
					
					System.out.println("Precio unitario:");
					float precioUnitario=sc.nextFloat();
					
					if (precioUnitario > precioMasCaroArtsCliente) {
						precioMasCaroArtsCliente = precioUnitario;
						codArtMasCaroCliente = codigoArt;
					}
					
					contArtTotalCliente += cantUnidCompradas;
					gastoTotalCliente += (cantUnidCompradas*precioUnitario);
					
					System.out.println("Introduce el codigo del articulo:");
					codigoArt=sc.next();
			}
			
			if (contArt == 1) {
				if (precioMasCaroArtsCliente > precioMasCaroMax) {
					precioMasCaroMax = precioMasCaroArtsCliente;
					codArtMasCaroMax = codArtMasCaroCliente;
				}
			}
				
			if (premium == 'S') {
				contPremiumSi++;
				gastoPremiums += gastoTotalCliente;
			}
			else {
				contPremiumNo++;
				gastoNormales += gastoTotalCliente;
			}
			
			if (gastoTotalCliente > gastoTotalMax) {
				gastoTotalMax = gastoTotalCliente;
				clienteMasGasta = clienteEmail;
			}
			
			if (contArt >= 5 && premium == 'S') {
				contMasCincoArtPremium++;
			}
			
			
			if (contArtTotalCliente > maxArtTotalesUnCliente) {
				maxArtTotalesUnCliente = contArtTotalCliente;
				clienteMaxArts = premium;
			}
			System.out.println("Introduce la cuenta de email del cliente:");
			clienteEmail = sc.next();
		}
		
		double porcentPremiumSi = 100 * contPremiumSi / (contPremiumSi + contPremiumNo);
		System.out.println("El porcentaje de clientes premium es de " + porcentPremiumSi + "%.");
		if (gastoPremiums > gastoNormales) {
			System.out.println("Han gastado mas los usuarios Premiums");
		}
		else {
			System.out.println("Han gastado mas los usuarios Normales");
		}
		
		if (precioMasCaroMax == 0) {
			System.out.println("Ningun cliente compro solo un articulo");
		}
		else {
			System.out.println("El codigo del articulo mas caro comprado por clientes que solo compraron un articulo es: " + codArtMasCaroMax);
		}
		
		System.out.println("El cliente que mas ha gastado ha sido: " + clienteMasGasta);
		System.out.println("El numero de clientes premium que han comprado mas de 5 articulos es: " + contMasCincoArtPremium);
		if (clienteMaxArts == 'S') {
			System.out.println("El cliente que compró más unidades en total era Premium");
		}
		else {
			System.out.println("El cliente que compró más unidades en total era Normal");
		}
	}
}