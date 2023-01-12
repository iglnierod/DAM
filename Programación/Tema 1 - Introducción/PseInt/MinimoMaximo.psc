Algoritmo MinimoMaximo
	Definir num1,num2,num3,num4,max,min Como Entero
	Leer num1,num2,num3,num4
	max=num1
	Si num2>max Entonces
		aux=num2
	FinSi
	Si num3>max Entonces
		aux=num3
	FinSi
	Si num4>max Entonces
		aux=num4
	FinSi
	min=num1
	Si min>num2 Entonces
		min=num2
	FinSi
	Si min>num3 Entonces
		min=num3
	FinSi
	Si min<num4
		min=num4
	FinSi
	Escribir max + min
FinAlgoritmo