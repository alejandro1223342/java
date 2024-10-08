package com.krakedev.persistencia.test;

import java.math.BigDecimal;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;
import com.krakedev.persistencia.utils.Convertidor;

public class TestActualizarProyecto {
	public static void main(String[] args) {
        java.util.Date fechaInicio = null;
        java.util.Date fechaEntrega = null;
        Proyecto proy = null;

        // Intentar modificar un proyecto existente
        try {
            // Cambiar las fechas para el proyecto que se quiere actualizar
            fechaInicio = Convertidor.convertirFecha("2024/02/01"); // Nueva fecha de inicio
            fechaEntrega = Convertidor.convertirFecha("2024/03/01"); // Nueva fecha de entrega
            
            // Crear un objeto Proyecto con los datos actualizados
            proy = new Proyecto(6, "Proyecto CTM Modificado", new BigDecimal("15000.00"), fechaInicio, fechaEntrega);
            
            // Intentar actualizar el proyecto en la base de datos
            AdminProyecto.actualizar(proy);
            System.out.println("Proyecto actualizado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al actualizar el proyecto: " + e.getMessage());
        }
    }
}
