package repasoStrings;

import java.util.Scanner;

/**
 * Realizar un método al que se le pase una cadena con un número de teléfono
 * (999999999) y devuelva una nueva cadena con el teléfono formateado de esta
 * forma 999-99-99-99
 * 
 * @author Fran Villa
 *
 */

public class Ejercicio02RepasoCadenas {

	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// Variables
		String numeroTelefonoUsuario;
		String numeroTelefonoDividido;
		// Inicio
		//Comprobamos el numero de telefono
		do {
			System.out.println("Introduce un numero de telefono: ");
			numeroTelefonoUsuario = teclado.nextLine();
		} while (comprobarNumeroTelefono(numeroTelefonoUsuario) == false);
		
		//Guardamos el numero de telefono y se imprime
		numeroTelefonoDividido = formatearTelefono(numeroTelefonoUsuario);
		
		System.out.println("El numero de telefono dividido es: " + numeroTelefonoDividido);

	}

	// Métodos

	/**
	 * Comprobación del numero de telefono con 9 digitos
	 * 
	 * @param cadena
	 * @return boolean
	 */

	public static boolean comprobarNumeroTelefono(String cadena) {
		boolean numeroCorrecto = true;

		if (cadena.length() != 9) {
			numeroCorrecto = false;
		}
		return numeroCorrecto;

	}

	/**
	 * Metodo para darle formato a un numero de telefono xxx-xx-xx-xx
	 * @param cadena
	 * @return
	 */
	public static String formatearTelefono(String cadena) {
		String nuevoTelefono = "";
		char caracter;
		StringBuilder cadenaTelefono = new StringBuilder();

		for (int contador = 0; contador < cadena.length(); contador++) {
			
			//Recorrer la cadena
			caracter = cadena.charAt(contador);
			//Añadimos en las posiciones el guión, si no, se añade el caracter
			if (contador == 2 || contador == 4 || contador == 6) {
				cadenaTelefono.append(caracter);
				cadenaTelefono.append('-');
			} else {
				cadenaTelefono.append(caracter);
			}

		}
		//Pasamos el StringBuilder a String
		nuevoTelefono = cadenaTelefono.toString();

		return nuevoTelefono;
	}

}
