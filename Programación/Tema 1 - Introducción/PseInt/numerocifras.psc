Algoritmo numerocifras
	Definir num Como Entero
	Leer num
	Si num>0 Entonces
		Si num<=9 Entonces
			Escribir num," tiene 1 cifra"
		SiNo
			Si num<=99 Entonces
				Escribir num," tiene 2 cifras"
			Sino 
				Si num<=999 Entonces
					Escribir num," tiene 3 cifras"
				Sino 
					Si num<=9999 Entonces 
						Escribir num," tiene 4 cifras"
					SiNo
						Si num<=99999 Entonces
							Escribir num," tiene 5 cifras"
						SiNo
							Escribir num," tiene más de 5 cifras"
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	SiNo
		num=num*(-1)
		Si num<=9 Entonces
			Escribir num," tiene 1 cifra"
		SiNo
			Si num<=99 Entonces
				Escribir num," tiene 2 cifras"
			Sino 
				Si num<=999 Entonces
					Escribir num," tiene 3 cifras"
				Sino 
					Si num<=9999 Entonces 
						Escribir num," tiene 4 cifras"
					SiNo
						Si num<=99999 Entonces
							Escribir num," tiene 5 cifras"
						SiNo
							Escribir num," tiene más de 5 cifras"
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
	
FinAlgoritmo
