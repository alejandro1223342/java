package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Estudiante;
public class TestEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estudiante estudiante = new Estudiante("Alejandro");
		
		String estu=estudiante.Calificar(10);
		
		System.out.println(estu);
		

	}

}
