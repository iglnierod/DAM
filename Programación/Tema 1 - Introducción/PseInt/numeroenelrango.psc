Algoritmo numeroenelrango
	Definir num1,num2,num3 Como Real
	Escribir "Escriba el minimo del rango:"
	Leer num1
	Escribir "Escriba el m�ximo del rango:"
	Leer num2
	Escribir "Escriba el n�mero que tiene que estar en el rango:"
	Leer num3
	Si num3<num1 o num3>num2 Entonces 
		Escribir  num3," no est� en el rango: ", num1,"<=X","<=",num2
	SiNo
		Escribir num1,"<=",num3,"<=",num2
	FinSi
FinAlgoritmo
