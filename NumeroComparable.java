
/**
 * Ejercicio 4 iniciañ
 * 
 * @author Christian Felipe Virreira Scholvin 
 * @version 1.0
 */
public class NumeroComparable implements Comparable<NumeroComparable>
{
    // instance variables - replace the example below with your own
    private int valorActual;
    
    public void setValor(int valor)  {
        valorActual = valor;
    }
    
    public int getValor() {
        return valorActual;
    }

    /**
     * Constructor for objects of class NumeroComparable
     */
    public NumeroComparable(int valorInicial)
    {
        valorActual = valorInicial;
    }

    
    public int compareTo(NumeroComparable otroValor)
    {
        if (valorActual % 2 == 1 && otroValor.getValor() % 2 == 0) {
            return -1;
        } else if ((valorActual % 2 == 1 && otroValor.getValor() % 2 == 1)
        || (valorActual % 2 == 0 && otroValor.getValor() % 2 == 0)) {
            return compararValoresNormales(valorActual, otroValor.getValor());
        } else {
            return 1;
        }
    }
    
    private int compararValoresNormales(int valor1, int valor2) {
        if (valor1 < valor2) {
            return -1;
        } else if (valor1 == valor2) {
            return 0;
        } else {
            return 1;
        }
    }
}
