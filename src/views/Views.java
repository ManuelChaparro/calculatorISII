package views;

import java.util.Scanner;

/**
 * Esta clase define cada uno de los metodos necesario para la salida y entrada de datos por parte del usuario. 
 * @author: Manuel C. Rojas, Luis S. Parra, Pedro J. Neira
 * @version:  05/09/2022/A
 */

public class Views {
	
	private Scanner sc;
	
    /**
     * Constructor para las vistas.
     */
	public Views() {
		sc = new Scanner(System.in);
	}
	
    /**
     * Metodo que devuelve el primer numero, ingresado por el usuario.
     * @return Numero entero.
     */
	public int inputNumOne() {
		System.out.println("Ingrese el numero 1: ");
		return Integer.parseInt(sc.next());
	}
	
    /**
     * Metodo que devuelve el segundo numero, ingresado por el usuario.
     * @return Numero entero.
     */
	public int inputNumTwo() {
		System.out.println("Ingrese el numero 2: ");
		return Integer.parseInt(sc.next());
	}
	
    /**
     * Metodo que muestra el mensaje y resultado de una operación.
     * @param operation El parametro operation, define la operación que se lleva a cabo.
     * @param result El parametro result, define el resultado de dicha operación.
     */
	public void viewResult(String operation, int result) {
		System.out.println("El Resultado de la "+ operation +" es: \n" + result + "\n \n");
	}
	
    /**
     * Metodo que devuelve un mensaje de advertencia al usuario, por digitar un numero invalido.
     */
	public void inputErr() {
		System.out.println("El numero ingresado no se encuentra en el menu.");
	}
	
    /**
     * Metodo que muestra el menu principal y devuelve el numero de la opción seleccionada por el usuario.
     * @return Numero entero (opción).
     */
	public int showMenu() {
		System.out.println("Calculadora basica");
		System.out.println(" 1. Sumar. \n 2. Restar. \n 3. Multiplicar. \n 4. Dividir. \n 5. Salir. \n");
		return Integer.parseInt(sc.next());
	}
}
