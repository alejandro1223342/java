package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telf1 = new Telefono("movi","0989650479",10);
		Telefono telf2 = new Telefono("claro","0994434857",11);
		Telefono telf3 = new Telefono("movi","0998625563",12);
		Telefono telf4 = new Telefono("claro","0123456789",13);


		AdminTelefono at = new AdminTelefono();
		
		int tf=at.contarMovi(telf1, telf2, telf3);
		
		System.out.println(tf);
		
		int tf2 = at.contarClaro(telf1, telf2, telf3, telf4);
		
		System.out.println(tf2);

	}

}
