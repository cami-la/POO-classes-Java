package dev.camila.test;

import dev.camila.main.Quadrado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class QuadradoTest {

    @Test
    void deveraCalcularAAreaDoQuadrado() {
        Quadrado quadrado = new Quadrado();

        quadrado.setLadoA(8d);
        quadrado.setLadoB(8d);

        double area = quadrado.calculaArea();

        assertEquals(64d, area);

    }

}