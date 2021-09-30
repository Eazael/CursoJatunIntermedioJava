
/**
 * Ejercicio 4 de fractales
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class TrianguloSierpinski
{
    public int calcularTrianguloSierpinski(int nivel)
    {
        if (nivel == 1) {
            return 1;
        } else {
            return calcularTrianguloSierpinski(nivel - 1) + 4 * (int) Math.pow(3, nivel - 2); 
        }
    }
}
