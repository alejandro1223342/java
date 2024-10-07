package com.krakedev.Excepciones;

public class Ejercicio1 {
	public static void main(String[] args) {
			String a= "xxx";
			System.out.println("inicio");

			try {
				a.substring(3);
				System.out.println("fin");


			} catch (Exception e) {
				System.out.println("Entra al cartch");
			}finally {
				System.out.println("Ingresa al finally");
				System.out.println("CIERRA LA CONEXION BDD");

			}
			System.out.println("Fuera del catch");

	}
}
