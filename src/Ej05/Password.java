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
		
		int mayus = 0;
		int minus = 0;
		int num = 0;

		for (char x : password.toCharArray()) {
			
			if (Character.isUpperCase(x)) {
				mayus++;
				
			} else if (Character.isLowerCase(x)) {
				minus++;
				
			} else if (Character.isDigit(x)) {
				num++;
			
			}
		}
		
				
		return mayus >= 2 && minus > 1 && num >= 5;
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