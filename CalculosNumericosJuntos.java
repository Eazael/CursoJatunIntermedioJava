
/**
 * Write a description of class CalculosNumericosJuntos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalculosNumericosJuntos
{
    
    private int calcularSumaDeDivisores(int numero, int divisorAnterior) {
        int divisorActual = divisorAnterior + 1;
        int resultado = 0;
        if (divisorActual < numero) {
            resultado = numero % divisorActual == 0 ? divisorActual : 0;
            resultado += calcularSumaDeDivisores(numero, divisorActual);
        }
        return resultado;
    }

    public String tiposDeNumeros(int numero)
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
    
    public String numerosNovios(int numeroA, int numeroB)
    {
        int sumaDivisoresA = calcularSumaDeDivisores(numeroA, 0);
        int sumaDivisoresB = calcularSumaDeDivisores(numeroB, 0);
        
        return (sumaDivisoresA - 1 == numeroB) && (sumaDivisoresB - 1 == numeroA) ? "Son Novios" : "No pasa nada";
    }
    
    public String verificarSiDosNumerosSonAmigos(int numeroA, int numeroB)
    {
        int sumaDivisoresA = calcularSumaDeDivisores(numeroA, 0);
        int sumaDivisoresB = calcularSumaDeDivisores(numeroB, 0);
        
        return sumaDivisoresA == numeroB && sumaDivisoresB == numeroA ? "Son amigos" : "NO son amigos";
    }
    
}
