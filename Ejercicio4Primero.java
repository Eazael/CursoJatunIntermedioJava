import java.util.*;
/**
 * Ejercicio 4 de la practica 2. El otro 4 es el 5 repetido
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Ejercicio4Primero
{
    private Queue<NumeroComparable> divisores;
    
    public Queue<NumeroComparable> encontrarDivisores(int numero) {
        divisores = new PriorityQueue<NumeroComparable>();
        for (int i= 1; i < numero /2; i++) {
            if (numero % i == 0) {
                divisores.offer(new NumeroComparable(i));
            }
        }
        return divisores;
    }
    
}
