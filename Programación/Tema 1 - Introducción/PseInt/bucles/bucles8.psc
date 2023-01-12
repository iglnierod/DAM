Algoritmo bucles8
	Definir date Como caracter
	Definir sexo Como caracter
	Definir sem1,sem2,sexF,sexM Como Entero
	Escribir "Escriba su sexo (F o M):"
	Leer sexo
	Escribir "Escriba su fecha de nacimiento (DD/MM):"
	Leer date
	Si sexo="F" o sexo="M" Entonces
		Repetir
			Si CONVERTIRANUMERO(Subcadena(date,4,5))<=6 Entonces
				sem1<-sem1+1
			SiNo
				sem2<-sem2+1
			FinSi
			Si sexo="F" Entonces
				sexF<-sexF+1
			SiNo
				sexM<-sexM+1
			FinSi
			Escribir "Escriba el sexo (F o M):"
			Leer sexo
			Si sexo="F" o sexo="M" Entonces
				Escribir "Escriba la fecha de nacimiento (DD/MM):"
				Leer date
			FinSi
		Hasta Que sexo=""
		Escribir "En el primer semestre nacieron: ",sem1
		Escribir "En el segundo semestre nacieron: ",sem2
		Escribir "Hay ",sexF," mujeres"
		Escribir "Hay ",sexM," mujeres"
	SiNo
		Escribir "ERROR (sexo ha de ser F o M)"
	FinSi
FinAlgoritmo
