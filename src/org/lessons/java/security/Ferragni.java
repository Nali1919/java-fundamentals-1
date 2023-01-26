package org.lessons.java.security;

import java.util.Scanner;

public class Ferragni {

	public static void main(String[] args) {

		
		
			String[] ospiti= { 
					"Dua Lipa","Paris Hilton", "Manuel Agnelli", "J-Ax","Francessco Totti","Ilary Blasi","Bebe Vio", "Luis", "Paradais Zarei", "Martina Maccherone","Rachel Zeili"
			};
			
			Scanner input = new Scanner(System.in);
			
			System.out.println("Inserisci il tuo Nome e Cognome");
			
			String nominativo = input.nextLine();
			
			boolean inLista = false;
			
			for(int i=0; i < ospiti.length ; i++) {
				
				if(nominativo.toLowerCase().trim().equals(ospiti[i].toLowerCase().trim())) {
					
					inLista=true;
					
				}
			}
			if(inLista) 
				System.out.println("Ciao " + nominativo + " e' in lista");
			
			else System.out.println("Mi dispiace " + nominativo + " lei non e' in lista" );
			
			input.close();
		}

	}


