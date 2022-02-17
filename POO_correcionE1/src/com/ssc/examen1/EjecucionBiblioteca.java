package com.ssc.examen1;

public class EjecucionBiblioteca {
	
	public static void main(String[]args) {
		//Objeto tipo biblioteca
		Biblioteca bib1 = new Biblioteca("José Vasconcelos","Eje 1 Nte., Buenavista");
		//Adición de un estudiante que solicite 2 libros por 1 semana 
		bib1.agregarEstudiante("Sebastián Sedano","A217516",4,2,1);
		//Adición de dos profesores
		//Profesora que solicita 4 libros en 2 semanas
		bib1.agregarProfesor("Renata Padilla","P34984","Fismat",4,2);
		//Profesor que solicita 6 libros en 3 semanas
		//Esta instancia se imprime con cero porque ha solicitado más de 5 libros
		bib1.agregarProfesor("Armando Domínguez","P44986","Humanidades",6,3);

		//Impresión de usuarios
		bib1.imprimirEstudiantes();
		bib1.imprimirProfesores();
	}
}