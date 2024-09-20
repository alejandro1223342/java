package com.krakedev.test;

import com.krakedev.Rectangulo;

;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		r1.setBase(10);
		r1.setAltura(5);;
		
		r2.setBase(8);
		r2.setAltura(3);
		
		int resultado=r1.calcularArea();
		int resultado2=r2.calcularArea();
		
		double resultadoPerimetro=r2.calcularPerimetro();
		
		System.out.println("Area Rectangulo 1: "+ resultado);
		System.out.println("Area Rectangulo 2: "+ resultado2);
		
		System.out.println("---------------------");
		System.out.println("Perimetro Rectangulo 2: "+ resultadoPerimetro);

		
		


	}

}
