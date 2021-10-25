package dev.camila.main;

/*
Classe Retangulo:
Crie uma classe que modele um retangulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher).
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro.
*/
public class Retangulo {
    //atributos //private double ladoA, ladoB;
    private double ladoA;
    private double ladoB;

    //métodos getter and setter
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }


    public double calculaArea() {
        return this.ladoA * this.ladoB;
    }

    public double calculaPerimetro() {
        return 2 * (this.ladoA + this.ladoB);
    }
}
