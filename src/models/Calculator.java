package models;
/**
 * Esta clase define cada uno de los metodos usados por una calculadora (Sumar, restar, multiplicar y dividir). 
 * @author: Manuel C. Rojas, Luis S. Parra, Pedro J. Neira
 * @version:  05/09/2022/A
 */

public class Calculator {

    /**
     * Metodo que devuelve el resultado de la suma de dos o mas numeros.
     * @param num1 El parametro num1, define uno de los numeros que se sumará.
     * @param num2 El parametro num2, define el otro numero que se sumará.
     * @return El resultado de la suma.
     */
    public int sum(int num1, int num2){
        return num1+num2;
    }

    /**
     * Método que devuelve el resultado de la sustracción entre dos o mas numeros.
     * @param num1 El parametro num1, define uno de los numeros que se restará.
     * @param num2 El parametro num2, define el otro numero que se restará.
     * @return El resultado de la sustraccíon.
     */
    public int subtraction(int num1, int num2){
        return num1-num2;
    }

    /**
     * Método que devuelve el producto de una multiplicación.
     * @param num1 El parametro num1, define uno de los numeros que se multiplicará.
     * @param num2 El parametro num2, define el otro numero que se multiplicará.
     * @return El producto de la multiplicación.
     */
    public int multiplication(int num1, int num2){
        return num1*num2;
    }

    /**
     * Método que devuelve el resultado de una división.
     * @param num1 El parametro num1, define el numero que hace las veces de dividendo.
     * @param num2 El parametro num2, define el numero que hace las veces de divisor.
     * @return El resultado de la división.
     */
    public double split(int num1, int num2){
        return num1/num2;
    }
}