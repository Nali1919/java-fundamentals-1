package org.lessons.java.security;

public class Cibipreferiti {

	public static void main(String[] args) {
		
		String[] cibiPreferiti = {"pizza", "pane", "carne","sushi", "maionese", "minestra", "pesce", "lenticchie"};
		
		System.out.println("La lunghezza della classifica è: " + cibiPreferiti.length);
		
		System.out.println("Il mio cibo preferito è: " + cibiPreferiti[0]);
		
		System.out.println("Il mio cibo preferito ma non troppo è: " + cibiPreferiti[cibiPreferiti.length - 1]);;
		
		System.out.println("Il mio cibo di mezza classifica è: " + cibiPreferiti[cibiPreferiti.length /2 - 1]);
		
	}
	
		
}
