//Realizar un algoritmo que permita calcular la suma de los números ingresados mientras que
//el valor acumulado no supere el valor 100. Mostrar el valor acumulado antes de superar 100
Algoritmo bucles1
	Definir num1,num2,num3,suma como real
	Escribir "Escriba dos números para sumarlos:"
	Leer num1,num2
	
	suma<-num1+num2
	
	Mientras suma<=100 Hacer
		Borrar Pantalla
		Escribir  suma
		Escribir "Escriba otro número para seguir sumando: " Sin Saltar
		Leer num3
		suma<-suma+num3
	FinMientras
	
FinAlgoritmo
