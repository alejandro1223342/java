package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("Mario", "Benedetti", 50));
		admin.agregar(new Persona("Paula", "Muñoz", 15));
		admin.agregar(new Persona("Alejandro", "Muñoz", 21));
		admin.imprimir();

		
		System.out.println("-------------");	
		
		Persona p1=admin.buscarPorNombre("Javier");
		
		if(p1!=null) {
			System.out.println(p1.getApellido()+" "+p1.getEdad());

		}else {
			
			System.out.println("No existe la persona");
		}
		
		System.out.println("-------------");	

		ArrayList<Persona> personasMayores= admin.buscarMayores(5);
		
		System.out.println(personasMayores.size());
		

	}

}
