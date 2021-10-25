package dev.camila.test;

import dev.camila.main.Bola;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/*
Classe Bola: Crie uma classe que modele uma bola.
Atributos: Cor, circunferência, material.
Métodos: trocaCor e mostraCor.
*/
class BolaTest {

    private Bola bola;

    @BeforeEach
    void start(){
        this.bola = new Bola("laranja", 55.5, "plástico");
    }

    @Test
    void deveraTrocarACorDaBola(){
        bola.trocaCor("rosa");

        assertEquals("rosa", bola.getCor());
    }

    @Test
    void deveraMostrarACorDaBola(){
        String corAtual = bola.mostraCor();

        assertEquals(corAtual, bola.getCor());
    }


}