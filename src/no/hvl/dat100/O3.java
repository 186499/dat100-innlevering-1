package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O3 {

	public static void main(String[] args) {
		// Taste inn heltall
		String heltall = JOptionPane.showInputDialog("Tast inn heltall (n>0) : ");
		int n = Integer.parseInt(heltall);
		
		//beregner verdien n!
		if (n > 0) {
			long faktorial = 1;
			for (int i = 1; i <= n; i++) {
				faktorial *= i;
			}
			
			//vise resultt
			JOptionPane.showMessageDialog(null, "Faktorial av " + n + " er lik " + faktorial);
		} 
		//ber brukeren å skrive tallet på nytt hvis n<0
		else {
			JOptionPane.showMessageDialog(null, "Skriv inn positive heltall(n>0)");
		}
		

	}

}
