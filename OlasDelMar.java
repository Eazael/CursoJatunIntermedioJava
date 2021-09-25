
/**
 * Ejercicio 7 de la primera practica de recursividad directa
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class OlasDelMar
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class OlasDelMar
     */
    public String identificarTipoDeNumero(int numero)
    {
        return identificarSiEsCreciente(numero, 0) ? "Creciente" : "Hibrido";
    }
    
    private boolean identificarSiEsCreciente(int numero, int digitoALaDerecha) {
        int digitoActual = numero % 10;
        int numeroActualizado = numero / 10;
        boolean esCreciente = digitoActual > digitoALaDerecha;
        if (numeroActualizado != 0) {
            esCreciente = esCreciente && identificarSiEsCreciente(numeroActualizado, digitoActual);
        }
        return esCreciente;
    }
}
