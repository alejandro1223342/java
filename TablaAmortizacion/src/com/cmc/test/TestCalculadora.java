package com.cmc.test;

import com.cmc.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCalculadora {
    public static void main(String[] args) {
        Prestamo prestamo = new Prestamo(5000, 12, 12);

        CalculadoraAmortizacion calculadoraAmortizacion2 = new CalculadoraAmortizacion();
		calculadoraAmortizacion2.generarTabla(prestamo);
        CalculadoraAmortizacion calculadoraAmortizacion = new CalculadoraAmortizacion();
		calculadoraAmortizacion.mostrarTabla(prestamo);
    }
}
