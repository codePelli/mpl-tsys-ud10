package Ej02;

public class Excepcion {
	
	public static void error() {

	try {
		
		System.out.println("--- Mensaje de ERROR ---");
		throw new Exception("Excepcion capturada por mensaje: Este es un objeto EXCEPTION");
		
	} catch (Exception e) {
		
		System.out.println("Error: " + e.getMessage());
		System.out.println("-- Programa terminado --");
		
	  }
	}
}
