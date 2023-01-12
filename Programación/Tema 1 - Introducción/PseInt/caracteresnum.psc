//Introducir un número y devolver cuántos caracteres tiene
Algoritmo caracteresnum
	Definir num Como Entero
	Definir cadnum Como Caracter
	
	Escribir "Introduzca un número:"
	Leer num
	num<-ABS(num)
	cadNum<-ConvertirATexto(num)
	Escribir num,"tiene una longitud de: ",Longitud(cadNum)," caracteres"
FinAlgoritmo
