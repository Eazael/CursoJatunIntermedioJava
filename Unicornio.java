
/**
 * Solucion al ejercicio 15 de la practica 1 de recursividad
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0
 */
public class Unicornio
{

    public String verificarNumeroUnicornio(int numero)
    {
        int cantidadDeDigitos = contarDigitos(numero);
        int digitosCentro = cantidadDeDigitos % 2 == 0 ? 2 : 1;
        int inicioPosicional = cantidadDeDigitos / 2;
        if (digitosCentro == 1) {
            ++inicioPosicional;
        }
        int sumaDigitos = sumaDigitosCentro(numero, 1, inicioPosicional, digitosCentro);
        return sumaDigitos % 3 == 0 ? "Numero Unicornio" : "Numero Normal";
        
    }
    
    private int sumaDigitosCentro(int numero, int posicionActual, int posicionInicialMedio, int digitosRestantesMedio) {
        int digitoActual = numero % 10;
        int numeroActualizado = numero / 10;
        int resultado = 0;
        if (posicionInicialMedio <= posicionActual) {
            --digitosRestantesMedio;
            resultado += digitoActual;
        }
        if (digitosRestantesMedio > 0) {
            resultado += sumaDigitosCentro(numeroActualizado, posicionActual + 1, posicionInicialMedio, digitosRestantesMedio);
        }
        return resultado;
    }
    
    private int contarDigitos(int numero) {
        int resultado = 1;
        int numeroActualizado = numero / 10;
        if (numeroActualizado > 0) {
            resultado += contarDigitos(numeroActualizado);
        }
        return resultado;
    }
}
