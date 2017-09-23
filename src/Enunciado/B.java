package Enunciado;

import java.util.Scanner;

import Principal.Diseño;

public class B {
	
	//Variable diseño
	static Diseño ds = new Diseño(56, "-");

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		ds.enunciado("Realizar un programa que dado un día de la semana (entre 1 y 7) muestre por pantalla el nombre del día");
		
		ds.limpiarln();
		System.out.println("Introduce el número del día (1-7)");
		int dia = entrada.nextInt();
		ds.limpiarln();
		
		switch (dia){
			case 1:
				System.out.println("El día 1 es Lunes");
				break;
			case 2:
				System.out.println("El día 2 es Martes");
				break;
			case 3:
				System.out.println("El día 3 es Miércoles");
				break;
			case 4:
				System.out.println("El día 4 es Jueves");
				break;
			case 5:
				System.out.println("El día 5 es Viernes");
				break;
			case 6:
				System.out.println("El día 6 es Sábado");
				break;
			case 7:
				System.out.println("El día 7 es Domingo");
				break;
			default:
				System.out.println("Has introducido un día incorrecto!");
				break;			
		}
		
		//Fin
		ds.marca();
	}

}
