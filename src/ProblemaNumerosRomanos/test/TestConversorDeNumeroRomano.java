package ProblemaNumerosRomanos.test;

import ProblemaNumerosRomanos.code.ConversorDeNumeroRomano;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrei.andrade on 27/11/2015.
 */
public class TestConversorDeNumeroRomano {

    @Test
    public void deveEntenderOSinboloI(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        assertEquals(1, numero);
    }

    @Test
    public void deveEntenderDoisSimbolosComoII(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("II");
        assertEquals(2, numero);
    }

    @Test
    public void deveEntenderQuatroSimbolosDoisADoisComoXXII(){
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("XXII");
        assertEquals(22, numero);
    }

    @Test
    public void deveEntenderNumerosComoIX() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("IX");
        assertEquals(9, numero);
    }

    @Test
    public void deveEntenderNumerosComplexosComoXXIV() {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("XXIV");
        assertEquals(24, numero);
    }
}
