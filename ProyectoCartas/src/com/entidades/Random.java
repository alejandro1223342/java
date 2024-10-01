package com.entidades;

public class Random {
    // Método estático obtenerPosicion
    public static int obtenerPosicion() {
        // Multiplicamos Math.random() por 52 para obtener un número entre 0 y 51 incluidos
        return (int) (Math.random() * 52);
    }
}

