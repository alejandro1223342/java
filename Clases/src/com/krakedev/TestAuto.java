package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto a1 = new Auto();
		
		Auto a2 = new Auto();
		
		//Primer Auto
		
		a1.marca="Chevrolet";
		a1.anio=1997;
		a1.precio=1999;
		
		//Segundo Auto
		
		a2.marca="Nissan";
		a2.anio=2000;
		a2.precio=3000;
		
		System.out.println("El primer auto es: " + a1.marca +" del año "+a1.anio+" con precio "+a1.precio);
		System.out.println("El segundo auto es: " + a2.marca +" del año "+a2.anio+" con precio "+a2.precio);

		

	}

}
