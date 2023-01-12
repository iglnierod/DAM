Algoritmo ArrayRuletaAlu
	
	Definir numAlu Como Entero
	Definir alumnos Como Caracter
	
	Escribir "Introduzca la cantidad de alumnos: " Sin Saltar
	Leer numAlu
	
	Dimension alumnos[numAlu]
	
	Para i<-1 hasta numAlu Hacer
		Escribir "Introduzca el nombre del alumno/a: " Sin Saltar
		Leer alumnos[i]
	FinPara
	Escribir alumnos[Azar(numAlu+1)]
FinAlgoritmo
