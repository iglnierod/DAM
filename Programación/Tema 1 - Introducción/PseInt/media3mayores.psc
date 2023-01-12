Algoritmo media3mayores
	Definir num1,num2,num3,num4,min Como Entero
	Leer num1,num2,num3,num4
	min=num1
	Si num2<min Entonces
		min=num2
	FinSi
	Si num3<min Entonces
		min=num3
	FinSi
	Si num4<min Entonces
		min=num4
	FinSi
	Escribir "La media es: ",((num1+num2+num3+num4)-min)/3
FinAlgoritmo
