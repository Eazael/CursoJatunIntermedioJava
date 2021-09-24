
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
        int resultado = verificarDigitoPar(numero % 10);
        int numeroActualizado = numero / 10;
        if (numeroActualizado > 0) {
            resultado +=  contarDigitosPares(numeroActualizado);
        } 
        return resultado;
    }
    
    private int verificarDigitoPar(int digito) {
        return (digito % 2 == 0) ? 1 : 0;
    }
}
