package Principal;
import java.util.Scanner;

import Enunciado.*;

public class Principal {
	
	//Variable diseño
	static Diseño ds = new Diseño(30, "-");

	//Inicio Programa *BASE*
	public static void main(String args []){		
		boolean salir = false;
		
		while(!salir){
			ds.limpiarln();
			ds.enunciado("Menu Principal");
			int iniciar = menu();
			
			switch(iniciar){
			case 0:
				ds.error(2);
				break;
			case 1:
				System.out.println("Actividad A");
				Actividad("A");
				break;
			case 2:
				System.out.println("Actividad B");
				Actividad("B");
				break;
			case 3:
				System.out.println("Actividad C");
				Actividad("C");
				break;
			case 4:
				System.out.println("Actividad D");
				Actividad("D");
				break;
			case 5:
				salir = true;
				break;
			default:
				ds.error(1);
				break;
			}
		}
		
		ds.limpiarln();
		System.out.println("Hasta luego cariño, espero que vuelvas pronto...");
		ds.limpiarln();
		ds.marca();
	}
	
	//Menu
	private static int menu(){
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la actividad que deseas iniciar");
		System.out.println("1. Actividad A");
		System.out.println("2. Actividad B");
		System.out.println("3. Actividad C");
		System.out.println("4. Actividad D");
		System.out.println("5. Salir");
		try{
			return entrada.nextInt();
		} catch (Exception e) {
			return 0;
		}
	}
	
	//Iniciar actividades
	static void Actividad(String selc){
		
		//Inicia actividad seleccionada
		switch(selc){
		case "A":
			A actA = new A();
			actA.inicio();
			break;
		case "B":
			B actB = new B();
			actB.inicio();
			break;
		case "C":
			C actC = new C();
			actC.inicio();
			break;
		case "D":
			D actD = new D();
			actD.inicio();
			break;
		default:
			ds.error(0);
			break;
		}
	}
	
}
