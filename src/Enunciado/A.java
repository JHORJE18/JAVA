package Enunciado;

import java.util.Scanner;

import Principal.Diseño;

public class A {
	
	//Variable diseño
	static Diseño ds = new Diseño(56, "-");

	public static void main(String args []){
		Scanner entrada = new Scanner(System.in);
		ds.enunciado("Programar el ejercicio que vimos en organigramas, donde hacíamos un DFD que  dados tres números realizaba la multiplicación si el primer número era positivo y la suma si dicho número era negativo.");
		
		int[] num = new int[3];
		
		//Pido numeros
		for (int i=0; i<3; i++){
			ds.limpiarln();
			System.out.println("Introduce el " + (i+1) + "º número");
			num[i] = entrada.nextInt();
		}
		ds.limpiarln();
		
		//Si es mayor que 0
		if (num[0] > 0){
			//Calculo multiplicación
			System.out.println("El resultado de " + num[1] + " x " + num[2] + " es " + (num[1] * num[2]));
		} else {
			//Calculo suma
			System.out.println("El resultado de " + num[1] + " + " + num[2] + " es " + (num[1] + num[2]));
		}
		
		//Fin
		ds.marca();
	}
}