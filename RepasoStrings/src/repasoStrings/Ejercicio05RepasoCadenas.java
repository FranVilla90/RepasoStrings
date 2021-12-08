package repasoStrings;
import java.util.Scanner;

/**
 * Realizar un programa que cree el diminutivo de un nombre que se solicitará por teclado.
 * Si el nombre termina en O, se sustituye esta letra final por el sufijo “ITO” .
 * Si termina en “A” , IDEM con el sufijo “ITA”.
 * Si el nombre termina en E,I, o U se preguntará si es masculino o femenino y se procederá de la misma forma.
 * Si el nombre termina en consonante se preguntará si es masculino o femenino y se procederá añadiendo ITO o ITA.
 * Si no cumple ninguna de las anteriores condiciones, se mostrará por pantalla con “Nombre incorrecto”
 * 
 * NOTAS:
 *    El diminutivo se devolverá siempre en mayúsculas.
 *    Si el dato del sexo es incorrecto se volverá a solicitar. 
 *    Debe usarse un método para crear el diminutivo.
 * 
 * @author Fran Villa 
 *
 */

public class Ejercicio05RepasoCadenas {
	
	private static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// Inicio
		String palabra, diminutivoPalabra;
		System.out.println("Introduce una palabra: ");
		palabra = teclado.nextLine();
		
		diminutivoPalabra = creacionDiminutivo(palabra);
		
		System.out.println("Tu palabra es: " + palabra + " y el diminutivo es: " + diminutivoPalabra);

	}
	
	//Metodos 
	
	/**
	 * Metodo para crear un diminutivo desde una cadena dada
	 * @param cadena
	 * @return
	 */
	
	public static String creacionDiminutivo (String cadena) {
		String creacionDiminutivo = "";
		char genero;

		
		int posicionFinal = cadena.length()-1;
		StringBuilder cadenaSB;
		cadenaSB = new StringBuilder(cadena);
		
		
		if (cadena.charAt(posicionFinal) == 'a') {
			creacionDiminutivo = diminutivoFemenino(cadenaSB);
		} else if (cadena.charAt(posicionFinal) == 'o') {
			creacionDiminutivo = diminutivoMasculino(cadenaSB);
			
		} else if (cadena.charAt(posicionFinal) == 'e' || cadena.charAt(posicionFinal) == 'i' || cadena.charAt(posicionFinal) == 'u' ) {
			genero = tecladoGenero();
			if (genero == 'M') {
				creacionDiminutivo = diminutivoMasculino(cadenaSB);
			} else {
				creacionDiminutivo = diminutivoFemenino(cadenaSB);
			}
			
		} else {
			genero = tecladoGenero();
			if (genero == 'M') {
				creacionDiminutivo = diminutivoMasculino(cadenaSB);
			} else {
				creacionDiminutivo = diminutivoFemenino(cadenaSB);	
			}
		}
		
		return creacionDiminutivo; 
	}
	/**
	 * Metodo para crear el diminutivo masculino desde un StringBuilder
	 * @param cadenaSB
	 * @return
	 */
	
	public static String diminutivoMasculino (StringBuilder cadenaSB){
		String diminutivoMasculino;
		String cadenaDiminutivoMasculino = "ITO";
		int posicionFinal = cadenaSB.length()-1;
		char caracterFinal = cadenaSB.charAt(posicionFinal);
		
		
		if (caracterFinal == 'a' || caracterFinal == 'e' || caracterFinal == 'i'  || caracterFinal == 'o' || caracterFinal == 'u' ) {
			cadenaSB.deleteCharAt(posicionFinal).append(cadenaDiminutivoMasculino);
			diminutivoMasculino = cadenaSB.toString();
		} else {
		
		cadenaSB.append(cadenaDiminutivoMasculino);
		diminutivoMasculino = cadenaSB.toString();
		
		}
		
		return diminutivoMasculino;
	}
	
	/**
	 * 
	 * Metodo para crear el diminutivo femenino desde un StringBuilder
	 * @param cadenaSB
	 * @return
	 */
	
	public static String diminutivoFemenino (StringBuilder cadenaSB) {
		String diminutivoFemenino;
		String cadenaDiminutivoFemenino = "ITA";
		int posicionFinal = cadenaSB.length()-1;
		char caracterFinal = cadenaSB.charAt(posicionFinal);
		
		if (caracterFinal == 'a' || caracterFinal == 'e' || caracterFinal == 'i'  || caracterFinal == 'o' || caracterFinal == 'u' ) {
			cadenaSB.deleteCharAt(posicionFinal).append(cadenaDiminutivoFemenino);
			diminutivoFemenino = cadenaSB.toString();
		} else {
			cadenaSB.append(cadenaDiminutivoFemenino);
			diminutivoFemenino = cadenaSB.toString();
		}
		
		return diminutivoFemenino;
	}
	
	/**
	 * Metodo para recoger el caracter de Masculino o Femenino
	 * @return
	 */
	
	public static char tecladoGenero() {
		char tecladoGenero;	
		do {
			System.out.println("Introduce un genero: (M-F)");
			tecladoGenero = teclado.nextLine().charAt(0);
		} while (!(tecladoGenero == 'M' || tecladoGenero == 'F' ));
		
		return tecladoGenero;
	}
}