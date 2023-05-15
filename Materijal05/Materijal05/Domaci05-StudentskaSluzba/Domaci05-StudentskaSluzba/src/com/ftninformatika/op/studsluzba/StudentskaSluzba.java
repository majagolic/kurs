package com.ftninformatika.op.studsluzba;

import java.util.ArrayList;
import java.util.Scanner;

//Kostur zadatka koji treba da se nadogradi
public class StudentskaSluzba {

	public static void main(String[] args) {
		//Pravimo liste za brojeve indeksa i za imena
		ArrayList<String> indeksi = new ArrayList<String>();
		ArrayList<String> imena = new ArrayList<String>();
		ArrayList<String> prezimena = new ArrayList<String>();
		ArrayList<Double> proseci = new ArrayList<Double>();
		
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
		//prezimena
		prezimena.add("Markovic");
		prezimena.add("Milanovic");
		prezimena.add("Petrovic");
		prezimena.add("Dejanovic");
		prezimena.add("Zoranovic");
		//proseci
		proseci.add(6.67);
		proseci.add(9.33);
		proseci.add(7.5);
		proseci.add(8.14);
		proseci.add(6.89);

		Scanner sc = new Scanner(System.in);

		String opcija;

		do {
			System.out.println("*********** MENI **********");
			System.out.println("1. Spisak studenata");
			System.out.println("2. Pronalazenje studenta na osnovu broja indeksa");
			System.out.println("3. Pronalazenje studenta sa prosecnom ocenom vecom od navedene");
			System.out.println("4. Pronalazenje studenta sa najvisom prosecnom ocenom");
			System.out.println("5. Unos novog studenta");
			System.out.println("6. Brisanje studenta");
			System.out.println("7. Izmena podataka o studentu");
			System.out.println("8. Izmena prosecne ocene za studenta");
			System.out.println("x. Izlaz");
			System.out.print("Unesite opciju: ");

			opcija = sc.nextLine();

			switch (opcija) {
				//spisak studenata
				case "1":
					for (int i = 0; i < indeksi.size(); i++) {
						//10 mesta za imena i 5 mesta prosek odvojimo da bi podaci bili poravnati
						System.out.printf("%10s %10s %10s %5.2f \n", indeksi.get(i), imena.get(i), prezimena.get(i), proseci.get(i));
					}
					break;
					
				//pronalazenje studenta na osnovu broja indeksa
				case "2":
					System.out.print("Unesite broj indeksa studenta: ");
					String brIndeksa = sc.nextLine();
					int pozicija = indeksi.indexOf(brIndeksa);
					//ako postoji student sa tim brojem indeksa, prikazemo njegove podatke
					if(pozicija != -1)  {
						System.out.printf("%10s %10s %10s %5.2f \n", indeksi.get(pozicija), imena.get(pozicija), prezimena.get(pozicija), proseci.get(pozicija));
					}
					else
						System.out.println("Student sa unesenim brojem indeksa ne postoji.");
						
					break;
				
				//Pronalazenje studenata sa ocenom vecom od navedene
				case "3":
					//unosi se prag
					System.out.print("Unesite prag za ocenu studenta: ");
					double prag = Double.parseDouble(sc.nextLine());
					
					//sada mozemo da ispisemo studente sa ocenom vecom od praga
					System.out.println("Studenti sa ocenom vecom od praga su:\n");
					//sada ispisujemo sve studente koji imaju taj prosek
					for(int i = 0; i < proseci.size(); i++) {
						if(proseci.get(i) >= prag) {
							System.out.printf("%10s %10s %10s %5.2f \n", indeksi.get(i), imena.get(i), prezimena.get(i), proseci.get(i));
						}
					}
					break;
				
				//pronalazenje studenta sa najvisom prosecnom ocenom
				case "4":
					//prvo pronalazimo najvisu prosecnu ocenu
					
					//privremeno proglasimo da je prva ocena najvisa i poredimo je sa ostalim ocenama
					double maxProsek = proseci.get(0);
					for(int i = 1; i < proseci.size(); i++) {
						//ako je neka ocena veca od trenutnog maxProseka onda tu ocenu postavimo da je maxProsek
						if(maxProsek < proseci.get(i))
							maxProsek = proseci.get(i);
					}
					//nakon ove for petlja maxProsek ce sadrzati najveci prosek studenata
					//sada mozemo da ispisemo studente sa najvisom prosecnom ocenom
					System.out.println("Studenti sa najvisim prosekom su:\n");
					//sada ispisujemo sve studente koji imaju taj prosek
					for(int i = 0; i < proseci.size(); i++) {
						if(maxProsek == proseci.get(i)) {
							System.out.printf("%10s %10s %10s %5.2f \n", indeksi.get(i), imena.get(i), prezimena.get(i), proseci.get(i));
						}
					}
					
					break;
				
				//unos studenta
				case "5":
					//prvo od korisnika trazimo da unese podatke
					System.out.print("Unesite broj indeksa studenta: ");
					brIndeksa = sc.nextLine();
					System.out.print("Unesite ime studenta: ");
					String ime = sc.nextLine();
					System.out.print("Unesite prezime studenta: ");
					String prezime = sc.nextLine();
					System.out.print("Unesite prosecnu ocenu studenta: ");
					double prosek = Double.parseDouble(sc.nextLine());
					//unete podetke dodajemo u odgovarajuce liste (na kraj liste)
					indeksi.add(brIndeksa); 
					imena.add(ime);
					prezimena.add(prezime);
					proseci.add(prosek);
					System.out.println("Student je uspesno upisan.");
					break;
				
				//Brisanje studenta
				case "6":
					System.out.print("Unesite broj indeksa studenta: ");
					brIndeksa = sc.nextLine();
					
					//trazimo poziciju studenta u listi
					pozicija = indeksi.indexOf(brIndeksa);
					//ako postoji student sa tim brojem indeksa
					if(pozicija != -1) {
						indeksi.remove(pozicija);
						imena.remove(pozicija);
						prezimena.remove(pozicija);
						proseci.remove(pozicija);
						System.out.println("Student je uspesno obrisan.");
					}
					else
						System.out.println("Student sa unesenim brojem indeksa ne postoji.");
					
					break;
				
				//izmena podataka o studentu
				case "7":
					System.out.print("Unesite broj indeksa studenta: ");
					brIndeksa = sc.nextLine();
					
					//trazimo poziciju studenta u listi
					pozicija = indeksi.indexOf(brIndeksa);
					//ako postoji student sa tim brojem indeksa
					//onda unosimo novo ime i prezime
					if(pozicija != -1) {
						System.out.print("Unesite novo ime studenta: ");
						String novoIme = sc.nextLine();
						System.out.print("Unesite novo prezime studenta: ");
						String novoPrezime = sc.nextLine();
						
						//azuriramo podatke na odgovovarajucoj poziciji u nizu
						imena.set(pozicija, novoIme);
						prezimena.set(pozicija, novoPrezime);
						
						System.out.println("Student je uspesno promenjen.");
					}
					else
						System.out.println("Student sa unesenim brojem indeksa ne postoji.");
					
					break;
				
				//izmena prosecne ocene za studenta
				case "8":
					System.out.print("Unesite broj indeksa studenta: ");
					brIndeksa = sc.nextLine();
					
					//trazimo poziciju studenta u listi
					pozicija = indeksi.indexOf(brIndeksa);
					//ako postoji student sa tim brojem indeksa
					//onda unosimo novi prosek
					if(pozicija != -1) {
						System.out.print("Unesite novi prosek studenta: ");
						double noviProsek = Double.parseDouble(sc.nextLine());
						//azuriramo podatke na odgovovarajucoj poziciji u nizu
						proseci.set(pozicija, noviProsek);
						
						System.out.println("Prosek studenta je uspesno promenjen.");
					}
					else
						System.out.println("Student sa unesenim brojem indeksa ne postoji.");
					
					break;
					
			}


		} while (!opcija.equals("x"));

		sc.close();

	}

}
