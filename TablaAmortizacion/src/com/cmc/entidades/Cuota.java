package com.cmc.entidades;

public class Cuota {
    private int numero;
    private double cuota;
    private double capitalAlInicio;
    private double interes;
    private double abonoCapital;
    private double saldo;

    public Cuota(int numero) {
        this.numero = numero;
    }

    // Getters y Setters
    public int getNumero() {
        return numero;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getCapitalAlInicio() {
        return capitalAlInicio;
    }

    public void setCapitalAlInicio(double capitalAlInicio) {
        this.capitalAlInicio = capitalAlInicio;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getAbonoCapital() {
        return abonoCapital;
    }

    public void setAbonoCapital(double abonoCapital) {
        this.abonoCapital = abonoCapital;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void mostrarCuota() {
        System.out.printf("%d | %.2f | %.2f | %.2f | %.2f | %.2f%n", 
                          numero, cuota, capitalAlInicio, interes, abonoCapital, saldo);
    }
}
