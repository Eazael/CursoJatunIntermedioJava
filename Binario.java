
/**
 * Solucion al ejercicio 10 de la primer practica de recursividada
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Binario
{
    
    public int calcularNumeroBinario(int numeroActual)
    {
        int numeroActualizado = numeroActual / 2;
        int resultado = numeroActual % 2;
        if (numeroActualizado > 0) {
            resultado = resultado + (calcularNumeroBinario(numeroActualizado) * 10);
        }
        return resultado;
    }
}
