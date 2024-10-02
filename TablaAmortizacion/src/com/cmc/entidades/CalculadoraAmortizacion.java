package com.cmc.entidades;

import com.cmc.evaluacion.Prestamo;
import java.util.ArrayList;

public class CalculadoraAmortizacion {
    private ArrayList<Cuota> tablaAmortizacion;

    public CalculadoraAmortizacion() {
        this.tablaAmortizacion = new ArrayList<>();
    }

    // Método para generar la tabla de amortización
    public void generarTabla(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        double tasaInteres = prestamo.getInteres() / 100 / 12; // Convertir porcentaje anual a mensual
        int plazo = prestamo.getPlazo();

        double cuota = calcularCuota(prestamo);

        double saldo = monto;

        for (int i = 1; i <= plazo; i++) {
            Cuota cuotaActual = new Cuota(i);
            double interes = saldo * tasaInteres;
            double abonoCapital = cuota - interes;
            saldo -= abonoCapital;

            cuotaActual.setCuota(cuota);
            cuotaActual.setCapitalAlInicio(saldo + abonoCapital); // Capital al inicio del mes
            cuotaActual.setInteres(interes);
            cuotaActual.setAbonoCapital(abonoCapital);
            cuotaActual.setSaldo(saldo > 0 ? saldo : 0); // Asegurar que el saldo no sea negativo

            tablaAmortizacion.add(cuotaActual);
        }
    }

    // Método para calcular la cuota
    public double calcularCuota(Prestamo prestamo) {
        double monto = prestamo.getMonto();
        double tasaInteres = prestamo.getInteres() / 100 / 12; // Convertir porcentaje anual a mensual
        int plazo = prestamo.getPlazo();

        // Fórmula de la cuota de un préstamo (cuota fija)
        return (monto * tasaInteres * Math.pow(1 + tasaInteres, plazo)) / (Math.pow(1 + tasaInteres, plazo) - 1);
    }

    // Método para mostrar la tabla de amortización
    public void mostrarTabla(Prestamo prestamo) {
        System.out.println("Tabla de Amortización para el préstamo de: " + prestamo.getMonto());
        System.out.printf("%-10s %-15s %-10s %-15s %-10s %-10s\n", "Cuota", "Capital Inicio", "Interés", "Abono Capital", "Saldo", "Cuota Total");
        for (Cuota cuota : tablaAmortizacion) {
            cuota.mostrarCuota();
        }
    }
}
