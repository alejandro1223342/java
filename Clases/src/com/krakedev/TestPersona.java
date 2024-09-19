package com.krakedev;

public class TestPersona {

	// Clase ejecutable metodo main

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. Declaro una variable llamada p de tipo persona
		Persona p;

		// 2.Instanciar un objeto Persona, refeciarlo con p
		p = new Persona();
		Persona p2 = new Persona();

		// 3. Accedo a los atributos
		System.out.println("nombre " + p.getNombre());
		System.out.println("edad " + p.getEdad());
		System.out.println("estatura " + p.getEstatura());

		System.out.println("*********");
		// 4.Modificar los Atributos
		p.setNombre("Alejandro");
		p.setEdad(21);
		p.setEstatura(1.75);

		// Accedo a los atributos
		System.out.println("nombre " + p.getNombre());
		System.out.println("edad " + p.getEdad());
		System.out.println("estatura " + p.getEstatura());

		p2.setNombre("Angelina");
		System.out.println("*********");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre " + p2.getNombre());

	}

}
