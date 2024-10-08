package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Ciudad;
import com.krakedev.persistencia.entidades.Municipio;
import com.krakedev.persistencia.servicios.AdminMunicipio;

public class TestAdminMunicipio {
	public static void main(String[] args) {
		Ciudad ciu = new Ciudad(11,"CIUDAD CTM");
		AdminMunicipio.insertar(new Municipio(11,"MUNICIPIO CTM",ciu));
	}
}
