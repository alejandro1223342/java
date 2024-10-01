package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String apellido;
    private String cedula;
    private ArrayList<Nota> notas;

    
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public Estudiante(String nombre, String apellido, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.notas = new ArrayList<>();
    }

    // Método para agregar una nueva nota
    public void agregarNota(Nota nuevaNota) {
        for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(nuevaNota.getMateria().getCodigo())) {
                System.out.println("Ya existe una nota para esta materia.");
                return;
            }
        }
        if (nuevaNota.getCalificacion() < 0 || nuevaNota.getCalificacion() > 10) {
            System.out.println("La calificación debe estar entre 0 y 10.");
            return;
        }
        notas.add(nuevaNota);
    }

    // Método para modificar una nota
    public void modificarNota(String codigo, double nuevaCalificacion) {
        if (nuevaCalificacion < 0 || nuevaCalificacion > 10) {
            System.out.println("La calificación debe estar entre 0 y 10.");
            return;
        }

        for (Nota nota : notas) {
            if (nota.getMateria().getCodigo().equals(codigo)) {
                nota.setCalificacion(nuevaCalificacion);
                return;
            }
        }

        System.out.println("No se encontró una nota con el código de la materia.");
    }

    // Método para calcular el promedio de notas del estudiante
    public double calcularPromedioNotasEstudiante() {
        double suma = 0;
        for (Nota nota : notas) {
            suma += nota.getCalificacion();
        }
        return (notas.size() > 0) ? suma / notas.size() : 0;
    }

    // Método mostrar para Estudiante
    public void mostrar() {
        System.out.println("Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula + "]");
        for (Nota nota : notas) {
            nota.mostrar();
        }
    }
}

