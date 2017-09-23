package Enunciado;

import java.util.Scanner;
import Principal.Diseño;

public class C {
	
	//Variable diseño
	Diseño ds = new Diseño(56, "-");
	
	public void inicio(){
		Scanner entrada = new Scanner(System.in);
		ds.enunciado("Realizar un programa que muestre por pantalla los numero naturales hasta un valor final introducido por teclado por el usuario, este mismo ejemplo lo usaremos para ver la estructura do-while, y for");
		
		//Preguntamos datos
		ds.limpiarln();
		System.out.println("Introduce el último número natural que deseas visualizar");
		int max = entrada.nextInt();
		ds.limpiarln();
		
		//Imprimimos inicio de la serie
		System.out.print("N = {");
		for (int i=0; i<=max; i++){
			System.out.print(i);
			
			//Ultimo digito (Sin coma y finaliza serie)
			if (i == max){
				System.out.println("}");
			} else {
				//Inserta coma y espacio para seguir serie
				System.out.print(", ");
			}
		}
		
	}

}
