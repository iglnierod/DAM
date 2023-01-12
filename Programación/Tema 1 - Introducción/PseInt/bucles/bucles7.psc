Algoritmo bucles7
	Definir a,b,c,x,sol Como Real
	Escribir "a*x^2+b*x+c"
	Escribir "Ingrese la a: " Sin Saltar
	Leer a
	Escribir a,"*x","^2+b*x+c"
	Escribir "Ingrese la b: " Sin Saltar
	Leer b
	Escribir a,"*x","^2+",b,"*",x,"+c"
	Escribir "Ingrese la c: " Sin Saltar
	Leer c
	Escribir a,"*x^2+",b,"*",x,"+",c
	Repetir
		Escribir "Ingrese la x: " Sin Saltar
		Leer x
		Si x<>99 Entonces
			sol=a*x^2+b*x+c
			Escribir a," * ",x,"^2+ ",b," * ",x," + ",c," = ",sol
		FinSi
	Hasta Que x=99
FinAlgoritmo
