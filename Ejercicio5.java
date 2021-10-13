import java.util.Stack;
/**
 * Ejercicio 5 de la practica 2
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Ejercicio5
{
    
    public String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        Stack<Character> caracteresDeLaCadena = new Stack<Character>();
        for (int i = 0; i < cadena.length(); i++) {
            caracteresDeLaCadena.push(cadena.charAt(i));
        }
        while (!caracteresDeLaCadena.empty()) {
            cadenaInvertida += caracteresDeLaCadena.pop();
        }
        return cadenaInvertida;
    }
    
}
