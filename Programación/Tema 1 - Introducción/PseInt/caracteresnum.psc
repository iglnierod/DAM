//Introducir un n�mero y devolver cu�ntos caracteres tiene
Algoritmo caracteresnum
	Definir num Como Entero
	Definir cadnum Como Caracter
	
	Escribir "Introduzca un n�mero:"
	Leer num
	num<-ABS(num)
	cadNum<-ConvertirATexto(num)
	Escribir num,"tiene una longitud de: ",Longitud(cadNum)," caracteres"
FinAlgoritmo
