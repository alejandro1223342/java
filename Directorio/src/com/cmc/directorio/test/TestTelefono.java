package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Telefono telf = new Telefono("movi","09941234123",10);
		String operadora=telf.getOperadora();
		String numero=telf.getNumero();
		int codigo=telf.getCodigo();
		
		System.out.println(operadora+" "+numero+" "+codigo);

	}

}
