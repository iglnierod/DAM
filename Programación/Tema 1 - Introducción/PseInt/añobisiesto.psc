Algoritmo añobisiesto
	Definir año Como real
	Escribir "Escriba un año"
	Leer año
	Si año MOD 4 = 0 Entonces
		Si año MOD 100 <> 0 Entonces
			Escribir "Es bisiesto"
		SiNo 
			Escribir "No es bisiesto"
		FinSi
	SiNo 
		Escribir "No es bisiesto"
	FinSi
FinAlgoritmo
