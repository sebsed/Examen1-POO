package com.ssc.examen1;

/**
 * Clase con métodos y atributos de estudiante
 * @author Sebastián Sedano Castañeda
 *
 */
public class Estudiante extends Usuario {
	
	private int semestre;
	private int promedio;
	
	/**
	 * Método para realizar préstamo a nombre de estudiante
	 * @param no_libros
	 * @param semanas
	 */
	public void prestamo(int no_libros, int semanas){
		if(no_libros>3){
			System.out.println("No se puede prestar mas de 3 libros");
		}
		else{
			if(semanas>1){
				System.out.println("No se puede prestar mas de 1 semana");
			}
			else{
				this.setPrestamo(no_libros);
				this.setSemanas(semanas);
			}
		}
	}
	
	/**
	 * Método para realizar devolución a nombre de estudiante
	 * @param no_libros
	 */
	public void devolucion(int no_libros){
		if(no_libros == this.getPrestamo()){
			System.out.println("Devolucion concretada");
			this.setPrestamo(0);
			this.setSemanas(0);
		}
		else{
			System.out.println("Es necesario devolver todo");
		}
	}

	public int getSemestre() {
		return semestre;
	}

	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}

	public int getPromedio() {
		return promedio;
	}

	public void setPromedio(int promedio) {
		this.promedio = promedio;
	} 
	
}
