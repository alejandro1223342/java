package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
    private ArrayList<Estudiante> estudiantes;

    public Curso() {
        this.estudiantes = new ArrayList<>();
    }
    
    

    public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}



	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}



	// Método para buscar estudiante por cédula
    public Estudiante buscarEstudiantePorCedula(String cedula) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getCedula().equals(cedula)) {
                return estudiante;
            }
        }
        System.out.println("No se encontró el estudiante con la cédula: " + cedula);
        return null;
    }

    // Método para matricular estudiantes
    public void matricularEstudiante(Estudiante estudiante) {
        if (buscarEstudiantePorCedula(estudiante.getCedula()) == null) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante matriculado.");
        } else {
            System.out.println("El estudiante ya está matriculado.");
        }
    }

    // Método para calcular el promedio del curso
    public double calcularPromedioCurso() {
        double sumaPromedios = 0;
        for (Estudiante estudiante : estudiantes) {
            sumaPromedios += estudiante.calcularPromedioNotasEstudiante();
        }
        return (estudiantes.size() > 0) ? sumaPromedios / estudiantes.size() : 0;
    }

    // Método mostrar para Curso
    public void mostrar() {
        System.out.println("Curso [Total estudiantes=" + estudiantes.size() + "]");
        for (Estudiante estudiante : estudiantes) {
            estudiante.mostrar();
        }
    }
}

