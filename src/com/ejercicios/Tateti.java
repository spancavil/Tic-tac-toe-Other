package com.ejercicios;
import java.util.*;

public class Tateti {
	
	static String[] tablero;
	static String ganador;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tablero = new String[9];
		ganador = null;
		Scanner teclado = new Scanner(System.in);
		int posicion;
		String turno = "X";
		
		for (int i = 0; i < tablero.length; i++) {
			//Le asignamos a cada posicion un número
			tablero[i] = String.valueOf(i + 1);
		}
		
		printBoard();
		//System.out.println("Empiezan los O, elegir un casillero: ");
		
		//En el bucle while no se sabe cuando se finaliza, a diferencia del for.
		while (ganador == null) {
			if (turno == "O") {
				turno = "X";
				System.out.println("Turno de las X, elegir un casillero: ");
			} else {
				turno = "O";
				System.out.println("Turno de las O, elegir un casillero: ");
			}
			
			posicion = teclado.nextInt();
			//Ver que esa posición no esté ocupada
			
			if (turno == "X") tablero[posicion - 1] = "X";
			if (turno == "O") tablero[posicion - 1] = "O";
			printBoard();
		}
	}
	
	//Metodo para imprimir el tablero. Void significa que el método no devuelve ningun valor
	//void es porque el método no devuelve nada
	//Lo que va dentro del paréntesis son los argumentos
	static void printBoard () {
		System.out.println(tablero[0] + " | " + tablero[1] + " | "  + tablero[2]);
		System.out.println("---------");
		System.out.println(tablero[3] + " | " + tablero[4] + " | "  + tablero[5]);
		System.out.println("---------");
		System.out.println(tablero[6] + " | " + tablero[7] + " | "  + tablero[8]);
		//Agregar la lógica para ver si hay o no ganador
	}

}
