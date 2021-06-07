//202030799 Manuel Rojas
//Diseñar un algoritmo que genere números al azar
//múltiplos de 5, mientras el usuario no ingresa la opción 'S' (Salir)
Proceso Ejercicio8Parte2
	salir <- ""
	Escribir "Presione S para dejar de generar numeros"
	Mientras MAYUSCULAS(salir) <> "S" Hacer
		random <- 0
		Leer salir
		Hacer
			random <- Aleatorio(0, 9999)
			residuo <- random%5
		Mientras Que residuo <> 0
		Escribir random
	FinMientras
FinProceso
