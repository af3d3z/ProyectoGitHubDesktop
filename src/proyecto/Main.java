package proyecto;

public class Main {
	public static void main(String[] args) {
		int mensaje;
		ArteASCII.Smiley();
		mensaje = Mensajes.crear();
		switch (mensaje) {
		
		case 1 -> {
			System.out.println("Dias");
		}
		case 2 -> {
			System.out.println("¿Un bono?");
		}
		case 3 -> {
			System.out.println("Hola mundo");
		}
		case 4 -> {
			System.out.println("Son las 3:31");
		}
		case 5 -> {
			System.out.println("¿Aun es primera hora? Buf...");
		}
		case 6 -> {
			System.out.println("Estoy cansado jefe");
		}
		case 7 -> {
			System.out.println("Demasiadas funciones, quita bicho");
		}
		case 8 -> {
			System.out.println("Esperando epicamente hasta las tres menos cuarto...");
		}
		case 9 -> {
			System.out.println("Hay demasiado sueño");
		}
		case 10 -> {
			System.out.println("Noches");
		}
		
		}
	}
}
