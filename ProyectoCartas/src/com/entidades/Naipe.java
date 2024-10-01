package com.entidades;

import java.util.ArrayList;

public class Naipe {
    // Atributos
    private ArrayList<Numero> numerosPosibles;
    private ArrayList<Carta> cartas;

    // Constructor vacío
    public Naipe() {
        numerosPosibles = new ArrayList<>();
        cartas = new ArrayList<>();

        // Agregar los 13 números del naipe
        numerosPosibles.add(new Numero("A", 11));
        numerosPosibles.add(new Numero("2", 2));
        numerosPosibles.add(new Numero("3", 3));
        numerosPosibles.add(new Numero("4", 4));
        numerosPosibles.add(new Numero("5", 5));
        numerosPosibles.add(new Numero("6", 6));
        numerosPosibles.add(new Numero("7", 7));
        numerosPosibles.add(new Numero("8", 8));
        numerosPosibles.add(new Numero("9", 9));
        numerosPosibles.add(new Numero("10", 10));
        numerosPosibles.add(new Numero("J", 10));
        numerosPosibles.add(new Numero("Q", 10));
        numerosPosibles.add(new Numero("K", 10));

        // Instanciar un objeto de Palos para usar sus valores
        Palos palos = new Palos();

        // Crear todas las combinaciones de números y palos
        for (Numero numero : numerosPosibles) {
            cartas.add(new Carta(numero, palos.getCorazonRojo())); // Corazón Rojo
            cartas.add(new Carta(numero, palos.getCorazonNegro())); // Corazón Negro
            cartas.add(new Carta(numero, palos.getDiamante())); // Diamante
            cartas.add(new Carta(numero, palos.getTrebol())); // Trébol
        }
    }

    // Método bajarar para mezclar las cartas
    public ArrayList<Carta> bajarar() {
        ArrayList<Carta> auxiliar = new ArrayList<>();

        // Realizamos 100 iteraciones para intentar barajar las cartas aleatoriamente
        for (int i = 0; i < 100; i++) {
            int posicion = Random.obtenerPosicion();  // Obtener una posición aleatoria
            Carta carta = cartas.get(posicion);  // Obtener la carta en esa posición

            // Si la carta no ha sido barajada (estado = "N"), la añadimos a auxiliar
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");  // Cambiamos su estado a barajado ("C")
            }
        }

        // Validamos si quedaron cartas sin agregar (estado "N") y las añadimos al final
        for (Carta carta : cartas) {
            if (carta.getEstado().equals("N")) {
                auxiliar.add(carta);
                carta.setEstado("C");  // Aseguramos que el estado sea "C"
            }
        }

        // Reiniciamos el estado de las cartas en el mazo original para la próxima vez que se barajen
        for (Carta carta : cartas) {
            carta.setEstado("N");
        }

        return auxiliar;  // Retornamos las cartas barajadas
    }

    // Método getter para obtener las cartas
    public ArrayList<Carta> getCartas() {
        return cartas;
    }
}
