package com.krakedev.test;
import com.krakedev.Productos;
public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Productos productoA;
		Productos productoB;
		Productos productoC;

		productoA = new Productos("Paracetamol", "Pa quitar el dolor", 19, 10);
		productoB = new Productos("LEMON FLU", "Pa quitar la gripe", 30, 30);
		productoC = new Productos("Zitotec", "Pa quitar el estres", 40, 40);

		// Primer Producto
		/*
		 * productoA.setNombre("Paracetamol");
		 * productoA.setDescripcion("Pa quitar el dolor"); productoA.setPrecio(19);
		 * productoA.setStockActual(10);
		 * 
		 * // Segundo Producto productoB.setNombre("LEMON FLU");
		 * productoB.setDescripcion("Pa quitar la gripe"); productoB.setPrecio(30);
		 * productoB.setStockActual(30);
		 * 
		 * // Tercer Producto productoC.setNombre("Zitotec");
		 * productoC.setDescripcion("Pa quitar el estres"); productoC.setPrecio(40);
		 * productoC.setStockActual(40);
		 */
		
		System.out.println(
				"el primer producto es " + productoA.getNombre() + " con descripcion " + productoA.getDescripcion()
						+ " de precio " + productoA.getPrecio() + " con stock " + productoA.getStockActual());

		System.out.println(
				"el segundo producto es " + productoB.getNombre() + " con descripcion " + productoB.getDescripcion()
						+ " de precio " + productoB.getPrecio() + " con stock " + productoB.getStockActual());

		System.out.println(
				"el tercer producto es " + productoC.getNombre() + " con descripcion " + productoC.getDescripcion()
						+ " de precio " + productoC.getPrecio() + " con stock " + productoC.getStockActual());

	}

}
