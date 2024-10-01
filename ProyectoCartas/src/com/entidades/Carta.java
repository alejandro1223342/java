package com.entidades;

public class Carta {
    // Atributos
    private Numero numero;
    private String palo;
    private String estado = "N"; // N = No barajado, C = Barajado

    // Constructor
    public Carta(Numero numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    // Getters y Setters
    public Numero getNumero() {
        return numero;
    }

    public void setNumero(Numero numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para mostrar la información
    public void mostrarInformacion() {
        System.out.println(numero.getNumeroCarta() + "-" + palo);
    }
}
