package krakedev.entidades;

public class Nota {
    private Materia materia;
    private double calificacion;

    public Nota(Materia materia, double calificacion) {
        this.materia = materia;
        this.calificacion = calificacion;
    }

    public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Materia getMateria() {
        return materia;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método mostrar para Nota
    public void mostrar() {
        System.out.println("Nota [materia=" + materia.getCodigo() + ", calificacion=" + calificacion + "]");
    }
}
