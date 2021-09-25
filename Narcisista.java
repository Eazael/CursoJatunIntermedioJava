
/**
 * Solucion al ejercicio 14 de la practica 1 de recursividad
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Narcisista
{
    public String calcularNarcisista(int numero)
    {
        int potencia = contarNumeroDigitos(numero);
        int sumaDigitosExponentes = sumarDigitosExponenetes(numero, potencia);
        return sumaDigitosExponentes == numero ? "Narcisista" : "Normal";
    }
    
    private int sumarDigitosExponenetes(int numero, int potencia) {
        int digitoActual = numero % 10;
        int numeroActualizado = numero / 10;
        int resultado = (int) Math.pow(digitoActual, potencia);
        if (numeroActualizado > 0) {
            resultado += sumarDigitosExponenetes(numeroActualizado, potencia);
        }
        return resultado;
    }
    
    private int contarNumeroDigitos(int numero) {
        int numeroDigitos = 1;
        int numeroActualizado = numero / 10;
        if (numeroActualizado > 0) {
            numeroDigitos += contarNumeroDigitos(numeroActualizado);
        }
        return numeroDigitos;
    }
}
