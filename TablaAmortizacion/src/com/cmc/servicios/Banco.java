package com.cmc.servicios;

import java.util.ArrayList;
import com.cmc.entidades.Cliente;
import com.cmc.evaluacion.Prestamo;

public class Banco {
    private ArrayList<Cliente> clientes;
    private ArrayList<Prestamo> prestamos;

    public Banco() {
        this.clientes = new ArrayList<>();
        this.prestamos = new ArrayList<>();
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void registrarCliente(Cliente cliente) {
        // Evitar registros duplicados
        for (Cliente c : clientes) {
            if (c.getCedula().equals(cliente.getCedula())) {
                System.out.println("Cliente ya registrado: " + cliente.getNombre());
                return;
            }
        }
        clientes.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    public void asignarPrestamo(String cedula, Prestamo prestamo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCedula().equals(cedula)) {
                prestamos.add(prestamo);
                System.out.println("Préstamo asignado a " + cliente.getNombre() + " " + cliente.getApellido());
                return;
            }
        }
        System.out.println("Cliente no encontrado: " + cedula);
    }

    public ArrayList<Prestamo> buscarPrestamos(String cedula) {
        ArrayList<Prestamo> prestamosCliente = new ArrayList<>();
        for (Prestamo prestamo : prestamos) {
            // Suponemos que en un sistema real se vincularía el préstamo a un cliente
            prestamosCliente.add(prestamo);
        }
        return prestamosCliente.isEmpty() ? null : prestamosCliente;
    }
}
