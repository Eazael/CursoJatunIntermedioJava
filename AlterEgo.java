
/**
 * Ejericio Nro 9 de la practica 1 de Recursividad
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class AlterEgo
{
    public int obtenerNumeroInverso(int numero)
    {
        return invertirNumero(numero, 0);
    }

    
    private int invertirNumero(int numero, int numeroInvertido)
    {
        int digitoActual = numero % 10;
        int numeroActualizado = numero / 10;
        numeroInvertido = numeroInvertido * 10 + digitoActual;
        if (numeroActualizado != 0) {
            numeroInvertido = invertirNumero(numeroActualizado, numeroInvertido);
        }
        return numeroInvertido;
            
    }
}
