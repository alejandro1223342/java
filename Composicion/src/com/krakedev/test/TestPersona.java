package com.krakedev.test;

import com.krakedev.composicion.Persona;
import com.krakedev.composicion.Direccion;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Persona p1 = new Persona();

		p1.setNombre("Alejandro");
		p1.setApellido("Muñoz");

		Direccion dir = new Direccion();
		dir.setCallePrincipal("EL PEPE");
		dir.setCalleSecundaria("ETE SECH");
		dir.setNumero("473");
		p1.setDireccion(dir);

		String nombre = p1.getNombre();
		Direccion d1 = p1.getDireccion();

		System.out.println(nombre);
		System.out.println(d1.getCallePrincipal());

		p1.imprimir();

		Persona p2 = new Persona();
		Direccion d2= new Direccion("STEVES","JONSON","678");
		p2.setNombre("María");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("xx","yy","000"));
		
		p3.imprimir();

	}

}
