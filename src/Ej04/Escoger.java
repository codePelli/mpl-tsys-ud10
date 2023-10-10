package Ej04;

import javax.swing.JOptionPane;

public class Escoger {
	
	public void Operacion() throws Exception {
		
		String op = JOptionPane.showInputDialog(null, "Escoge entre: suma, resta, multiplicacion, "
				+ "potencia, raiz cuadrada, raiz cubica y division");

		while (true) {
			
			if (op.equals("suma")) {
				
				JOptionPane.showMessageDialog(null, "Suma entre dos numeros");
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el primer numero"));
				double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el segundo numero"));
								
				double resultado = suma(x, y);
				
				try {
					
					JOptionPane.showMessageDialog(null, "RESULTADO: " + resultado);

				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "EXCEPTION: " + e.getMessage());

				}
				
				throw new Exception(Mensajes.mensajeSuma);
				
			}
			
			if (op.equals("resta")) {
				
				JOptionPane.showMessageDialog(null, "Resta entre dos numeros");
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el primer numero"));
				double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el segundo numero"));
								
				double resultado = resta(x, y);
				
				try {
					
					JOptionPane.showMessageDialog(null, "RESULTADO: " + resultado);

				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "EXCEPTION: " + e.getMessage());

				}
				
				throw new Exception(Mensajes.mensajeResta);
				
			}
			
			if (op.equals("multiplicacion")) {
				
				JOptionPane.showMessageDialog(null, "Multiplicacion entre dos numeros");
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el primer numero"));
				double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el segundo numero"));
								
				double resultado = multiplicacion(x, y);
				
				try {
					
					JOptionPane.showMessageDialog(null, "RESULTADO: " + resultado);

				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "EXCEPTION: " + e.getMessage());

				}
				
				throw new Exception(Mensajes.mensajeMultiplicacion);
				
			}
			
			if (op.equals("potencia")) {
				
				JOptionPane.showMessageDialog(null, "Potencia de un numero");
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el  numero"));
								
				double resultado = potencia(x);
				
				try {
					
					JOptionPane.showMessageDialog(null, "RESULTADO: " + resultado);

				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "EXCEPTION: " + e.getMessage());

				}
				
				throw new Exception(Mensajes.mensajePotencia);
				
			}
			
			if (op.equals("raiz cubica")) {
				
				JOptionPane.showMessageDialog(null, "Raiz cubica de un numero");
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el  numero"));
								
				double resultado = raizCubica(x);
				
				try {
					
					JOptionPane.showMessageDialog(null, "RESULTADO: " + resultado);

				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "EXCEPTION: " + e.getMessage());

				}
				
				throw new Exception(Mensajes.mensajeRaizCubica);
				
			}
			
			if (op.equals("division")) {
				
				JOptionPane.showMessageDialog(null, "Division entre dos numeros");
				
				double x = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el primer numero"));
				double y = Double.parseDouble(JOptionPane.showInputDialog(null, "Escoge el segundo numero"));
								
				double resultado = division(x, y);
				
				try {
					
					JOptionPane.showMessageDialog(null, "RESULTADO: " + resultado);

				} catch (Exception e){
					
					JOptionPane.showMessageDialog(null, "EXCEPTION: " + e.getMessage());

				}
				
				throw new Exception();
				
			}
			
		}
	}
	
	public static double suma (double x, double y) {
		
		return x + y;
		
	}
	
	public static double resta (double x, double y) {
		
		return x - y;
		
	}
	
	public static double multiplicacion (double x, double y) {
		
		return x * y;
		
	}
	
	public static double potencia (double x) {
		
		return x * x;
		
	}
	
	public static double raizCubica (double x) {
		
		return Math.cbrt(x);
		
	}
	
	public static double division (double x, double y) {
		
		return x / y;
		
	}

}
