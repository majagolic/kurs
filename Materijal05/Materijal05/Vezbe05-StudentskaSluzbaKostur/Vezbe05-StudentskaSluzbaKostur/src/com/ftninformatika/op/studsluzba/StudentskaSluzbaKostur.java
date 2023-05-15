package com.ftninformatika.op.studsluzba;

import java.util.ArrayList;
import java.util.Scanner;

//Kostur zadatka koji treba da se nadogradi
public class StudentskaSluzbaKostur {

	public static void main(String[] args) {
		//Pravimo liste za brojeve indeksa i za imena
		ArrayList<String> indeksi = new ArrayList<String>();
		ArrayList<String> imena = new ArrayList<String>();
		
		//Dodaje se 5 studenata, cisto radi testiranja
		//U pravoj aplikaciji nikad ne bi trebali imati "zabetonirano" dodavanje studenata
		
		//indeksi
		indeksi.add("I1");
		indeksi.add("I2");
		indeksi.add("I3");
		indeksi.add("I4");
		indeksi.add("I5");		
		//imena
		imena.add("Marko");
		imena.add("Milan");
		imena.add("Petar");
		imena.add("Dejan");
		imena.add("Zoran");

		Scanner sc = new Scanner(System.in);

		String opcija;

		do {
			System.out.println("*********** MENI **********");
			System.out.println("1. Spisak studenata");
			System.out.println("8. Unos novog studenta");
			System.out.println("x. Izlaz");
			System.out.print("Unesite opciju: ");

			opcija = sc.nextLine();

			switch (opcija) {
			//spisak studenata
			case "1":
				for (int i = 0; i < indeksi.size(); i++) {
					//10 mesta za imena i 5 mesta prosek odvojimo da bi podaci bili poravnati
					System.out.printf("%10s %10s \n", indeksi.get(i), imena.get(i));
				}
				break;

			case "8":
				//prvo od korisnika trazimo da unese podatke
				System.out.print("Unesite broj indeksa studenta: ");
				String brIndeksa = sc.nextLine();
				System.out.print("Unesite ime studenta: ");
				String ime = sc.nextLine();
				//unete podetke dodajemo u odgovarajuce liste (na kraj liste)
				indeksi.add(brIndeksa); 
				imena.add(ime);
				System.out.println("Student je uspesno dodan.");
				break;
			}


		} while (!opcija.equals("x"));

		sc.close();

	}

}
