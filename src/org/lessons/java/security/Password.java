package org.lessons.java.security;

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Come ti chiami?");

		String nome = input.next();

		System.out.print("Come ti chiami di cognome?");

		String cognome = input.next();

		System.out.print("Colore preferito?");

		String colorePreferito = input.next();

		System.out.print("Anno Nascita?");

		int annoNascita = input.nextInt();

		System.out.print("Mese?");

		int meseNascita = input.nextInt();

		System.out.print("Giorno?");

		int giornoNascita = input.nextInt();
		
		
		int totaleAnno = annoNascita + meseNascita + giornoNascita;
		
		
		System.out.println(totaleAnno);
		
		
		String password = nome + "-" + cognome + "-" + colorePreferito + "-" + totaleAnno;
		
		System.out.println(password);
		
		input.close();

	}

}
