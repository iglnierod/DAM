Algoritmo ArrayBidimensional
	Definir numFilas, numColumnas Como Entero
	
	Escribir "Introduzca las filas: "
	Leer numFilas
	Escribir "Introduza las columnas: "
	Leer numColumnas
	
	Dimension valores[numFilas,numColumnas]
	
	Para fila<-1 Hasta numFilas Hacer
		para columna<-1 Hasta numColumnas Hacer
			//Escribir "[",fila,",",columna,"]" Sin Saltar
			valores[fila,columna]=AZAR(10)
		FinPara
	FinPara
	
	Para fila<-1 Hasta numFilas Hacer
		para columna<-1 Hasta numColumnas Hacer
			Escribir valores[fila,columna]," " Sin Saltar
		FinPara
		Escribir ""
	FinPara
FinAlgoritmo
