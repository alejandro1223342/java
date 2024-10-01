package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
    private String cedula;
    private String nombre;
    private String apellido;
    private Direccion direccion;
    private ArrayList<Telefono> telefonos;

    // Constructor
    public Contacto(String cedula, String nombre, String apellido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefonos = new ArrayList<>();

    }

    public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	// Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Método imprimir
    public void imprimir() {
        System.out.println("Cédula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: "+ apellido);

        if (direccion != null) {
            System.out.println("Dirección: ");
            System.out.println("Calle Principal: " + direccion.getCallePrincipal());

            System.out.println("Calle Secundaria: " + direccion.getCalleSecundaria());

        } else {
            System.out.println("Dirección: No asignada");
        }
    }
    
    public void agregarTelefono(Telefono telefono) {
        this.telefonos.add(telefono);
    }

    // Método para mostrar teléfonos en estado C
    public void mostrarTelefonos() {
        for (Telefono telefono : telefonos) {
            if ("C".equals(telefono.getEstado())) {
                System.out.println("Estado: "+telefono.getEstado()+" Teléfono: " + telefono.getNumero() + " Tipo: " + telefono.getTipo());

            }
        }
    }

    public ArrayList<Telefono> recuperarIncorrectos() {
        ArrayList<Telefono> incorrectos = new ArrayList<>();
        for (Telefono telefono : telefonos) {
            if ("E".equals(telefono.getEstado())) {
                incorrectos.add(telefono);
            }
        }
        return incorrectos;
    }
   
}
