package com.entidades;

public class Numero {
    // Atributos
    private String numeroCarta;
    private int valor;

    // Constructor
    public Numero(String numeroCarta, int valor) {
        this.numeroCarta = numeroCarta;
        this.valor = valor;
    }

    // Getters y Setters
    public String getNumeroCarta() {
        return numeroCarta;
    }

    public void setNumeroCarta(String numeroCarta) {
        this.numeroCarta = numeroCarta;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println(numeroCarta + "-" + valor);
    }
}
