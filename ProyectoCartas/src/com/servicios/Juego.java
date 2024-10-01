package com.servicios;

import java.util.ArrayList;
import com.entidades.Carta;
import com.entidades.Naipe;

public class Juego {
    // Atributos
    private Naipe naipe;
    private ArrayList<Carta> naipeBarajado;
    private ArrayList<ArrayList<Carta>> cartasJugadores;
    private ArrayList<String> jugadores;

    // Constructor que recibe la lista de jugadores
    public Juego(ArrayList<String> jugadores) {
        this.jugadores = jugadores;
        naipe = new Naipe();  // Instancia un nuevo Naipe
        naipeBarajado = naipe.bajarar();  // Baraja el naipe y guarda el resultado en naipeBarajado
        cartasJugadores = new ArrayList<>();  // Inicializa el ArrayList de cartasJugadores

        // Inicializar cartas para cada jugador
        for (int i = 0; i < jugadores.size(); i++) {
            cartasJugadores.add(new ArrayList<>());
        }
    }

    // Método getter para cartasJugadores
    public ArrayList<ArrayList<Carta>> getCartasJugadores() {
        return cartasJugadores;
    }

    // Método entregarCartas
    public void entregarCartas(int cartasPorJugador) {
        // Repartir cartas en secuencia
        int cartaActual = 0;
        for (int i = 0; i < cartasPorJugador; i++) {
            for (int j = 0; j < jugadores.size(); j++) {
                // Añadir una carta a cada jugador
                cartasJugadores.get(j).add(naipeBarajado.get(cartaActual));
                cartaActual++;
            }
        }
    }

    // Método devolverTotal para obtener la suma de las cartas de un jugador
    public int devolverTotal(int jugadorIndex) {
        int total = 0;
        for (Carta carta : cartasJugadores.get(jugadorIndex)) {
            total += carta.getNumero().getValor();
        }
        return total;
    }

    // Método determinarGanador sin parámetros
    public String determinarGanador() {
        int idGanador = 0;
        int sumaGanador = devolverTotal(0);

        // Comparar el puntaje de los demás jugadores
        for (int i = 1; i < cartasJugadores.size(); i++) {
            int sumaActual = devolverTotal(i);
            if (sumaActual > sumaGanador) {
                idGanador = i;
                sumaGanador = sumaActual;
            }
        }

        // Retornar el nombre del jugador ganador
        return jugadores.get(idGanador);
    }
}
