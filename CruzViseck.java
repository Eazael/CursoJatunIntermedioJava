
/**
 * Ejercicio 5 de fractales
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class CruzViseck
{
    public int cruzViseck(int nivel)
    {
        if (nivel == 1) {
            return 4;
        } else {
            return cruzViseck(nivel -1) + 8 * (int) Math.pow(5, nivel - 2);
        }
    }
}
