package dev.camila.main;

/*
Classe Bola: Crie uma classe que modele uma bola.
Atributos: Cor, circunferência, material.
Métodos: trocaCor e mostraCor.
*/
public class Bola {

    //atributos
    private String cor;
    private double circunferencia;
    private String material;

    //método construtor
    public Bola(String cor, double circunferencia, String material) {
        this.cor = cor;
        this.circunferencia = circunferencia;
        this.material = material;
    }

    //métodos getter e setter
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //método troca cor
    public void trocaCor(String cor) {
        this.cor = cor;
    }

    public String mostraCor() {
        return this.cor;
    }
}
