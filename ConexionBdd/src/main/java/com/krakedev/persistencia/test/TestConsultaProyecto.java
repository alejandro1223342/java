package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;

public class TestConsultaProyecto {
	public static void main(String[] args) {
		try {
			ArrayList<Proyecto> proyecto= AdminProyecto.buscarPorNombre("P");
			System.out.println(proyecto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
}
