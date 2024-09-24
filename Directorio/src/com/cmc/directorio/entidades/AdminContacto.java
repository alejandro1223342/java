package com.cmc.directorio.entidades;

public class AdminContacto {
	
	public Contacto buscarMasPesado(Contacto c1, Contacto c2) {
		
		if(c1.getPeso()>c2.getPeso()) {
			return c1;
		}else{
			return c2;
		}
		
	}
	
	public boolean comprarOperadoras(Contacto c1, Contacto c2) {
		
		if(c1.getTelefono().getOperadora()==c2.getTelefono().getOperadora()) {
			return true;
		}else if(c2.getTelefono().getOperadora()==c1.getTelefono().getOperadora()){
			return true;
		}else {
			return false;
		}
	}
	
	public void activarUsuario(Contacto c1) {
        if (c1.getTelefono().isTieneWhatsapp()) {
            c1.setActivo(true); 
        }
    }

}


