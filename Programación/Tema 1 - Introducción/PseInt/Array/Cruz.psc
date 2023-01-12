Algoritmo Cruz
	
	Definir dim Como Entero
	Definir fila, columna Como Entero
	Escribir "Introduzca la dimensión: " Sin Saltar
	Leer dim
	para fila<-1 hasta dim Hacer
		para columna<-1 hasta dim Hacer
			Si fila=trunc((dim/2)+1) o columna=trunc((dim/2)+1) Entonces
				Escribir " X " Sin Saltar
			SiNo
				Escribir " · " Sin Saltar
			FinSi
		FinPara
		Escribir ""
	FinPara
	
	
	
	
	
	
	
FinAlgoritmo
