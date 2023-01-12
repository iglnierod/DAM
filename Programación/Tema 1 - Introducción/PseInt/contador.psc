//contador en segundos
Algoritmo contador
	Definir cont,max Como Entero
	cont<-0
	Escribir "Hasta cuánto quieres que cuente el reloj (en segundos): "Sin Saltar
	Leer max
	Borrar Pantalla
	Mientras cont<max hacer
		Escribir "Te quedan ",max-cont," segundos"
		Esperar 1 Segundos
		cont<-cont+1
		Borrar Pantalla
	FinMientras
	Escribir "Se acabó el tiempo"
FinAlgoritmo
