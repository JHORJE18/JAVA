package Principal;

public class Diseño {
	
	int lineas;
	String simbolo;
	String name = "Jorge López Gil";
	
	public Diseño(int line, String simbol){
		this.lineas = line;
		this.simbolo = simbol;
	}

	//Crea linea #lineas veces con el #simbolo
	public void limpiarln(){
		
		for (int i=0; i<lineas; i++){
			System.out.print(simbolo);
		}
		System.out.println("");
		
	}
	
	//Crea lineas personalizadas temp
	public void limpiarlnPS(int ln, String smb){
			
		for (int i=0; i<ln; i++){
			System.out.print(smb);
		}
		System.out.println("");
			
	}
	
	//Crea enunciado
	public void enunciado(String enun){
		limpiarlnPS(enun.length(), "#");
		System.out.println(enun);
		limpiarlnPS(enun.length(), "#");
	}
	
	//Crea creditos
	public void marca(){
		limpiarln();
		System.out.println("Programa Java creado por " + name);
		limpiarln();
	}
	
	//Errores
	public void error(int code){
		
		limpiarlnPS(this.lineas, "$");
		
		switch(code){
		case 1:
			System.out.println("Error: Se ha introducido un número no válido");
			break;
		case 2:
			System.out.println("Error: Se ha introducido un tipo de dato no válido");
			break;
		default:
			System.out.println("Error: Se ha producido un error desconocido");
			break;
			
		}
		limpiarlnPS(this.lineas, "$");
	}
	
}
