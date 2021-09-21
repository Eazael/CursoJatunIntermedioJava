
/**
 * La clase permite contar cuanto dígitos tiene un número natural, utilizando diferentes formas.
 * 
 * @author Christian Felipe Virreira Scholvin
 * @version 1.0.0
 */
public class ContadorDigitosNatural
{
    public int ContarDigitos(int numero) {
        int contador = 0;
        while (numero > 0) {
            ++contador;
            numero = numero / 10;
        }
        return contador;
    }
    
    public int ContarDigitosRecursivo(int numero) {
        if (numero > 0)
            return 1 + ContarDigitosRecursivo(numero / 10);
        return 0;
    }
    
}
