package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto a1 = new Auto("Chevy",1998,1999);
		
		Auto a2 = new Auto("Susuki",2001,2000);
		
		//Primer Auto
		
		/*a1.setMarca("Chevrolet");
		a1.setAnio(1997);
		a1.setPrecio(1999);
		
		//Segundo Auto
		
		a2.setMarca("Nissan");
		a2.setAnio(2000);
		a2.setPrecio(3000);
		*/
		
		System.out.println("El primer auto es: " + a1.getMarca() +" del año "+a1.getAnio()+" con precio "+a1.getPrecio());
		System.out.println("El segundo auto es: " + a2.getMarca() +" del año "+a2.getAnio()+" con precio "+a2.getPrecio());

		

	}

}
