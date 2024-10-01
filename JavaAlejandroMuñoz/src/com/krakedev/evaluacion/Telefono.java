package com.krakedev.evaluacion;

public class Telefono {
    private String numero;
    private String tipo;
    private String estado;

    // Constructor
    public Telefono(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;

        // Validar si los valores son correctos
        if (numero != null && tipo != null) {
            if ((tipo.equals("Movil") && numero.length() == 10) || 
                (tipo.equals("Convencional") && numero.length() == 7)) {
                this.estado = "C"; // Correcto
            } else {
                this.estado = "E"; // Error
            }
        } else {
            this.estado = "E"; // Error
        }
    }

    // Getters
    public String getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }
}

