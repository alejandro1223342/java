package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.entidades.Alarma;

public class AdminAlarmas {

	private ArrayList<Alarma> alarma;

	public ArrayList<Alarma> getAlarma() {
		return alarma;
	}

	public AdminAlarmas() {
		this.alarma = new ArrayList<>(); // Inicializa la lista
	}

	public Alarma agregarAlarma(Alarma alarma) {
		this.alarma.add(alarma); 
		return alarma;
	}

}
