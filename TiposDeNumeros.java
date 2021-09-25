
/**
 * Solucion al ejericio 11 de la practica 1 de recursividad
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class TiposDeNumeros
{

    public String sampleMethod(int numero)
    {
        int sumaDivisores = calcularSumaDeDivisores(numero, 0);
        String tipoDeNumero;
        if (sumaDivisores == numero) {
            tipoDeNumero = "Numero Perfecto";
        } else if (sumaDivisores < numero) {
            tipoDeNumero = "Numero Defectivo";
        } else {
            tipoDeNumero = "Numero Abundante";
        }
        return tipoDeNumero;
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
