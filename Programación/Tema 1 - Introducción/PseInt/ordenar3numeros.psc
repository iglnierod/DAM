Algoritmo ordenar3numeros
	Definir a,b,c como enteros
	Escribir "Escriba tres números"
	Leer a,b,c
	Si a<b y b<c Entonces
		Escribir a," < ",b," < ",c
	SiNo
		Si a<c y c<b Entonces
			Escribir a," < ",c," < ",b
		Sino
			Si b<a y a<c Entonces
				Escribir b," < ",a," < ",c
			SiNo
				Si b<c y c<a Entonces
					Escribir b," < ",c," < ",a
				SiNo
					Si c<a y a<b Entonces
						Escribir c," < ",a," < ",b
					Sino 
						Escribir c," < ",b," < ",a
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
