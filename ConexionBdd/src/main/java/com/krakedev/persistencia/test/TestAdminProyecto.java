package com.krakedev.persistencia.test;
import java.math.BigDecimal;
import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminProyecto {
    public static void main(String[] args) {
        java.util.Date fechaInicio = null;
        java.util.Date fechaEntrega = null;
        Proyecto proy = null;

        try {
            // Convertir las fechas antes de crear el proyecto
            fechaInicio = Convertidor.convertirFecha("2024/01/15");
            fechaEntrega = Convertidor.convertirFecha("2023/12/01");

            // Inicializar el proyecto con las fechas convertidas
            proy = new Proyecto(6, "Proyecto CTM", new BigDecimal("10000.00"), fechaInicio, fechaEntrega);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al inicializar el proyecto: " + e.getMessage());
        }

        // Intentar insertar el proyecto en la base de datos
        try {
            AdminProyecto.insertar(proy);
            System.out.println("Proyecto insertado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al insertar el proyecto: " + e.getMessage());
        }
    }
}
