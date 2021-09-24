
/**
 * Write a description of class RecursividadIndirecta here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecursividadIndirecta
{
    public String RecursividadIndirecta(int numero)
    {
        int maximoDivisor = numero / 2;
        boolean esPrimo = calcularEsPrimo(numero, maximoDivisor, 2);
        String resultado = esPrimo ? "Es un número Primo" : "Es un número Compuesto";
        return resultado;
    }
    
    private boolean calcularEsPrimo(int numero, int maximoDivisor, int divisorActual) {
        boolean esPrimo = numero % divisorActual != 0;
        if (divisorActual <= maximoDivisor && esPrimo) {
            esPrimo = calcularEsPrimo(numero, maximoDivisor, divisorActual + 1);
        }
        return esPrimo;
    }
    
    public String RecursividadIndirecta2(int numero) {
        return verificarNumero(numero, 2);
    }
    
    private String verificarNumero(int numero, int cDiv) {
        String res;
        if (cDiv > (numero / 2)) {
            res = "Es un número Primo";
        } else {
            if (numero % cDiv == 0) {
                res = "Es un número Compuesto";
            } else {
                res = verificarNumero(numero, cDiv + 1);
            }
        }
        return res;
    }
}
