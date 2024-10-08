package com.krakedev.persistencia.entidades;

public class Municipio {

	private int mun_id;
	private String nombre;
	private Ciudad ciu_id;

	public Municipio() {

	}

	public Municipio(int mun_id, String nombre, Ciudad ciu_id) {
		super();
		this.mun_id = mun_id;
		this.nombre = nombre;
		this.ciu_id = ciu_id;
	}

	public int getMun_id() {
		return mun_id;
	}

	public void setMun_id(int mun_id) {
		this.mun_id = mun_id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad getCiu_id() {
		return ciu_id;
	}

	public void setCiu_id(Ciudad ciu_id) {
		this.ciu_id = ciu_id;
	}

	@Override
	public String toString() {
		return "Municipio [mun_id=" + mun_id + ", nombre=" + nombre + ", ciu_id=" + ciu_id + "]";
	}

}
