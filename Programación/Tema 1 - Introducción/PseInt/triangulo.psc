Algoritmo triangulo
	Definir lado1,lado2,lado3,max Como Real
	Leer lado1,lado2,lado3
	Si (lado1+lado2)<lado3 o (lado1+lado3)<lado2 o (lado3+lado2)<lado1 Entonces
		Escribir "ERROR"
	SiNo
		Si lado1=lado2 y lado2=lado3 Entonces
			Escribir "Es equilátero"
		SiNo
			Si lado1<>lado2 y lado2<>lado3 y lado1<>lado3 Entonces
				Escribir "Es escaleno"
			SiNo
				Escribir "Es isósceles"
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo