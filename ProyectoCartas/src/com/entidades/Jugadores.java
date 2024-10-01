package com.entidades;

import java.util.ArrayList;

public class Jugadores {
    // Atributo que almacena los nombres de los jugadores
    private ArrayList<String> nombresJugadores;

    // Constructor
    public Jugadores() {
        nombresJugadores = new ArrayList<>();
    }

    // Getters y Setters
    public ArrayList<String> getJugadores() {
        return nombresJugadores;
    }

    public void setJugadores(ArrayList<String> jugadores) {
        this.nombresJugadores = jugadores;
    }
}
