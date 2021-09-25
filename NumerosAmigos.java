
/**
 * Solucion al ejercicio 12 
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class NumerosAmigos
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class NumerosAmigos
     */
    public String verificarSiDosNumerosSonAmigos(int numeroA, int numeroB)
    {
        int sumaDivisoresA = calcularSumaDeDivisores(numeroA, 0);
        int sumaDivisoresB = calcularSumaDeDivisores(numeroB, 0);
        
        return sumaDivisoresA == numeroB && sumaDivisoresB == numeroA ? "Son amigos" : "NO son amigos";
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
