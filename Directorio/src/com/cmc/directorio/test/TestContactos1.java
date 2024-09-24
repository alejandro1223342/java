package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","0989650479",12);
		Telefono telf2 = new Telefono("movi","0994434857",13);
		AdminContacto ad = new AdminContacto();
		
		Contacto c1 = new Contacto("Muñoz",telf,12.5);
		Contacto c2 = new Contacto("Puetate",telf2,13.5);
		
		Contacto masPesado=ad.buscarMasPesado(c1, c2);
		boolean resultadoOperadoras=ad.comprarOperadoras(c1, c2);
		
        System.out.println("El contacto más pesado es: " + masPesado.getApellido() + " con peso: " + masPesado.getPeso());
        System.out.println(resultadoOperadoras);



	}

}
