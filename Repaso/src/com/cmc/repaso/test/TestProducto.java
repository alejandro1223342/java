package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto produ = new Producto("Coquita",19);
		
		double descuento=produ.calcularPrecioPromo(10);
		
		produ.setPrecio(-10);
		
		System.out.println(produ.getPrecio());
		
		System.out.println(descuento);
		

	}

}
