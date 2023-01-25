package org.lessons.java.security;


public class Password {

	public static void main(String[] args) {
		
		String nome = "Marco" ;
		String cognome = "Lenders";
		String colorePreferito = "Blu";
		
		int giornoDiNascita = 29;
		int meseNascita = 02;
		int annoNascita = 1990;
		
		
		int somma = giornoDiNascita + meseNascita + annoNascita;
		
		
		String password = nome + "-" + cognome + "-" + colorePreferito +  "-" + somma;
		
		System.out.println(password);
		
		
		
		
		
		
		
		
		
		

	}

}
