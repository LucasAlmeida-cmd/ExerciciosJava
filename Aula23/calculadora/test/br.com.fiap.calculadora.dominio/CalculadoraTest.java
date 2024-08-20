package br.com.fiap.calculadora.dominio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void testarASomaDeDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        double soma = calculadora.somar(1, 1);

        Assertions.assertEquals(2, soma);
    }
    @Test
    void testarASubtracaoDeDoisNumeros(){
        Calculadora calculadora =  new Calculadora();
        double subtracao = calculadora.subtrair(2, 1);
        Assertions.assertEquals(1, subtracao);
    }

    @Test
    void testarAMultiplicacaoDeDoisNumeros(){
        Calculadora calculadora =  new Calculadora();
        double multiplicacao = calculadora.multiplicar(2, 1);
        Assertions.assertEquals(2, multiplicacao);
    }

    @Test
    void testarADivisaoDeDoisNumeros(){
        Calculadora calculadora = new Calculadora();
        double divisao = calculadora.dividir(2, 2);
        Assertions.assertEquals(1, divisao);
    }

}
