package com.cmc.evaluacion;

public class Prestamo {
    private double monto;
    private int plazo; // en meses
    private double interes; // tasa de interés

    public Prestamo(double monto, int plazo, double interes) {
        this.monto = monto;
        this.plazo = plazo;
        this.interes = interes;
    }

    public double getMonto() {
        return monto;
    }

    public double getInteres() {
        return interes;
    }

    public int getPlazo() {
        return plazo;
    }

    public void mostrarPrestamo() {
        System.out.println("Préstamo: Monto: " + monto + ", Plazo: " + plazo + " meses, Interés: " + interes + "%");
    }
}
