package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;

public class TestEliminarProyecto {
	 public static void main(String[] args) {
	        // Crear un proyecto que se eliminará
	        Proyecto proy = null;
	        
	      	        try {
	            proy = new Proyecto(5);

	            AdminProyecto.eliminar(proy);
	            System.out.println("Proyecto eliminado con éxito.");
	        } catch (Exception e) {
	            e.printStackTrace();
	            System.out.println("Error al eliminar el proyecto: " + e.getMessage());
	        }
	    }
}
