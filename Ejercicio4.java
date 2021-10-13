import java.util.*;
/**
 * Ejercicio 4 de la practica 2
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Ejercicio4
{
    private Queue<Persona> fila;
    private int totalEntradas;
    public Ejercicio4() {
        fila = new LinkedList<Persona>();
        totalEntradas = 100;
    }
    
    public String atenderCliente() {
        String resultado = "";
        if (fila.peek() == null) {
            resultado = "No existen clientes a atender";
        } else {
            Persona clienteActual = fila.poll();
            if (clienteActual.getEntradasRequeridas() <= totalEntradas) {
                totalEntradas -= clienteActual.getEntradasRequeridas();
                resultado = "Cliente atendido, se le vendieron " + clienteActual.getEntradasRequeridas() + " entradas, quedan: " + totalEntradas;
            } else {
                resultado = "Cliente no atendido, queria " + clienteActual.getEntradasRequeridas() + " entradas, pero solo habia " + totalEntradas;
            }
        }
        return resultado;
    }
    
    public void agregarAFila(Persona nueva) {
        fila.offer(nueva);
    }
    
    
}
