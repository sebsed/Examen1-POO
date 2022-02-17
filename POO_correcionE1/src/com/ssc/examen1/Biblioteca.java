package com.ssc.examen1;

/**
 * Clase donde se puede crear una nueva biblioteca
 * @author Sebastián Sedano Castañeda
 *
 */
public class Biblioteca {
	
	public String nombre;
	public String direccion;
	private Estudiante estudiantes[];
	private Profesor profesores[];
	private int no_estudiantes = 0;
	private int no_profesores = 0;
	
	/**
	 * Constructor para objeto de tipo biblioteca
	 * @param nombre
	 * @param direccion
	 */
	Biblioteca(String nombre, String direccion){
		this.direccion = direccion;
		this.nombre = nombre;
	}

	/**
	 * Método para agregar un nuevo estudiante al conjunto de usuarios
	 * @param nombre
	 * @param edad
	 * @param cuenta
	 * @param semestre
	 * @param promedio
	 */
	public void agregarEstudiante(String nombre, String cuenta, int semestre) {
		Estudiante est = new Estudiante();
		est.setNombre(nombre);
		est.setCuenta(cuenta);
		est.setSemestre(semestre);
		estudiantes[no_estudiantes] = est;
		no_estudiantes++;
	}
	
	/**
	 * Método para agregar un nuevo profesor al conjunto de usuarios
	 * @param nombre
	 * @param edad
	 * @param cuenta
	 * @param antiguedad
	 * @param departamento
	 */
	public void agregarProfesor(String nombre, String cuenta, String departamento) {
		Profesor prof = new Profesor();
		prof.setNombre(nombre);
		prof.setCuenta(cuenta);
		prof.setDepartamento(departamento);
		profesores[no_profesores] = prof;
		no_profesores++;
	}
	
	/**
	 * Método para imprimir en terminal los datos de los estudiantes.
	 */
	public void imprimirEstudiantes() {
		int i = 0;
		for(i = 0; i < this.no_estudiantes; i++) {
			System.out.println("*** Estudiante "+(i+1)+": ***");
			System.out.println("Nombre: "+estudiantes[i].getNombre());
			System.out.println("Cuenta: "+estudiantes[i].getCuenta());
			System.out.println("Semestre: "+estudiantes[i].getSemestre());
			System.out.println("Libros prestados: "+estudiantes[i].getPrestamo());
			System.out.println("Semanas con préstamo: "+estudiantes[i].getSemanas());	
		}
	}
	
	/**
	 * Método para imprimir en terminal los datos de los profesores.
	 */
	public void imprimirProfesores() {
		int i = 0;
		for(i = 0; i < this.no_profesores; i++) {
			System.out.println("*** Profesor "+(i+1)+": ***");
			System.out.println("Nombre: "+profesores[i].getNombre());
			System.out.println("Cuenta: "+profesores[i].getCuenta());
			System.out.println("Departamento: "+profesores[i].getDepartamento());
			System.out.println("Libros prestados: "+profesores[i].getPrestamo());
			System.out.println("Semanas con préstamo: "+profesores[i].getSemanas());	
		}
	}
	
}
