package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo r1= new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		r1.base=10;
		r1.altura=5;
		
		r2.base=8;
		r2.altura=3;
		
		int resultado=r1.calcularArea();
		int resultado2=r2.calcularArea();
		
		System.out.println("Resultado: "+ resultado);
		System.out.println("Resultado: "+ resultado2);


	}

}
