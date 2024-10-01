package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	private Date fechaModificacion;

	// Constructor
	public Directorio() {
		this.contactos = new ArrayList<>();
		this.correctos = new ArrayList<>();
		this.incorrectos = new ArrayList<>();
	}

	
	
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}



	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}



	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}



	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}



	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}



	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}



	public Date getFechaModificacion() {
		return fechaModificacion;
	}



	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}



	// Método para agregar contacto
	public boolean agregarContacto(Contacto contacto) {
		if (buscarPorCedula(contacto.getCedula()) == null) {
			contactos.add(contacto);
			this.fechaModificacion = new Date(); // Actualizar la fecha de modificación
			return true;
		}
		return false; // No agrega si la cédula ya existe
	}

	// Método para buscar contacto por cédula
	public Contacto buscarPorCedula(String cedula) {
		for (Contacto contacto : contactos) {
			if (contacto.getCedula().equals(cedula)) {
				return contacto;
			}
		}
		return null; // Retorna null si no encuentra el contacto
	}

	// Método para consultar la última modificación
	public String consultarUltimaModificacion() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return sdf.format(fechaModificacion);
	}

	public int contarPerdidos() {
		int contador = 0;
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() == null) {
				contador++;
			}
		}
		return contador;
	}

	public int contarFijos() {
		int contador = 0;
		for (Contacto contacto : contactos) {
			for (Telefono telefono : contacto.getTelefonos()) {
				if ("Convencional".equals(telefono.getTipo()) && "C".equals(telefono.getEstado())) {
					contador++;
					break; // Salir del loop interno si encontramos un teléfono convencional
				}
			}
		}
		return contador;
	}

	public void depurar() {
		for (Contacto contacto : contactos) {
			if (contacto.getDireccion() != null) {
				correctos.add(contacto);
			} else {
				incorrectos.add(contacto);
			}
		}
		contactos.clear(); // Vaciar la lista de contactos
	}
}
