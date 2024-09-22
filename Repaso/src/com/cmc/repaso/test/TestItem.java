package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Item item = new Item();
		Item item2 = new Item();

		
		item.setNombre("Coquita");

		item.setProductosActuales(30);
        item.setProductosDevueltos(1);
        item.setProductosVendidos(10);

        item.imprimir();

        item.vender(5);

        item.imprimir();

        item.devolver(5);

        item.imprimir();
        
        item2.setNombre("Camisa");
        item2.setProductosActuales(100);
        item2.setProductosDevueltos(5);
        item2.setProductosVendidos(20);

        item2.imprimir();

        item2.vender(10);

        item2.imprimir();

		item2.devolver(5);

		item2.imprimir();

		
		

	}

}
