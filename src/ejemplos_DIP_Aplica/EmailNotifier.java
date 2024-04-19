package ejemplos_DIP_Aplica;

public class EmailNotifier implements INotifierService {

	//instancia metodo que "envia" (se imprime en consola) un mensaje.
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviar por Email el mensaje: " + mensaje);
	}
}
