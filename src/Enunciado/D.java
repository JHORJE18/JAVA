package Enunciado;

import java.util.Scanner;
import Principal.Diseño;

public class D {
	
	//Variable diseño
	static Diseño ds = new Diseño(56, "-");
	static int limit = 10;
	static int[] vector = new int[limit];
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Preguntamos datos
		for (int i=0; i<vector.length; i++){
			ds.limpiarln();
			System.out.println("Introduce el Vector nº " + (i+1));
			vector[i] = entrada.nextInt();
		}
		ds.limpiarln();
		
		//Imprimimos inicio de la serie
		System.out.print("Vectores = {");
		for (int i=0; i<vector.length; i++){
			System.out.print(vector[i]);
			
			//Ultimo digito (Sin coma y finaliza serie)
			if (i == (vector.length -1)){
				System.out.println("}");
			} else {
				//Inserta coma y espacio para seguir serie
				System.out.print(", ");
			}
		}
		
		//Fin
		ds.marca();
	}

}
