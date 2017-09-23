package Principal;
import java.util.Scanner;

public class Principal {
	
	//Variable diseño
	static Diseño ds = new Diseño(30, "-");

	public static void main(String args []){		
		boolean salir = false;
		
		while(!salir){
			ds.limpiarln();
			int iniciar = menu();
			
			switch(iniciar){
			case 0:
				ds.error(2);
				break;
			case 1:
				menu();
				break;
			case 2:
				menu();
				break;
			case 3:
				menu();
				break;
			case 4:
				menu();
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
		System.out.println("Finalizando programa...");
		ds.limpiarln();
		ds.marca();
	}
	
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
	
}
