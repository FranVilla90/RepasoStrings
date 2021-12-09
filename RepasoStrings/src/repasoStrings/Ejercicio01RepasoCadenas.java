package repasoStrings;

import java.util.Scanner;

/**
 * 
 * Realizar un programa que lea en una cadena el nombre  completo de una persona 
 * (nombre y apellidos) y muestre por pantalla el nombre, apellido1 y apellido2. 
 * Si el nombre completo no es correcto mostrará un mensaje de error.
 * 
 * @author Fran VIlla 
 *
 */
public class Ejercicio01RepasoCadenas {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		//Variables
		String nombrePedido;
		
		// Inicio
		
		do {
			System.out.println("Introduce tu nombre: ");
			nombrePedido = teclado.nextLine();
		} while (esCorrectoNombre(nombrePedido) == false);
		
		divisionNombre(nombrePedido);
		

	}
	
	//Metodos
	
	/**
	 * Metodo para comprobar que un nombre es correcto
	 * 
	 * @param nombre
	 * @return
	 */
	public static boolean esCorrectoNombre (String nombre) {
		boolean esCorrecto = true;
//		char caracter;
//		for (int contador = 0; contador < nombre.length() && esCorrecto == true ; contador++ ) {
//			caracter = nombre.charAt(contador);
//			
//			if (Character.isDigit(caracter)) {
//				esCorrecto = false; 
//				System.out.println("El nombre es incorrecto");
//			}
//			
//		}
		
		if (nombre.indexOf(' ') == nombre.lastIndexOf(' ')) {
			esCorrecto = false;
			System.out.println("Nombre incompleto, introduce el nombre completo");
		}
		
		return esCorrecto; 
	}
	
	public static void divisionNombre (String nombreCompleto) {
		
		String nombre,apellido1,apellido2;
		int posicionApellido1, posicionApellido2; 
		
		//Sacar el segundo Apellido
//		posicionApellido2 = nombreCompleto.lastIndexOf(" ");
//		apellido2 = nombreCompleto.substring(posicionApellido2, nombreCompleto.length()).toUpperCase();
//		
		//Sacar el primer Apellido
//		posicionApellido1 = nombreCompleto.lastIndexOf(" ", posicionApellido2-1);
//		apellido1 = nombreCompleto.substring(posicionApellido1,posicionApellido2).toUpperCase();
		
		//Sacar el nombre
		
		//nombre = nombreCompleto.substring(0, posicionApellido1).toUpperCase();
		
		//Sacar el nombre
		posicionApellido1 = nombreCompleto.indexOf(" ");
		nombre = nombreCompleto.substring(0, posicionApellido1).toUpperCase();
		
		//Sacar el primer apellido
		posicionApellido2 = nombreCompleto.indexOf(" ", posicionApellido1 + 1);
		apellido1 = nombreCompleto.substring(posicionApellido1+1,posicionApellido2).toUpperCase();
		
		//Sacar segundo apellido
		apellido2 = nombreCompleto.substring(posicionApellido2, nombreCompleto.length()).toUpperCase();
		
		System.out.println("El nombre es: " + nombre + "\n"
						 +"El primer apellido es: " + apellido1 + "\n"
						 +"El segundo apellido es: " + apellido2 + "\n");
		
		
		
		
		
	}

}
