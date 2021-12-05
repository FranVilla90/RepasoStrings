package repasoStrings;
import java.util.Scanner;

/**
 * 
 * Realizar un método que reciba como entrada dos cadenas de caracteres y 
 * devuelva una tercera cadena intercalando los caracteres de las palabras de las cadenas recibidas
 * 
 * @author franvilla
 *
 */


public class Ejercicio03RepasoCadenas {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		//Variables
		String cadena1, cadena2, nuevaCadena;
		// Inicio
		do {
		cadena1 = teclado("Escribe un texto: ");
		cadena2 = teclado("Escribe otro texto menor que el primer: ");
		}while (cadena1.length()<cadena2.length());
		
		//Guardar la nueva cadena e imprimir 
		nuevaCadena =fusionCadena(cadena1, cadena2);
		System.out.println("La fusión de la cadena: " + nuevaCadena);

	}
	
	//Metodos 
	
	/**
	 * Fusionar dos cadenas en una
	 * @param cadena1
	 * @param cadena2
	 * @return
	 */
	
	public static String fusionCadena (String cadena1, String cadena2) {
		
		String nuevaCadena;
		char caracterCadena1, caracterCadena2;
		StringBuilder nuevaCadenaSB = new StringBuilder(); 
		
		//Bucle para recorrer la primera cadena 
		for (int contador = 0; contador < cadena1.length(); contador++) {
			//Añadir el caracter de la primera cadena
			caracterCadena1 = cadena1.charAt(contador);
			nuevaCadenaSB.append(caracterCadena1);
			//Usar el contador para añadir el caracter de la segunda cadena
			if (contador < cadena2.length()) {
				caracterCadena2 = cadena2.charAt(contador);
				nuevaCadenaSB.append(caracterCadena2);
			}
		}
		
		nuevaCadena = nuevaCadenaSB.toString();
		
		return nuevaCadena;
		
	}
	
	/**
	 * 
	 * Recoger String por teclado pidiendo un texto para mostar por pantalla 
	 * @param texto que imprimimos en consola
	 * @return
	 */
	
	public static String teclado (String texto) {
		String cadena;
		
		System.out.println(texto);
		cadena = teclado.nextLine();
		
		return cadena;
	}

}
