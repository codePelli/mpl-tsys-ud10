package Ej05;

import javax.swing.JOptionPane;

public class Ejecutable {
	
	public static void Ejecutable() {
	
		int tamanoArray = Integer.parseInt(JOptionPane.showInputDialog(null, "Tamano del array"));
		
		Password[] contrasena = new Password[tamanoArray];
		boolean[] passFuerte = new boolean[tamanoArray];
		
		int longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Longitud del password"));
		
		for (int x = 0; x < tamanoArray; x++) {
			
			contrasena[x] = new Password(longitud, null);
			passFuerte[x] = contrasena[x].esFuerte();
			
		}
		
		for (int x = 0; x < tamanoArray; x++) {
			
			System.out.println("Password " + contrasena[x].getPassword()
						+ " es buena " + passFuerte[x]);
			
		}
	}

}
