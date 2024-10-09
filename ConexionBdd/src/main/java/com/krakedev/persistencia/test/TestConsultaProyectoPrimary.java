package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;

public class TestConsultaProyectoPrimary {
	public static void main(String[] args) {
		try {
			Proyecto proyecto=AdminProyecto.buscarLlavePrimaria(1);
			System.out.println(proyecto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

	}
}
