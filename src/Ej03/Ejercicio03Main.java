package Ej03;

import java.util.Random;

public class Ejercicio03Main {

	public static void main(String[] args) {
			
		try {
			
			Random rnd = new Random();
			int numero = rnd.nextInt(999) + 1;
			System.out.println("Numero creado: " + numero);
			EsPar.Mensaje(numero);
			
		} catch (Excepcion e) {
			
			System.out.println("Excepcion: " + e.getMessage());
		}

	}

}
