
/**
 * Write a description of class Multiplicacion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Multiplicacion
{
    // instance variables - replace the example below with your own
    public int multiplicarSumando(int multiplicando, int multiplicador) {
    
        int resultado;
        if (multiplicador > 1) {
            resultado = multiplicando + multiplicarSumando(multiplicando, multiplicador - 1);
        } else {
            resultado = multiplicando;
        }
        
        return resultado;
    }
}
