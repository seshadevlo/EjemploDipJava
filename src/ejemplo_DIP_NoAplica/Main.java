package ejemplo_DIP_NoAplica;

public class Main {
	
	public static void main(String[] args) {
		
		NotifierService servicio = new NotifierService();
		servicio.Notify("Hola, esto queria decir");
	}

}
