Algoritmo ordenar3numeros2
	Definir a,b,c como enteros
	Escribir "Escriba tres números"
	Leer a,b,c
	Si c<a y c<b Entonces
		Si a>b y a>c Entonces
			Si b<c Entonces
				Escribir b," < ",c," < ",a
			Sino 
				Escribir c," < ",b," < ",a
			FinSi
		SiNo
			Si b>a y b>c Entonces
				Si a<c Entonces
					Escribir a," < ",c," < ",b
				Sino 
					Escribir c," < ",a," < ",b
				FinSi
			FinSi
		FinSi
	SiNo
		Si a<b Entonces
			Escribir a," < ",b," < ",c
		SiNo
			Escribir b," < ",a," < ",c
		FinSi
	FinSi
	
FinAlgoritmo
