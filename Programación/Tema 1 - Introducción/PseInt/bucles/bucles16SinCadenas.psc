Algoritmo bucles16SinCadenas
	Definir num como real
	Escribir "Introduzca un numero"
	Leer num
	Repetir
		suma<-0
		Repetir
			decimal<-num%10
			num<-Trunc(num/10)
			suma<-suma+decimal
		Hasta Que num=0
		num<-suma
	Hasta Que suma<=9
	Si suma=9 Entonces
		Escribir "Es múltiplo de 9"
	Sino 
		Escribir "No es múltiplo de 9"
	FinSi	
FinAlgoritmo
