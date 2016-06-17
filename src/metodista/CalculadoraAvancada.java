
package metodista;

import sun.security.util.Length;

/**
 *
 * @author Felipe Rodrigues Gil 248543
 * Calculadora para contar, decompor e transformar para binario.
 */
public class CalculadoraAvancada {
    
    public int contarDigitos(int numero){
        String resultado = String.valueOf(numero);
            return resultado.length();
    }
    public int decomporNumero(int digitos) {
        String sDigitos = String.valueOf(digitos);
        int resultado;

        do {
            int maximo = sDigitos.length();
            int contador = 0;
            resultado = 0;
            
            while (contador < maximo) {
                char op = sDigitos.charAt(contador);

                resultado += Integer.parseInt("" + op);

                contador++;
            }
            
            sDigitos = String.valueOf(resultado);
            
        } while(String.valueOf(resultado).length() != 1); 
        
        return resultado; 
    }
    
    public String converterParaBinario(int numero) {
        return Integer.toBinaryString(numero);
    }
    
    
}
        
