package org.lessons.java.security;

import java.util.Scanner;

public class Sondaggio {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Quanti studenti hanno windows?");

		int Windows = input.nextInt();

		System.out.print("Quanti studenti hanno linux?");

		int Linux = input.nextInt();

		System.out.print("Quanti studenti hanno mac?");

		int Mac = input.nextInt();

		int Totale = Mac + Windows + Linux;

		double windowsTot = (Windows / (double)  Totale) * 100;
		double linuxTot = (Linux / (double) Totale) * 100;
		double macTot = (Mac / (double) Totale) * 100;

		System.out.println("Percentuale studenti windows:" + windowsTot + "%");
		System.out.println("Percentuale studenti linux:" + linuxTot + "%");
		System.out.println("Percentuale studenti mac:" + macTot + "%");

		input.close();

	}

}
