/**
 * Ejercicio 4 de la primera practica
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class NumerosMalvadosOdiosos
{
    public String determinarNumeroMalvadoUOdioso(int numero)
    {
        int cantidadUnos = contarUnos(numero);
        String resultado;
        if (cantidadUnos % 2 == 0) {
            resultado = "Malvado";
        } else {
            resultado = "Odioso";
        }
        return resultado;
    }
    
    private int contarUnos(int numero) {
        int cantidadUnos = numero % 10;
        int numeroActualizado = numero / 10;
        if (numeroActualizado > 0) {
            cantidadUnos += contarUnos(numeroActualizado);
        }
        return cantidadUnos;
    }
}
