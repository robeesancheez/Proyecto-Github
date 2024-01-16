package boletin3;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		/*Un centro de investigaci�n de la flora urbana 
		 * necesita una aplicaci�n que muestre cual es 
		 * el �rbol m�s alto. Para ello se introducir�n 
		 * por teclado las alturas en cms de cada �rbol,
		 * terminando cuando se introduzca -1. Los �rboles 
		 * se identifican mediante etiquetas con n�meros 
		 * correlativos, comenzando en 0. */

		Scanner sc = new Scanner(System.in);
        
        int arbolActual = 0; 
        int alturaMasAlta = 0;
        int arbolMasAlto = -1; 
        
        while (true) {
            System.out.print("Ingrese la altura en cm del �rbol: ");
            int altura = sc.nextInt();
            
            if (altura == -1) {
                break;
            }
            
            if (altura > alturaMasAlta) {
                alturaMasAlta = altura;
                arbolMasAlto = arbolActual;
            }
            
            arbolActual++;
        }
        
        if (arbolMasAlto != -1) {
            System.out.println("El �rbol m�s alto es el " + arbolMasAlto + " con " + alturaMasAlta + " cm de alto.");
        }
        sc.close();
	}
}