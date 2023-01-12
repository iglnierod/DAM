Funcion numInvertido <- InvertirNumero (num)
	Definir cadnum,c,cadnumInvertido Como Caracter
	
	cadnum<-ConvertirATexto(num)
	Para i<-1 Hasta Longitud(cadnum) Hacer
		c<-Subcadena(cadnum,i,i)
		cadnumInvertido<-Concatenar(cadnumInvertido,c)
	FinPara
	
	numInvertido<-ConvertirANumero(cadnumInvertido)
	
FinFuncion
	
Algoritmo omirp2
	Definir num Como Entero
	Escribir "Introduzca un número:"
	Leer num
	Escribir InvertirNumero(num)
	
FinAlgoritmo
