package com.krakedev;

public class Rectangulo {
//atributos de la clase rectangulo
	public int base;
	public int altura;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int calcularArea() {
		int area;

		area = base * altura;

		return area;

	}

	public double calcularPerimetro() {

		int perimetro;

		perimetro = (base * 2) + (altura * 2);

		return perimetro;
	}

}
