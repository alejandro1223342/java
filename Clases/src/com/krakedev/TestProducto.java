package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Productos productoA;
		Productos productoB;
		Productos productoC;

		productoA = new Productos();
		productoB = new Productos();
		productoC = new Productos();

		// Primer Producto
		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Pa quitar el dolor";
		productoA.precio = 19;
		productoA.stockActual = 10;

		// Segundo Producto
		productoB.nombre = "LEMON FLU";
		productoB.descripcion = "Pa quitar la gripe";
		productoB.precio = 30;
		productoB.stockActual = 30;

		// Tercer Producto
		productoC.nombre = "Zitotec";
		productoC.descripcion = "Pa quitar el estres";
		productoC.precio = 40;
		productoC.stockActual = 40;

		System.out.println("el primer producto es " + productoA.nombre + " con descripcion " + productoA.descripcion
				+ " de precio " + productoA.precio + " con stock " + productoA.stockActual);

		System.out.println("el segundo producto es " + productoB.nombre + " con descripcion " + productoB.descripcion
				+ " de precio " + productoB.precio + " con stock " + productoB.stockActual);

		System.out.println("el tercer producto es " + productoC.nombre + " con descripcion " + productoC.descripcion
				+ " de precio " + productoC.precio + " con stock " + productoC.stockActual);

	}

}
