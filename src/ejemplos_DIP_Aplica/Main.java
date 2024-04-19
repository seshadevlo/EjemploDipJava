package ejemplos_DIP_Aplica;

public class Main {
	
	public static void main(String[] args) {
		
		// se crea un Array con todas las instancias segun cada clase. 
		INotifierService[] notifier = new INotifierService[] {
				new EmailNotifier(),
				new WhatsAppNotifier(),
				new SmsNotifier()
		};
		
		//metodo que conecta las instancia con el servicio para desplegar el mensaje.
		NotifierService servicio = new NotifierService(notifier);
		servicio.Notify("Hola, queria enviar este mensaje ahora usando inversion de dependencias!");
	}

}
