package ejemplos_DIP_Aplica;

public class NotifierService {
	
	//variable de interfaz de tipo array que almacena instancias.
	private INotifierService[] notifiers;
	
	/*metodo que recibe las instancias de las clases
	 *  que implementan la interfaz INotifier*/
	public NotifierService(INotifierService[] notifiers) {
		this.notifiers = notifiers;		
	}
	
	public void Notify(String mensaje) {
		for(INotifierService notifier: notifiers) {
			notifier.enviarMensaje(mensaje);
		}
	}
		
}
