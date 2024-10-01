package com.krakedev.evaluacion;

public class Direccion {
    private String callePrincipal;
    private String calleSecundaria;

    // Constructor
    public Direccion(String callePrincipal, String calleSecundaria) {
        this.callePrincipal = callePrincipal;
        this.calleSecundaria = calleSecundaria;
    }

    // Getters y Setters
    public String getCallePrincipal() {
        return callePrincipal;
    }

    public void setCallePrincipal(String callePrincipal) {
        this.callePrincipal = callePrincipal;
    }

    public String getCalleSecundaria() {
        return calleSecundaria;
    }

    public void setCalleSecundaria(String calleSecundaria) {
        this.calleSecundaria = calleSecundaria;
    }
}

