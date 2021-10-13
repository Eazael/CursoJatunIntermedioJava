import java.util.Stack;
/**
 * Ejercicio 7 practica unidad 2
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Ejercicio7
{
    
    public String identificarNivelDeLlaves(String ingreso) {
        Stack<Integer> llavesAbiertas = new Stack<Integer>();
        int numeroLlaveActual = 0;
        String resultado = "";
        for (int i = 0; i < ingreso.length(); i++) {
            Character currentChar = ingreso.charAt(i);
            if (currentChar == '{') {
                llavesAbiertas.push(++numeroLlaveActual);
                resultado += numeroLlaveActual;
            } else if (currentChar == '}') {
                resultado += llavesAbiertas.pop();
            }
        }
        return resultado;
    }
}
