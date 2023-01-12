Algoritmo bucles16
	
	Definir numCad Como caracter
	Definir num,suma,aux como entero
	
	Escribir "Introduzca un número:"
	Leer numCad
	Repetir
		aux=0
		Para i<-1 Hasta Longitud(numCad) Hacer //Esto divide el numero en digitos y los suma
			suma<-ConvertirANumero((Subcadena(numCad,i,i)))
			aux<-aux+suma
		FinPara 
		numCad<-Convertiratexto(aux) //Hace falta para volver a empezar el For con otro numero >10
	Hasta que aux<=9
	Si aux=9 Entonces
		Escribir "Es múltiplo de 9"
	Sino 
		Escribir "No es múltiplo de 9"
	FinSi
FinAlgoritmo
