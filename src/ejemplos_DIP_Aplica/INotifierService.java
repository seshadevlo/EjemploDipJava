package ejemplos_DIP_Aplica;


/* una interfaz nos permite poder crear una variable de esta misma,
 *  para luego asignarle las instancias de clases que la implementan.*/
public interface INotifierService {
	void enviarMensaje(String mensaje);
}
