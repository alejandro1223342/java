package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.Date;

import com.krakedev.persistencia.entidades.Proyecto;
import com.krakedev.persistencia.servicios.AdminProyecto;
import com.krakedev.persistencia.utils.Convertidor;

public class TestAdminProyecto {
	public static void main(String[] args) {
		java.util.Date fechaInicio=null;
		java.util.Date fechaEntrega=null;
		// Pasa el proyecto inicializado al método insertar
		Proyecto proy = new Proyecto(4, "Proyecto CTM", new BigDecimal("10000.00"),fechaInicio,fechaEntrega);

		
		try {
			fechaInicio=Convertidor.convertirFecha("2024/01/15");
			proy.setFecha_inicio(fechaInicio);
			System.out.println(proy.getFecha_inicio());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			fechaEntrega=Convertidor.convertirFecha("2023/12/01");
			proy.setFecha_entrega(fechaEntrega);
			System.out.println(proy.getFecha_entrega());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
		
		AdminProyecto.insertar(proy);


		System.out.println("inserta");

	}
}
