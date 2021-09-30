
/**
 * Ejercicio 7 fractales 
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version (a version number or a date)
 */
public class EstrellaPentagrama
{

    public int calcularEstrellas(int nivel)
    {
        return calcularVertices(1, nivel, 0);
    }
    
    private int calcularVertices(int nivelActual, int maximoNivel, int valorNivelAnterior) {
        int resultado = 0;
        int siguienteNivel = nivelActual + 1;
        int valorNivelActual = 0;
        if (nivelActual == 1) {
            valorNivelActual = 1;
            resultado = valorNivelActual + calcularVertices(siguienteNivel, maximoNivel, valorNivelActual);
        } else if (nivelActual <= maximoNivel){
            valorNivelActual = ( 4 * valorNivelAnterior);
            resultado = valorNivelAnterior + valorNivelActual + calcularVertices(siguienteNivel, maximoNivel, valorNivelActual);
        }
        return resultado;
    }
}
