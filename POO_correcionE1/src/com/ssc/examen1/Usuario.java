package com.ssc.examen1;

/**
 * Clase para definir usuario
 * @author Sebastián Sedano Castañeda
 *
 */
public class Usuario {
	
	private String nombre;
	private int edad;
	private int cuenta;
	private int libros_prestados;
	private int semanas;
	private Estudiante estudiantes[];
	private Profesor profesores[];
	private int no_estudiantes = 0;
	private int no_profesores = 0;
	
	/**
	 * Método para agregar un nuevo estudiante al conjunto de usuarios
	 * @param nombre
	 * @param edad
	 * @param cuenta
	 * @param semestre
	 * @param promedio
	 */
	public void agregarEstudiante(String nombre, int edad, int cuenta, int semestre, int promedio) {
		Estudiante est = new Estudiante();
		est.setNombre(nombre);
		est.setCuenta(cuenta);
		est.setEdad(edad);
		est.setSemestre(semestre);
		est.setPromedio(promedio);
		estudiantes[no_estudiantes] = est;
		no_estudiantes++;
	}
	
	/**
	 * Método para agregar un nuevo profedor al conjunto de usuarios
	 * @param nombre
	 * @param edad
	 * @param cuenta
	 * @param antiguedad
	 * @param departamento
	 */
	public void agregarProfesor(String nombre, int edad, int cuenta, int antiguedad, String departamento) {
		Profesor prof = new Profesor();
		prof.setNombre(nombre);
		prof.setCuenta(cuenta);
		prof.setEdad(edad);
		prof.setAntiguedad(antiguedad);
		prof.setDepartamento(departamento);
		profesores[no_profesores] = prof;
		no_profesores++;
	}
	
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCuenta() {
		return cuenta;
	}

	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
}
