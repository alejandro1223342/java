package com.krakedev.persistencia.entidades;

public class Ciudad {

	private int ciu_id;
	private String nombre;

	public Ciudad() {

	}

	public Ciudad(int ciu_id, String nombre) {
		super();
		this.ciu_id = ciu_id;
		this.nombre = nombre;
	}

	public int getCiu_id() {
		return ciu_id;
	}

	public void setCiu_id(int ciu_id) {
		this.ciu_id = ciu_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ciudad [ciu_id=" + ciu_id + ", nombre=" + nombre + "]";
	}
	
	

}
