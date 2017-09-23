package Enunciado;

import java.util.Scanner;
import Principal.Diseño;

public class C {
	
	//Variable diseño
	static Diseño ds = new Diseño(56, "-");
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
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
		
		//Fin
		ds.marca();
	}

}
