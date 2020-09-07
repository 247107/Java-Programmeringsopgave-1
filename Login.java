package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class Login {
	
	public static void main(String[] args) {
			
			String brukernavn = showInputDialog("Brukernavn :");

			String passord = showInputDialog("Passord :");

		
			
			if (brukernavn.equals("Arun") && passord.equals("Passord123")){
				System.out.println("Logget inn");
				
			}
			else {
				System.out.println("Brukernavn eller passord er feil");
			}
	}


	}