package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Validacion validacion= new Validacion();
		
		boolean val=validacion.validarMonto(12);
		System.out.println(val);

	}

}
