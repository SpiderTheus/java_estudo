package aulaConceitual;
import java.awt.Color;

import javax.swing.JOptionPane;

public class Interfase {

	public static void main(String[] args) {
		String valor = JOptionPane.showInputDialog("Primeiro Valor: ");
		String valor2 = JOptionPane.showInputDialog("Segundo Valor: ");
		
		
		
		double n1 = Double.parseDouble(valor);
		double n2 = Double.parseDouble(valor2);
		
		double soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "O resulatado da some é: " + soma, "Soma dos valores", JOptionPane.PLAIN_MESSAGE);
		
	}

	

}
