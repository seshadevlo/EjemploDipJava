package ejemplos_DIP_Aplica;

public class SmsNotifier implements INotifierService {

	//instancia de metodo que "envia" (se imprime en consola) un mensaje.
	public void enviarMensaje(String mensaje) {
		System.out.println("enviar por Sms el mensaje: " + mensaje);
	}
}
