
/**
 * Write a description of class DividirRestando here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DividirRestando
{
    public int dividirRestando(int dividendo, int divisor)
    {
        int resultado;
        if (dividendo < divisor) {
            resultado = 0;
        } else {
            resultado = 1 + dividirRestando(dividendo - divisor, divisor);
        }
        return resultado;
    }
}
