package dev.camila.test;

import dev.camila.main.Retangulo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Classe Retangulo:
Crie uma classe que modele um retangulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher).
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro.
*/
class RetanguloTest {

    private Retangulo retangulo;

    @BeforeEach
    void start() {
        this.retangulo = new Retangulo();
        retangulo.setLadoA(5.0);
        retangulo.setLadoB(20d);
    }

    @Test
    void deveraCalcularAAreaDoRetangulo() {
        double area = retangulo.calculaArea();

        assertEquals(100d, area);
    }

    @Test
    void deveraCalcularOPerimetroDoRetangulo() {
        double perimetro = retangulo.calculaPerimetro();

        assertEquals(50d, perimetro);
    }

}