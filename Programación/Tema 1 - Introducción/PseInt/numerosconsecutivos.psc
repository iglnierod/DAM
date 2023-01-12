Algoritmo numerosconsecutivos
    Definir num1, num2, num3 Como Entero
    Escribir "Escribe 3 numeros"
    Leer num1, num2, num3
	Si num1<>num2 o num1<>num3 o num2<>num3 Entonces
		Si num1+1=num2 y num2+1=num3 Entonces
			
			Escribir"son consecutivos"
		SiNo
			Si num1-1=num2 y num2-1=num3 Entonces
				Escribir "Son Consecutivos"
			SiNo
				Escribir "No son consecutivos"
			FinSi
		FinSi
	SiNo 
		Escribir "ERROR"
	FinSi
FinAlgoritmo
