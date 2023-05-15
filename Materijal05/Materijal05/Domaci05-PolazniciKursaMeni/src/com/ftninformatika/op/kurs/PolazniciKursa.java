package com.ftninformatika.op.kurs;

import java.util.ArrayList;
import java.util.Scanner;

//Kostur zadatka koji treba da se nadogradi
public class PolazniciKursa {

	public static void main(String[] args) {
		ArrayList<String> imena = new ArrayList<String>();
		ArrayList<String> prezimena = new ArrayList<String>();
		ArrayList<Integer> prisustvo = new ArrayList<Integer>();
		
		//Dodajemo sve podatke 1. polaznika na poziciju 0
		imena.add("Petar");
		prezimena.add("Petrovic");
		prisustvo.add(0);
		
		//Dodajemo sve podatke 2. polaznika na poziciju 1
		imena.add("Marko");
		prezimena.add("Markovic");
		prisustvo.add(0);
		
		//Dodajemo sve podatke 3. polaznika na poziciju 2
		imena.add("Ivana");
		prezimena.add("Ivanovic");
		prisustvo.add(0);
		
		//Dodajemo sve podatke 4. polaznika na poziciju 3
		imena.add("Jelena");
		prezimena.add("Jelic");
		prisustvo.add(0);
		
		//Dodajemo sve podatke 5. polaznika na poziciju 4
		imena.add("Tijana");
		prezimena.add("Tijanic");
		prisustvo.add(0);
		
		//Dodajemo sve podatke 6. polaznika na poziciju 5
		imena.add("Dragan");
		prezimena.add("Dragovic");
		prisustvo.add(0);

		Scanner sc = new Scanner(System.in);

		String opcija;

		do {
			System.out.println("*********** MENI **********");
			System.out.println("1. Spisak polaznika kursa");
			System.out.println("2. Brisanje polaznika na osnovu pozicije");
			System.out.println("3. Brisanje polaznika na osnovu imena i prezimena");
			System.out.println("4. Uvecanje prisustva polaznika za jedan");
			System.out.println("x. Izlaz");
			System.out.print("Unesite opciju: ");

			opcija = sc.nextLine();

			switch (opcija) {
				//spisak polaznika
				case "1":
					for (int i = 0; i < imena.size(); i++) {
						//10 mesta za imena i 5 mesta prosek odvojimo da bi podaci bili poravnati
						System.out.printf("%10s %10s %3d \n", imena.get(i), prezimena.get(i), prisustvo.get(i));
					}
					break;
					
				//brisanje na osnovu pozicije
				case "2":
					System.out.print("Unesite poziciju polaznika koga brisete: ");
					int indexZaBrisanje = Integer.parseInt(sc.nextLine());
					//ako postoji student sa tim brojem indeksa, prikazemo njegove podatke
					if(indexZaBrisanje != -1)  {
						//MORAMO obrisati sve 3 liste
						imena.remove(indexZaBrisanje);
						prezimena.remove(indexZaBrisanje);
						prisustvo.remove(indexZaBrisanje);
						System.out.println("Polaznik uspesno obrisan.");
					}
					else
						System.out.println("Ne postoji polaznik sa navedenom pozicijom.");
						
					break;
				
				//Pronalazenje studenata sa ocenom vecom od navedene
				case "3":
					System.out.print("Unesite ime polaznika koga brisete: ");
					String imeBrisi = sc.nextLine();
					System.out.print("Unesite prezime polaznika koga brisete: ");
					String prezimeBrisi = sc.nextLine();

					//stavimo da nije pronadjen, npr na -1
					indexZaBrisanje = -1;
					for(int i = 0; i < imena.size(); i++) {
						//Ako smo pronasli, stavimo da je indexBrisi i-ta pozicija
						//I moze break jer ne treba vise da prolazimo kroz listu, tj. zavrsavamo for petlju
						if(imena.get(i).equals(imeBrisi) && prezimena.get(i).equals(prezimeBrisi)) {
							indexZaBrisanje = i;
							break;
						}
					}
					
					//ako postoji polaznik sa tim imenom i prezimenom
					if(indexZaBrisanje != -1)  {
						//MORAMO obrisati sve 3 liste
						imena.remove(indexZaBrisanje);
						prezimena.remove(indexZaBrisanje);
						prisustvo.remove(indexZaBrisanje);
						System.out.println("Polaznik uspesno obrisan.");
					}
					else
						System.out.println("Ne postoji polaznik sa navedenim imenom i prezimenom.");
						
					break;

				//Pronalazenje studenata sa ocenom vecom od navedene
				case "4":
					System.out.print("Unesite ime polaznika kome uvecavagte prisustvo: ");
					String imeUvecaj = sc.nextLine();
					System.out.print("Unesite prezime polaznika kome uvecavate prisustvo: ");
					String prezimeUvecaj = sc.nextLine();

					//stavimo da nije pronadjen, npr na -1
					int indexUvecaj = -1;
					for(int i = 0; i < imena.size(); i++) {
						//Ako smo pronasli, stavimo da je indexUvecaj i-ta pozicija
						//I moze break jer ne treba vise da prolazimo kroz listu, tj. zavrsavamo for petlju
						if(imena.get(i).equals(imeUvecaj) && prezimena.get(i).equals(prezimeUvecaj)) {
							indexUvecaj = i;
							break;
						}
					}
					
					//ako postoji polaznik sa tim imenom i prezimenom
					if(indexUvecaj != -1)  {
						//stari broj prisustva
						int brojPrisustva = prisustvo.get(indexUvecaj);
						//uvecamo za 1
						brojPrisustva++;
						//azuriramo listu
						prisustvo.set(indexUvecaj, brojPrisustva);
						System.out.println("Prisustvo polaznika uvecano za jedan.");
					}
					else
						System.out.println("Ne postoji polaznik sa navedenim imenom i prezimenom.");
						
					break;
				
			
					
			}


		} while (!opcija.equals("x"));

		sc.close();

	}

}
