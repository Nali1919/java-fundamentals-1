package org.lessons.java.security;

import java.util.Scanner;

public class BigliettoTreno {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Quanti Km vuoi percorrere?");

		int km = input.nextInt();

		System.out.print("Quanti anni hai?");

		int età = input.nextInt();

		double prezzoViaggio = km * 0.21;
		
		double scontoViaggio ;
		
		

		if (età < 18) {

		     scontoViaggio = prezzoViaggio - (prezzoViaggio * 20 / 100);

			System.out.println( Math.floor(scontoViaggio));

		} else if (età > 65) {

			 scontoViaggio =  prezzoViaggio - (prezzoViaggio * 40 / 100);

			System.out.println( Math.floor(scontoViaggio));
		} else {

			System.out.println(prezzoViaggio);

		}

		input.close();

	}

}
