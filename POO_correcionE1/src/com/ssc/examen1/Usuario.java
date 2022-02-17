package com.ssc.examen1;

/**
 * Clase para crear un usuario de la biblioteca
 * @author Sebastián Sedano Castañeda
 *
 */
public class Usuario {
	
	private String nombre;
	private int cuenta;
	private int libros_prestados;
	private int semanas;
	
	/********** SETTERS Y GETTERS **********/
	public void setPrestamo(int libros) {
		this.libros_prestados = libros;
	}
	
	public int getPrestamo() {
		return libros_prestados;
	}
	
	public void setSemanas(int semanas) {
		this.semanas = semanas;
	}
	
	public int getSemanas() {
		return semanas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}

}