package com.ftninformatika.op.lekcija3.petlje;

public class PrimerFor {

	public static void main(String[] args) {
		
		/*	 
		for (inicijalizacija; logicki uslov; korekcija) {
		 		naredbe koje se izvrsavaju sve dok inicijalna 
		 		vrednost ne dostigne granicu
		}
		 */
		
		//ispis prvih N prirodnih brojeva
		int granica = 10;
		System.out.println("Ispis prvih N="+granica+" prironih brojeva");
		for ( int i = 1; i <= granica; i++ ) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Ispis brojeva unazad");
		// napisati da ide unazad od 10 do 1
		for (int i = 10; i > 0; i--) {
			System.out.println(i);
		}
		
		System.out.println();
		System.out.println("---------------------------------------------------------");
		System.out.println("Suma prvih 10 brojeva");
		
		//stavljamo da je inicijalno 0 posto je nula neutralni element kod sabiranja
		int suma = 0;
		for(int i = 1; i <= 10; i++) {
			//na prethodnu vrednost sume dodajemo i-ti broj
			suma += i;
		}
		System.out.println("Suma=" + suma);
		
		
	}

}
