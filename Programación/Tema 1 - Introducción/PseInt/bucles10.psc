// Dise�ar un algoritmo que permita mostrar en pantalla una rutina de selecci�n del siguiente 
// men� 1.- Suma 2.- Resta 3.- Producto 4.- Divisi�n S.- Salir.
// El usuario podr� elegir cualquier alternativa, luego ingresar A y B y realizar la operaci�n 
// seleccionada. Solamente con "S" podr� Salir. Tener en cuenta que si elige 4.- Divisi�n 
// deber� ingresar el denominador hasta que ingrese un valor diferente a 0 (cero). Si 
// ingresa un n�mero negativo o mayor que 4 deber� informar "Opci�n no v�lida".
Algoritmo bucles10
	Definir A,B Como Real
	Definir op Como Caracter
	Repetir
		Escribir 'Escriba dos n�meros: '
		Leer A,B
		Escribir 'Esciba la operaci�n que desea'
		Escribir '+ , - , * , /, S (PARA SALIR)'
		Leer op
		Segun op  Hacer
			'+':
				sol <- A+B
				Borrar Pantalla
				Escribir A,' + ',B,' = ',sol
			'-':
				sol <- A-B
				Borrar Pantalla
				Escribir A,' - ',B,' = ',sol
			'*':
				sol <- A*B
				Borrar Pantalla
				Escribir A,' * ',B,' = ',sol
			'/':
				Si B=0 Entonces
					Escribir 'El denominador tiene que ser diferente de 0'
					Repetir
						Escribir 'Vuelva a escribir el denominador: '
						Leer B
					Hasta Que B<>0
				FinSi
				sol <- A/B
				Borrar Pantalla
				Escribir A,' / ',B,' = ',sol
			De Otro Modo:
				Escribir 'Opci�n no v�lida'
				Escribir 'El operador tiene que ser: + , - , * , /, S (PARA SALIR)'
				Borrar Pantalla
		FinSegun
	Hasta Que op='S'
FinAlgoritmo
