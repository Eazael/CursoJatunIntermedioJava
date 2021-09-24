
/**
 * Ejercicio 3 de la practica de la unidad 1
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class ContarDigitosPares
{

    public int contarDigitosPares(int numero)
    {
        int resultado;
        int digitoActual = numero % 10;
        int numeroActualizado = numero / 10;
        if (digitoActual % 2 == 0) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        if (numeroActualizado > 0) {
            resultado += contarDigitosPares(numeroActualizado);
        } 
        return resultado;
    }
}
