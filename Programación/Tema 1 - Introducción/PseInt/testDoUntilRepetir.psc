//test con el Do/Until/Repetir (faltan errores) 
Algoritmo testDoUntilRepetir
	Definir usuario,clave Como Caracter 
	
	Repetir 
		Escribir "Introduzca el usuario: " Sin saltar 
		Leer usuario
		Escribir "Introduzca la contrase�a: " Sin Saltar 
		Leer clave
	Hasta Que usuario="Rodrigo" y clave="hola"
	Borrar Pantalla
	Escribir  "Bienvenido ", usuario
	
FinAlgoritmo
