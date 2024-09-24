package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContanco1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telf = new Telefono("movi", "0989650479", 12);
		
		Contacto c = new Contacto("Muñoz", telf, 24.5);
		
		String operadora=telf.getOperadora();
		String numero=telf.getNumero();
		int codigo=telf.getCodigo();
		
		String nombre=c.getApellido();
		double peso=c.getPeso();
		
		System.out.println(operadora + " "+numero+" "+codigo+" "+" "+nombre+" "+peso);

	}

}
