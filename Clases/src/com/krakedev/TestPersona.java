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
		System.out.println("nombre " + p.nombre);
		System.out.println("edad " + p.edad);
		System.out.println("estatura " + p.estatura);

		System.out.println("*********");
		// 4.Modificar los Atributos
		p.nombre = "Alejandro";
		p.edad = 21;
		p.estatura = 1.75;

		// Accedo a los atributos
		System.out.println("nombre " + p.nombre);
		System.out.println("edad " + p.edad);
		System.out.println("estatura " + p.estatura);

		p2.nombre = "Angelina";
		System.out.println("*********");
		System.out.println("p.nombre: " + p.nombre);
		System.out.println("p2.nombre " + p2.nombre);

	}

}
