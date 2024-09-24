package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf2 = new Telefono("movi", "0994434857", 13);
		Contacto c2 = new Contacto("Puetate", telf2, 13.5);
		AdminTelefono at = new AdminTelefono();

		at.activarMensajeria(telf2);


		boolean activo = c2.isActivo();

		System.out.println(activo);

		AdminContacto ad = new AdminContacto();
		ad.activarUsuario(c2);
		
		boolean activoFinal = c2.isActivo();
        System.out.println("Estado final activo: " + activoFinal);


	}

}
