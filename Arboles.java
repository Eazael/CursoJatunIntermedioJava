
/**
 * Ejercicio 6 fractales.
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Arboles
{
    
    public int calcularRamas(int nivel)
    {
        if (nivel == 1) {
            return 1;
        } else {
            return calcularRamas(nivel -1) + (int) Math.pow(2, nivel - 1);
        }
    }
}
