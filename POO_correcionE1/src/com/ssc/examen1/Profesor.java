package com.ssc.examen1;

/**
 * Clase con métodos y atributos de profesor 
 * @author Sebastián Sedano Castañeda
 *
 */
public class Profesor extends Usuario{
	
	private int antiguedad;
	private String departamento;
	
	/**
	 * Método para realizar préstamo a nombre de profesor
	 * @param no_libros
	 * @param semanas
	 */
	public void prestamo(int no_libros, int semanas){
		if(no_libros>5){
			System.out.println("No se puede prestar mas de 5 libros");
		}
		else{
			if(semanas>2){
				System.out.println("No se puede prestar mas de 2 semanas");
			}
			else{
				this.setPrestamo(no_libros);
				this.setSemanas(semanas);
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
	
	/********** SETTERS Y GETTERS **********/
	public int getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
}
