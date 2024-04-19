package ejemplos_DIP_Aplica;

public class Main {
	
	public static void main(String[] args) {
		
		INotifierService[] notifier = new INotifierService[] {
				new EmailNotifier(),
				new WhatsAppNotifier(),
				new SmsNotifier()
		};
		
		NotifierService servicio = new NotifierService(notifier);
		servicio.Notify("Hola, queria enviar este mensaje ahora usando inversion de dependencias!");
	}

}
