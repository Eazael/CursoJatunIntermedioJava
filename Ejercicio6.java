import java.util.Stack;
/**
 * Ejercicio 6 de la practica 2
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Ejercicio6
{
    public String verificarOrdenLlaves(String cadenaDeLlaves) {
        boolean esOrdenCorrecto = esOrdenCorrectoDeLlaves(cadenaDeLlaves);
        return esOrdenCorrecto ? "Símbolos balanceados" : "No tiene balance";
    } 
    
    private boolean esOrdenCorrectoDeLlaves(String cadenaDeLlaves) {
        Stack<Character> llavesApertura = new Stack<Character>();
        for (int i = 0; i < cadenaDeLlaves.length(); i++) {
            Character caracterActual = cadenaDeLlaves.charAt(i);
            if (caracterActual == '{' || caracterActual == '[' || caracterActual == '(') { 
                llavesApertura.push(caracterActual);
            } else if (caracterActual == ')') {
                if (llavesApertura.pop() != '(') {
                    return false;
                }
            } else if (caracterActual == ']') {
                if (llavesApertura.pop() != '[') {
                    return false;
                }
            } else if (caracterActual == '}') {
                if (llavesApertura.pop() != '{') {
                    return false;
                }
            }
        }
        return llavesApertura.empty();
    }
}
