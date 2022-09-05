package controller;

import models.Calculator;
import views.Views;

/**
 * Esta clase define los metodos que reunen a los modelos y a las vistas. 
 * @author: Manuel C. Rojas, Luis S. Parra, Pedro J. Neira
 * @version:  05/09/2022/A
 */

public class Controller {

    private Calculator calculator;
    private Views views;

    /**
     * Constructor para el controlador de la aplicacion.
     */
    public Controller() {
    	calculator = new Calculator();
    	views = new Views();
    	init();
    }

    /**
     * Metodo que ejecuta el menú de funcionalidades de la calculadora, uniendo modelos y vistas.
     */
	private void init() {
		boolean isRun = false;
		while (!isRun) {
			switch (views.showMenu()) {
			case 1:
				views.viewResult("Suma", calculator.sum(views.inputNumOne(), views.inputNumTwo()));
				break;
			case 2:
				views.viewResult("Resta", calculator.subtraction(views.inputNumOne(), views.inputNumTwo()));
				break;
			case 3:
				views.viewResult("Multiplicación", calculator.multiplication(views.inputNumOne(), views.inputNumTwo()));
				break;
			case 4:
				views.viewResult("División", (int)(calculator.split(views.inputNumOne(), views.inputNumTwo())));
				break;
			case 5:
				System.exit(0);
				break;
			default:
				views.inputErr();
				break;
			}		
		}
		System.exit(0);
	}   
}
