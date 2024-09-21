package com.krakedev.demo.test;
import com.krakedev.demo.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Producto produ1 = new Producto(12,"COCA COLA");
		
		produ1.setPeso(11);
		produ1.setDescripcion("Muy rico");

		System.out.println("El producto con codigo "+produ1.getCodigo()+" de nombre "+produ1.getNombre()
		+" de desscripcion "+produ1.getDescripcion()+" con peso "+produ1.getPeso());

	}

}
