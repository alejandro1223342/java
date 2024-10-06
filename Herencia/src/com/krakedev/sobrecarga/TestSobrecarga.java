package com.krakedev.sobrecarga;

import com.krakedev.herencia.Gato;

public class TestSobrecarga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gato miGato = new Gato();

		// Llamada al método maullar sin parámetros
		miGato.maullar();

		// Llamada al método maullar con adjetivo
		miGato.maullar("felizmente");

	}

}
