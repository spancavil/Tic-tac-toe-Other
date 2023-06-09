package com.ejercicios;

public class Problema21 {

	public static void main(String[] args) {
		//Tomando como base el ejercicio anterior ingresar un número entero mayor a 0 
		//y dibujar un rombo con *. 
		//Por ejemplo si se ingresa el número 5 dibuja la pirámide de 5 filas y 
		//luego completa el rombo al ir decrementando la cantidad de asteriscos.
		int n = 5;
		
		int space = n - 1;
        //Primer pirámide
        for (int i = 0; i < n; i++)
        {
        	//Primero espacios
            for (int j = 0; j < space; j++)
                System.out.print(" ");
      
            //Luego estrellas
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
      
            System.out.print("\n");
            space--;
        }
      
        // Pirámide invertida
        space = 1;
        for (int i = n - 1; i > 0; i--)
        {
            
            for (int j = 0; j < space; j++)
                System.out.print(" ");
      
            for (int j = 0; j < i; j++)
                System.out.print("* ");
      
            System.out.print("\n");
            space++;
        }
	}

}
