package com.krakedev.Excepciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
	public void metedo1() {

		String a = null;
		a.substring(0);

		// NPE UNCHECKED
	}

	public void metodo2() {
		File f = new File("archivo.txt");

		try {
			f.createNewFile();// IOException-CHECKED

		} catch (IOException io) {
			System.out.println("Error");
		}

	}

	//Propagar la excepcion
	public void metodo3() throws IOException{

		File f = new File("archivo.txt");

		f.createNewFile();// IOException-CHECKED
	}
	
	public void metodo4() throws IOException{
		metodo3();

		
	}
}
