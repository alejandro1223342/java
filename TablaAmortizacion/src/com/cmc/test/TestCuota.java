package com.cmc.test;

import com.cmc.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;
		
public class TestCuota {
    public static void main(String[] args) {
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion calculadoraAmortizacion = new CalculadoraAmortizacion();
        double cuota = calculadoraAmortizacion.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
