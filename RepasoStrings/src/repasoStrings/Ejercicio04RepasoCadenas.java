package repasoStrings;

import java.util.Scanner;

/**
 * Realizar un método que permita saber si un texto es o no “Guay del
 * Paraguay”. Se considera que una cadena es “Guay del Paraguay” si las 4
 * primeras letras y las 4 últimas son iguales entre sí. El número 4 debe
 * crearse como constante de manera que el programa siga funcionando si se
 * cambia el valor de dicha constante.
 * 
 * @author Fran Villa
 *
 */

public class Ejercicio04RepasoCadenas {

	private static Scanner teclado = new Scanner(System.in);

	private static final int NUMERO_LETRAS_COINCIDE = 4;

	public static void main(String[] args) {
		// Inicio
		String nombreCadena;
		System.out.println("Introduce una cadena: ");
		nombreCadena = teclado.nextLine();

		if (esCadenaGuay(nombreCadena) == true) {
			
			System.out.println("La cadena es Guay del Paraguay");

		} else {
			System.out.println("La cadena no es Guay del Paraguay");
		}

	}
	
	//Metodos
	
	/**
	 * Metodo para comprobar si una cadena empieza y termina con las mismas letras
	 * @param cadena
	 * @return
	 */

	public static boolean esCadenaGuay(String cadena) {
		boolean esCadenaGuay = true;
		
		if (cadena.length() >= NUMERO_LETRAS_COINCIDE * 2) {
			StringBuilder cadenaInicioSB = new StringBuilder();
			StringBuilder cadenaFinalSB = new StringBuilder();
			String cadenaInicio, cadenaFinal;

			cadenaInicioSB.append(cadena.substring(0, NUMERO_LETRAS_COINCIDE));
			cadenaFinalSB.append(cadena.substring(cadena.length() - NUMERO_LETRAS_COINCIDE, cadena.length()));

			cadenaInicio = cadenaInicioSB.toString();
			cadenaFinal = cadenaFinalSB.toString();

			if (!(cadenaInicio.equalsIgnoreCase(cadenaFinal))) {
				esCadenaGuay = false;
			}
		} else {
			esCadenaGuay = false;
		}

		return esCadenaGuay;
	}

}
