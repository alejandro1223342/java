package com.cmc.repaso.entidades;

public class Item {

	private String nombre;

	private int productosActuales;

	private int productosDevueltos;

	private int productosVendidos;

	public void imprimir() {

		System.out.println(nombre);
		System.out.println(productosActuales);
		System.out.println(productosDevueltos);
		System.out.println(productosVendidos);

	}

	public void vender(int cantidadVendida) {
		if (cantidadVendida <= productosActuales && cantidadVendida > 0) {
			productosActuales -= cantidadVendida;
			productosVendidos += cantidadVendida;
		} else {
			System.out.println("No se pueden vender más productos de los disponibles o la cantidad es inválida.");
		}
	}


	public void devolver(int cantidadDevuelta) {
		if (cantidadDevuelta <= productosVendidos && cantidadDevuelta > 0) {
			productosActuales += cantidadDevuelta;
			productosVendidos -= cantidadDevuelta;
			productosDevueltos += cantidadDevuelta;
		} else {
			System.out.println("No se pueden devolver más productos de los vendidos o la cantidad es inválida.");
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getProductosActuales() {
		return productosActuales;
	}

	public void setProductosActuales(int productosActuales) {
		this.productosActuales = productosActuales;
	}

	public int getProductosDevueltos() {
		return productosDevueltos;
	}

	public void setProductosDevueltos(int productosDevueltos) {
		this.productosDevueltos = productosDevueltos;
	}

	public int getProductosVendidos() {
		return productosVendidos;
	}

	public void setProductosVendidos(int productosVendidos) {
		this.productosVendidos = productosVendidos;
	}

}
