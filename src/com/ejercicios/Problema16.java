package com.ejercicios;
import java.util.*;

public class Problema16 {

	public static void main(String[] args) {
		//Calcular el factorial de un número ingresado por teclado
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresar el número para cálcular el factorial");
		int i = sc.nextInt();
		long factorial = i;
		for (int j = i-1; j > 1; j--) {
			factorial = factorial * j;
		}
		
		System.out.println("El resultado del factorial es: " + factorial);
		sc.close();
	}

}
