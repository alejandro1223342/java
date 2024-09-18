package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculadora c1 = new Calculadora();

		int sumaUno;

		sumaUno = c1.sumar(5, 3);

		int restaUno;
		restaUno = c1.restar(4, 2);

		System.out.println("El resultado de la suma es es " + sumaUno);

		System.out.println("El resultado de la resta es " + restaUno);

	}

}
