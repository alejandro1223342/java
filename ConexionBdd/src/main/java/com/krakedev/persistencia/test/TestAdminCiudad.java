package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Ciudad;
import com.krakedev.persistencia.servicios.AdminCiudad;

public class TestAdminCiudad {
	public static void main(String[] args) {
		AdminCiudad.insertar(new Ciudad(11,"MUNICIPIO CTM"));
		System.out.println("inserta");

	}

}
