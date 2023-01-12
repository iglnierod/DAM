//test con el while
Algoritmo ejemplowhile
	Definir clave Como Caracter
	Escribir "introduzca su contraseña:" Sin Saltar
	Leer clave
	
	Mientras clave <> "hola" Hacer
		Escribir "Contraseña incorrecta, inténtelo de nuevo:" Sin Saltar	
		Leer clave
	FinMientras
	Borrar Pantalla
	Escribir "Bienvenido"
FinAlgoritmo
