
/**
 * Solucion al ejercicio 13 de la practica Nro 1 de recursividad
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class NumerosNovios
{
    
    public String sampleMethod(int numeroA, int numeroB)
    {
        int sumaDivisoresA = calcularSumaDeDivisores(numeroA, 0);
        int sumaDivisoresB = calcularSumaDeDivisores(numeroB, 0);
        
        return (sumaDivisoresA - 1 == numeroB) && (sumaDivisoresB - 1 == numeroA) ? "Son Novios" : "No pasa nada";
    }
    
    private int calcularSumaDeDivisores(int numero, int divisorAnterior) {
        int divisorActual = divisorAnterior + 1;
        int resultado = 0;
        if (divisorActual < numero) {
            resultado = numero % divisorActual == 0 ? divisorActual : 0;
            resultado += calcularSumaDeDivisores(numero, divisorActual);
        }
        return resultado;
    }
}
