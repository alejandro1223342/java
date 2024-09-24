package com.clearminds.componentes;

public class Celda {

	private Producto Producto;
	
	private int Stock;
	
	private String Codigo;
	
	
	
	
	public Celda(String codigo) {
		
		Codigo = codigo;
	}



	public Producto getProducto() {
		return Producto;
	}



	public void setProducto(Producto producto) {
		Producto = producto;
	}



	public int getStock() {
		return Stock;
	}



	public void setStock(int stock) {
		Stock = stock;
	}



	public String getCodigo() {
		return Codigo;
	}



	public void setCodigo(String codigo) {
		Codigo = codigo;
	}



	public void ingresarProducto(Producto producto1,int stock) {
		this.Producto=producto1;
		this.Stock=stock;
		
	}
	
	
}


