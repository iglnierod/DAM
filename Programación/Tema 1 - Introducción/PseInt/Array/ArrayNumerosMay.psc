Algoritmo ArrayNumerosMay
	
	Definir numElementos Como Entero
	Definir datos,may,may2 como reales
	
	Escribir "Introduzca la cantidad de elementos: " Sin Saltar
	Leer numElementos
	
	Dimension datos[numElementos]
	
	para i<-1 hasta numElementos Hacer
		Escribir "Elemento ",i, ": " Sin Saltar
		Leer datos[i]
	FinPara
	
	Para i<-1 Hasta numElementos Hacer
		Si datos[i]>may Entonces
			may2<-may
			may<-datos[i]
		SiNo
			Si datos[i]>may2 Entonces
				may2<-datos[i]
			FinSi
		FinSi
	FinPara
	Escribir "El mayor es: ",may
	Escribir "El segundo mayor es: ",may2
FinAlgoritmo
