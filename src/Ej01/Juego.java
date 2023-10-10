package Ej01;

import java.util.InputMismatchException;
import java.util.Random;
import javax.swing.JOptionPane;

public class Juego {

	public static void jugar() {
		
		Random rnd = new Random();
		int numero = rnd.nextInt(500) + 1;
		int intento = 0;
		
		while (true) {
			
			try {
				
				String usuario = JOptionPane.showInputDialog(null, "Adivina el numero entre 1 y 500:");
				int numUsuario = Integer.parseInt(usuario);
				
				if (numUsuario < 1 || numUsuario > 500) {
					
					JOptionPane.showMessageDialog(null, "Tiene que ser entre  1 y 500");
					intento++;
					
				} else if (numUsuario < numero) {
					
					JOptionPane.showMessageDialog(null, "Tiene que ser mayor al numero introducido");
					intento++;

				} else if (numUsuario > numero) {
					
					JOptionPane.showMessageDialog(null, "Tiene que ser menor al numero introducido");
					intento++;

				} else {
					
					intento++;
					JOptionPane.showMessageDialog(null, "Wow! Has adivinado el numero: " + numero + " a la " + intento + " vez");
					
					break;
				}
			} catch (InputMismatchException e){
				
				JOptionPane.showMessageDialog(null, "Ingresa un numero valido");
				intento++;
			}
		
		}
	}
	
}
