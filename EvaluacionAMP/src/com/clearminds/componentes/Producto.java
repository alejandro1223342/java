package com.clearminds.componentes;

public class Producto {

	private String Nombre;

	private String Codigo;
	private double Precio;

	

	public Producto(String codigo,String nombre,double precio) {
		Nombre = nombre;
		Codigo = codigo;
		Precio = precio;

	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public void incrementarPrecio(int porcentajeIncremento) {
		double incremento = (Precio * porcentajeIncremento) / 100;

		this.Precio += incremento;
	}

	public void disminuirPrecio(double valorDescuento) {
		this.Precio = Precio - valorDescuento;

	}

}
