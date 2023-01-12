Algoritmo operacion_2numeros
	Definir num1, num2 Como Real
	Definir op Como Caracter
	Definir result Como Real
	Escribir "Escriba el primer número:"
	Leer num1
	Escribir "Escriba el operador:"
	Leer op
	Escribir "Escriba el segundo número:"
	Leer num2
	Si op="+" Entonces
		result=num1+num2
		Escribir num1," ",op," ",num2," = ",result
	Sino 
		Si op="-" Entonces
			result=num1-num2
			Escribir num1," ",op," ",num2," = ",result
		SiNo
			Si op="*" Entonces
				result=num1*num2
				Escribir num1," ",op," ",num2," = ",result
			Sino 
				Si op="/" y num2=0
					Entonces 
					Escribir "ERROR"
				Sino 
					result=num1/num2
					Escribir num1," ",op," ",num2," = ",result
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
