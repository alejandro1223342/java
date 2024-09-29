package com.clearminds.test;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaquinaDulces maquina = new MaquinaDulces();
		
		
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("B1"));
        maquina.agregarCelda(new Celda("B2"));
        maquina.agregarCelda(new Celda("C1"));
        maquina.agregarCelda(new Celda("C2"));

		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A1", 6);
		
		Producto producto3=new Producto("CCCC","COLA",0.90);
		maquina.cargarProducto(producto3, "A1", 6);
		
		Producto producto4=new Producto("DDDD","PEPSI",0.95);
		maquina.cargarProducto(producto4, "A1", 6);
		
		Producto producto5=new Producto("EEEE","FIORA",0.75);
		maquina.cargarProducto(producto5, "A1", 6);
		
		Producto producto6=new Producto("FFFF","FANTA",0.10);
		maquina.cargarProducto(producto6, "A1", 6);
		
		
		
		maquina.buscarMenores(0.75);
		
	}

}
