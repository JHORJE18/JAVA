package Enunciado;

import java.util.Scanner;

public class A {
	
	public static void main(String args []){
		Scanner entrada = new Scanner(System.in);
		int[] num = new int[3];
		
		//Pido numeros
		for (int i=0; i<3; i++){
			System.out.println("Introduce el " + (i+1) + "º número");
			num[i] = entrada.nextInt();
		}
		
		//Si es mayor que 0
		if (num[0] > 0){
			//Calculo multiplicación
			System.out.println("El resultado de " + num[1] + " x " + num[2] + " es " + (num[1] * num[2]));
		} else {
			//Calculo suma
			System.out.println("El resultado de " + num[1] + " + " + num[2] + " es " + (num[1] + num[2]));
		}
		
	}
}