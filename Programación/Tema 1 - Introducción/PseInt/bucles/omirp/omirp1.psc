Algoritmo omirp1
	Definir num Como Entero
	Definir esPrimo Como Logico
	Escribir "Introduzca un número mayor que 1:"
	Leer num
	esPrimo<-Verdadero
	Para i<-2 hasta num-1 Con Paso 1 hacer
		si num MOD i = 0 Entonces
			esPrimo<-Falso
		FinSi
	FinPara
	Si esPrimo Entonces
		Escribir "Es primo"
	SiNo
		Escribir "No es primo"
	FinSi
	
	
FinAlgoritmo
