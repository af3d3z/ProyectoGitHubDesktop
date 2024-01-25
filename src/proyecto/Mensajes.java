package proyecto;

public class Mensajes {

	/***
	 * Genera un numero aleatorio para un mensaje aleatorio
	 * @return el numero aleatorio
	 */
	public static int crear() {
		int respuesta = (int) ((Math.random()*10)+1);
		return respuesta;
	}
	
}
