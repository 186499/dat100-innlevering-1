package no.hvl.dat100;

import javax.swing.JOptionPane;

public class O1 {

	public static void main(String[] args) {
		//Lese inn poengsum fra 10 studenter
		for (int i = 1; i <= 10; i++) {
			int poengsum;
			while (true) {
				//Leser inn poengsum i dialogvindu
				String poengsumInput = JOptionPane.showInputDialog("Tast inn poengsum: ");
				//Endrer datatype
				poengsum = Integer.parseInt(poengsumInput);
				
				if (poengsum < 0 || poengsum >100) {
					System.out.println("Ugyldig poengsum. POppgi gyldig poengsum.");
				}	else {
						break;
					}
				}
		
			//sjekker hvilket tilfelle
			if (poengsum >= 90) {
				System.out.println("Karakter: A");
			} else if (poengsum >= 80) {
				System.out.print("Karakter : B");
			} else if (poengsum >= 60) {
				System.out.println("Karakter: C");
			} else if (poengsum >= 50) {
				System.out.println("Karakter: D");
			} else if (poengsum >= 40) {
				System.out.println("Karakter: F");
			} else {
				System.out.println("Karakter: F");
			}
		}
		
	}

}
