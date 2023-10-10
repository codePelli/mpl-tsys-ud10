package Ej03;

public class EsPar {
	
	public static void Mensaje (int numero) throws Excepcion{
	
	if (numero % 2 == 0) {
		
		throw new Excepcion("Numero par");
		
	} else {
		
		throw new Excepcion("Numero impar");
	}

	}
}

