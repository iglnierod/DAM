// Diseñar un algoritmo que permita mostrar en pantalla una rutina de selección del siguiente 
// menú 1.- Suma 2.- Resta 3.- Producto 4.- División S.- Salir.
// El usuario podrá elegir cualquier alternativa, luego ingresar A y B y realizar la operación 
// seleccionada. Solamente con "S" podrá Salir. Tener en cuenta que si elige 4.- División 
// deberá ingresar el denominador hasta que ingrese un valor diferente a 0 (cero). Si 
// ingresa un número negativo o mayor que 4 deberá informar "Opción no válida".
Algoritmo bucles10
	Definir A,B Como Real
	Definir op Como Caracter
	Repetir
		Escribir 'Escriba dos números: '
		Leer A,B
		Escribir 'Esciba la operación que desea'
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
				Escribir 'Opción no válida'
				Escribir 'El operador tiene que ser: + , - , * , /, S (PARA SALIR)'
				Borrar Pantalla
		FinSegun
	Hasta Que op='S'
FinAlgoritmo
