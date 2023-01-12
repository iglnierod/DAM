Funcion esPrimo<-EsNumeroPrimo(n)
	Definir contador como entero
	contador<-2
	Mientras (num MOD contador <> 0) Hacer
		contador<-contador+1
		Escribir contador
	FinMientras
	
	esPrimo<-num=contador
	
	Si num=contador Entonces
		esPrimo<-Verdadero
	SiNo
		esPrimo<-Falso
	FinSi
Fin Funcion

Algoritmo omirp4
	Definir num Como Entero
	Escribir "Introduzca un número mayor que 1:"
	Leer num
	
	Escribir EsNumeroPrimo(num)
	
FinAlgoritmo
