package models;
/**
 * Esta clase define cada uno de los metodos usados por una calculadora (Sumar, restar, multiplicar y dividir). 
 * @author: Manuel C. Rojas, Luis S. Parra, Pedro J. Neira
 * @version:  05/09/2022/A
 */

public class Calculator {

    /**
     * Metodo que devuelve el resultado de la suma de dos o mas numeros.
     * @param num1 El parametro num1, define uno de los numeros que se sumar�.
     * @param num2 El parametro num2, define el otro numero que se sumar�.
     * @return El resultado de la suma.
     */
    public int sum(int num1, int num2){
        return num1+num2;
    }

    /**
     * M�todo que devuelve el resultado de la sustracci�n entre dos o mas numeros.
     * @param num1 El parametro num1, define uno de los numeros que se restar�.
     * @param num2 El parametro num2, define el otro numero que se restar�.
     * @return El resultado de la sustracc�on.
     */
    public int subtraction(int num1, int num2){
        return num1-num2;
    }

    /**
     * M�todo que devuelve el producto de una multiplicaci�n.
     * @param num1 El parametro num1, define uno de los numeros que se multiplicar�.
     * @param num2 El parametro num2, define el otro numero que se multiplicar�.
     * @return El producto de la multiplicaci�n.
     */
    public int multiplication(int num1, int num2){
        return num1*num2;
    }

    /**
     * M�todo que devuelve el resultado de una divisi�n.
     * @param num1 El parametro num1, define el numero que hace las veces de dividendo.
     * @param num2 El parametro num2, define el numero que hace las veces de divisor.
     * @return El resultado de la divisi�n.
     */
    public double split(int num1, int num2){
        return num1/num2;
    }
}