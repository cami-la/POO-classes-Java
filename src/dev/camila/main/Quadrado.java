package dev.camila.main;

/*
Classe Quadrado:
Crie uma classe que modele um quadrado:
Atributos: Tamanho do lado.
Métodos: Mudar valor do Lado, Retornar valor do Lado e calcular Área.
 */
public class Quadrado extends Retangulo {

    @Override
    public double calculaArea() {
        return Math.pow(this.getLadoA(), 2);
    }
}
