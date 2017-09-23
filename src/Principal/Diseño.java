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
	
	//Crea creditos
	public void marca(){
		limpiarln();
		System.out.println("Programa Java creado por " + name);
		limpiarln();
	}
	
}
