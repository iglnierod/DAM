Algoritmo solido_liquido_gaseoso
	Definir temp Como Real
	Escribir "Escriba su temperatura:"
	Leer temp
	Si temp <=0 Entonces
		Escribir "Est� s�lido"
	SiNo
		Si temp>=100 Entonces
			Escribir "Est� gaseoso"
		SiNo
			Escribir "Est� l�quido"
		FinSi
	FinSi
FinAlgoritmo