package ejemplos_DIP_Aplica;

public class WhatsAppNotifier implements INotifierService {
	
	//metodo que "envia" (se imprime en consola) un mensaje.
	public void enviarMensaje(String mensaje) {
		System.out.println("enviar por WhatsApp el mensaje: " + mensaje);
	}
}
