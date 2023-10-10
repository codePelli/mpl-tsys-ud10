package Ej05;

import java.util.Random;

import javax.swing.JOptionPane;

public class Password {

	public int longitud;
	public String password;

	public Password() {
		
		this.longitud = 8;
		this.password = "";
	
	}
	
	public Password(int longitud, String password) {
		
		this.longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserta una longitud"));
		
		String caracteres = "ASDFasdf123987";
		Random rnd = new Random();
		StringBuilder generada = new StringBuilder(longitud);
		
		for(int x = 0; x < longitud; x++) {
			
			int i = rnd.nextInt(caracteres.length());
			generada.append(caracteres.charAt(i));
		}
		
		this.password = generada.toString();
		
	}
	
	public boolean esFuerte() {
		
		return false;
	}
	
	public String generarPassword() {
		
		return password;
		
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}