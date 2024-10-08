package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Ciudad;
import com.krakedev.persistencia.entidades.Municipio;
import com.krakedev.persistencia.servicios.AdminMunicipio;

public class TestAdminMunicipio {
	public static void main(String[] args) {
		Ciudad ciu = new Ciudad(11,"CIUDAD CTM");
		try {
			AdminMunicipio.insertar(new Municipio(11,"MUNICIPIO CTM",ciu));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}
}
