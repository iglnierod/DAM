Algoritmo DibujarX
	
	Definir dim Como Entero
	Definir fila, columna Como Entero
	Escribir "Introduzca la dimensión: " Sin Saltar
	Leer dim
	fila<-1
	columna<-1
	Dimension valores[fila,columna]
	aux<-dim+1
	
	Para fila<-1 Hasta dim Hacer
		para columna<-1 Hasta dim Hacer
				Si fila=columna o fila+columna=aux Entonces
					Escribir " X " Sin saltar
				SiNo
					Escribir " · " Sin saltar
				FinSi
		FinPara
		Escribir ""
	FinPara
	
	
	
	
	
	
	
FinAlgoritmo
