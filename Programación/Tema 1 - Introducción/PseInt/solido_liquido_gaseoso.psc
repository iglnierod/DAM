Algoritmo solido_liquido_gaseoso
	Definir temp Como Real
	Escribir "Escriba su temperatura:"
	Leer temp
	Si temp <=0 Entonces
		Escribir "Está sólido"
	SiNo
		Si temp>=100 Entonces
			Escribir "Está gaseoso"
		SiNo
			Escribir "Está líquido"
		FinSi
	FinSi
FinAlgoritmo