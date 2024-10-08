package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Proyecto {
	private int proy_id;
	private String proyecto;
	private BigDecimal monto;
	private Date fecha_inicio;
	private Date fecha_entrega;

	public Proyecto() {

	}

	public Proyecto(int proy_id, String proyecto, BigDecimal monto, Date fecha_inicio, Date fecha_entrega) {
		super();
		this.proy_id = proy_id;
		this.proyecto = proyecto;
		this.monto = monto;
		this.fecha_inicio = fecha_inicio;
		this.fecha_entrega = fecha_entrega;
	}
	
	public Proyecto(int proy_id, String proyecto, BigDecimal monto) {
		super();
		this.proy_id = proy_id;
		this.proyecto = proyecto;
		this.monto = monto;
		
	}

	public int getProy_id() {
		return proy_id;
	}

	public void setProy_id(int proy_id) {
		this.proy_id = proy_id;
	}

	public String getProyecto() {
		return proyecto;
	}

	public void setProyecto(String proyecto) {
		this.proyecto = proyecto;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(Date fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	@Override
	public String toString() {
		return "Proyecto [proy_id=" + proy_id + ", proyecto=" + proyecto + ", monto=" + monto + ", fecha_inicio="
				+ fecha_inicio + ", fecha_entrega=" + fecha_entrega + "]";
	}

}
