package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Ciudad;
import com.krakedev.persistencia.servicios.AdminCiudad;

public class TestAdminCiudad {
	public static void main(String[] args) {
		try {
			AdminCiudad.insertar(new Ciudad(11,"MUNICIPIO CTM"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el sistema: "+e.getMessage());
		}
		//System.out.println("inserta");

	}

}
