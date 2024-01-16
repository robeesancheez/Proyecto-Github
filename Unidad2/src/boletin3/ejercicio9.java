package boletin3;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		
		/*Un centro de investigación de la flora urbana 
		 * necesita una aplicación que muestre cual es 
		 * el árbol más alto. Para ello se introducirán 
		 * por teclado las alturas en cms de cada árbol,
		 * terminando cuando se introduzca -1. Los árboles 
		 * se identifican mediante etiquetas con números 
		 * correlativos, comenzando en 0. */

		Scanner sc = new Scanner(System.in);
        
        int arbolActual = 0; 
        int alturaMasAlta = 0;
        int arbolMasAlto = -1; 
        
        while (true) {
            System.out.print("Ingrese la altura en cm del árbol: ");
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
            System.out.println("El árbol más alto es el " + arbolMasAlto + " con " + alturaMasAlta + " cm de alto.");
        }
        sc.close();
	}
}