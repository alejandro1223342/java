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
		
		
		System.out.println("--------------------------");
		
		double resultadoMulti;
		double resultadoDividir;
		double resultadoPromedio;
		
		resultadoMulti=c1.multiplicar(5, 2);
		resultadoDividir=c1.dividir(8,4);
		resultadoPromedio=c1.promediar(8, 9, 10);
		
		System.out.println("La multiplicacion es "+resultadoMulti);
		System.out.println("La division es "+resultadoDividir);
		System.out.println("El promedio es "+resultadoPromedio);
		
		
		c1.mostrarResultado();

	}

}
