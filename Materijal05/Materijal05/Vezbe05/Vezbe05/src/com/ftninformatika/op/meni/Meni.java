package com.ftninformatika.op.meni;

import java.util.Scanner;

public class Meni {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String opcija;
		
		//vrtimo se u petlji, dok korisnik nece da zavrsi program
		do {
			//prikazuje opcije menija
			System.out.println("********** MENI **************");
			System.out.println("1. Prva opcija");
			System.out.println("2. Druga opcija");
			System.out.println("x. Kraj");
			System.out.println();
			System.out.println("Opcija: ");
			
			//od korisnika se ucitava opcija
			opcija = sc.nextLine();
			
			//zavisno od opcije izvrsi se neka funkcionalnost
			switch (opcija) {
				case "1":
					System.out.println("Izabrali ste prvu opciju!");
					System.out.println("(P.S. Za sad nema nista korisno implementirano 1)");
					break;
				case "2":
					System.out.println("Izabrali ste drugu opciju!");
					System.out.println("(P.S. Za sad nema nista korisno implementirano 2)");
					break;
				//ovo nam ne bi ni trebalo, sluzi samo da kada se odabere x be bude izvrseno ono sto je pod default:
				case "x":
					break;
				default:
					System.out.println("Nepostojeca opcija!");
			}
		
		//u petlji se vrtimo sve dok se ne odabere opcija x
		} while(!opcija.equals("x"));
			
		sc.close();
	}

}
