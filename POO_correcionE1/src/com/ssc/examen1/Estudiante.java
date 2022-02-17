package com.ssc.examen1;

/**
 * Clase con métodos y atributos de estudiante
 * @author Sebastián Sedano Castañeda
 *
 */
public class Estudiante extends Usuario {
	
	private int semestre;
	
	/**
	 * Método para realizar préstamo a nombre de estudiante
	 * @param no_libros
	 * @param semana
	 */
	public void prestamo(int no_libros, int semana){
		if(no_libros>3){
			System.out.println("No se puede prestar mas de 3 libros");
		}
		else{
			if(semana>1){
				System.out.println("No se puede prestar mas de 1 semana");
			}
			else{
				this.setPrestamo(no_libros);;
				this.setSemanas(semana);;
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

	/**
	 * Método para obtener semestre actual de estudiante
	 * @return semestre
	 */
	public int getSemestre() {
		return semestre;
	}

	/**
	 * Método para ingresar semestre actual del estudiante
	 * @param semestre
	 */
	public void setSemestre(int semestre) {
		this.semestre = semestre;
	}	
}