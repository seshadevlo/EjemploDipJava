package ejemplo_DIP_NoAplica;

public class NotifierService {

	//instancias de clase de cada clase
	private EmailNotifier emailNotifier;
	private WhatsAppNotifier whatsAppNotifier;
	private SmsNotifier smsNotifier;
	
	
	public NotifierService() {
		this.emailNotifier = new EmailNotifier();
		this.whatsAppNotifier = new WhatsAppNotifier();
		this.smsNotifier = new SmsNotifier();
	}
	
	public void Notify(String mensaje) {
		
		emailNotifier.enviarEmail(mensaje);
		whatsAppNotifier.enviarWhatsApp(mensaje);
		smsNotifier.enviarSms(mensaje);
	}
	
	
}
