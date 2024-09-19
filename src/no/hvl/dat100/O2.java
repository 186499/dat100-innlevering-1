package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O2 {

	public static void main(String[] args) {
		// Taste inn bruttoinntekt
		String inntektInput = JOptionPane.showInputDialog("Oppgi bruttoinntekt:");
		double inntekt = Double.parseDouble(inntektInput);
		double trinnskatt = 0;
		
		//trinnskatt kalkulator
		if (inntekt <= 208050) {
			trinnskatt = 0;
		} else if (inntekt <= 292850) {
			trinnskatt = (inntekt - 208050) * 0.017;
		} else if (inntekt <= 670000) {
			trinnskatt = (292850 - 208050) * 0.017 + (inntekt - 292850) * 0.04;
		} else if (inntekt <= 937900) {
			trinnskatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (inntekt - 670000) * 0.136;
		} else if (inntekt <= 1350000) {
			trinnskatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (inntekt - 937900) * 0.166;
		} else {
			trinnskatt = (292850 - 208050) * 0.017 + (670000 - 292850) * 0.04 + (937900 - 670000) * 0.136 + (1573500 - 937900) * 0.166 + (inntekt - 1537500)* 0.176;
		}
		//Viser resultat
		JOptionPane.showMessageDialog(null, "Din trinnskatt er " + trinnskatt + "NOK.");

	}

}
