package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();
		
		
		c1.setLado(4);
		c2.setLado(6);
		c3.setLado(8);;
		
		double areaCUno = c1.calcularArea();
		double areaCDos = c2.calcularArea();
		double areaCTres = c3.calcularArea();
		
		double perimetroCUno = c1.calcularPerimetro();
		double perimetroCDos = c2.calcularPerimetro();
		double perimetroCTres = c3.calcularPerimetro();
		
		
		
		System.out.println("Area Cuadrado Uno :" + areaCUno);
		System.out.println("Area Cuadrado Dos :" + areaCDos);
		System.out.println("Area Cuadrado Tres :" + areaCTres);
		
		System.out.println("---------------");
		
		System.out.println("Perimetro Cuadrado Uno :" + perimetroCUno);
		System.out.println("Perimetro Cuadrado Dos :" + perimetroCDos);
		System.out.println("Perimetro Cuadrado Tres :" + perimetroCTres);
			
		

	}

}
