
/**
 * Write a description of class Factorial here.
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Factorial
{
    // instance variables - replace the example below with your own
    public int CalcularFactorialRecursivamente(int numero) {
        int resultado;
        
        if (numero > 1) {
            resultado = numero * CalcularFactorialRecursivamente(numero - 1);
        } else {
            resultado = 1;
        }
        return resultado;
    }
}
