Funcion resultado<-Potencia(base,exponente)
	Definir res como entero
	res<-1
	Para i<-1 Hasta exponente Hacer
		res <- res * base
	FinPara
	resultado <- res 
FinFuncion
Algoritmo ejemploFuncion2
	Definir base,e como entero
	Escribir "Introduzca base"
	Leer base
	Escribir "Introduzca exponente"
	Leer e
	Escribir "El resultado es:", Potencia(base,e)
FinAlgoritmo
//