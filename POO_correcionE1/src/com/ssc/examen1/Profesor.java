package com.ssc.examen1;

/**
 * Clase con métodos y atributos de profesor 
 * @author Sebastián Sedano Castañeda
 *
 */
public class Profesor extends Usuario {
	
	private String departamento;
	
	/**
	 * Método para realizar préstamo a nombre de profesor
	 * @param no_libros
	 * @param semana
	 */
	public void prestamo(int no_libros, int semana){
		if(no_libros>5){
			System.out.println("No se puede prestar mas de 5 libros");
		}
		else{
			if(semana>2){
				System.out.println("No se puede prestar mas de 2 semanas");
			}
			else{
				this.setPrestamo(no_libros);
				this.setSemanas(semana);
			}
		}
	}
	
	/**
	 * Método para realizar devolución a nombre de profesor
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
	 * Método para obtener departamento al que pertenece profesor
	 * @return departamento
	 */
	public String getDepartamento() {
		return departamento;
	}

	/**
	 * Método para ingresar departamento al que pertenece el profesor
	 * @param departamento
	 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}