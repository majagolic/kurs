package polazniciKursaMeni;

import java.util.ArrayList;
import java.util.Scanner;

public class polazniciKursa {

	public static void main(String[] args) {
		
		ArrayList<String> ime = new ArrayList<String>();
		ArrayList<String> prezime = new ArrayList<String>();
		ArrayList<Integer> prisustvo = new ArrayList<Integer>();
		
		ime.add("Strahinja");
		prezime.add("Golic");
		prisustvo.add(0);
		
		ime.add("Filip");
		prezime.add("Brkic");
		prisustvo.add(0);
		
		ime.add("Milan");
		prezime.add("Nedic");
		prisustvo.add(0);
		
		ime.add("Stefan");
		prezime.add("Jokic");
		prisustvo.add(0);
		
		ime.add("Maja");
		prezime.add("Vuletic");
		prisustvo.add(0);
		
		ime.add("Aleksandra");
		prezime.add("Ostojic");
		prisustvo.add(0);
		
		Scanner sc = new Scanner(System.in);
		
		String opcija;
		
		do {
			System.out.println("------------MENI---------------");
			System.out.println("1. Spisak polaznika kursa");
			System.out.println("2. Brisanje polaznika na osnovu pozicije");
			System.out.println("3. Brisanje polaznika na osnovu imena i prezimena");
			System.out.println("4. Uvecanje prisustva polaznika za jedan");
			System.out.println("x. Izlaz");
			System.out.print("Unesite opciju: ");
			
			opcija = sc.nextLine();
			
			switch(opcija) {
			
			//spisak
			
			case "1":
			 for (int i = 0; i < ime.size(); i++) {
			  System.out.printf("%10s %10s %3d \n", ime.get(i), prezime.get(i), prisustvo.get(i));
			}
			break;
			
			//brisanje na osnovu pozicije
			
			case "2":
				System.out.println("Unesite poziciju polaznika koga brisete: ");
				
				int indexZaBrisanje = Integer.parseInt(sc.nextLine());
				
				if(indexZaBrisanje != -1) {
		
				
				ime.remove(indexZaBrisanje);
				prezime.remove(indexZaBrisanje);
				prisustvo.remove(indexZaBrisanje);
				System.out.println("Polaznik je uspesno obrisan.");
				}
				else {
					System.out.println("Ne postoji polaznik sa navedenom pozicijom.");
				}
				break;
				
				//brisanje na osnovu imena i prezimena
				
			case "3":
				System.out.println("Unesite ime polaznika koga brisete:");
				String imeBrisi = sc.nextLine();
				System.out.println("Unesite pezime polaznika koga brisete:");
				String prezimeBrisi = sc.nextLine();
				
				indexZaBrisanje = -1;
				
				for(int i = 0; i<ime.size(); i++) {
					
					if(ime.get(i).equals(imeBrisi)&& prezime.get(i).equals(prezimeBrisi)){
						indexZaBrisanje = i;
						break;
					}
				}

				
				if(indexZaBrisanje != -1) {
					
					ime.remove(indexZaBrisanje);
					prezime.remove(indexZaBrisanje);
					prisustvo.remove(indexZaBrisanje);
					System.out.println("Polaznik je uspesno obrisan.");
					
				}
				else {
					
					System.out.println("Ne postoji polaznik sa navedenim imenom i prezimenom.");
					break;
				}
			//uvecanje prisustva za jedan
				
			case "4":
				
				System.out.println("Unesite ime polaznika kojem hocete da uvecate prisustvo: ");
				String uvecajIme = sc.nextLine();
				System.out.println("Unesite prezime polaznika kojem hocete da uvecate prisustvo: ");
				String uvecajPrezime = sc.nextLine();
				
				int indexUvecaj = -1;
				
				for(int i = 0; i < ime.size(); i++) {
					
					if(ime.get(i).equals(uvecajIme)&&prezime.get(i).equals(uvecajPrezime)) {
						
						indexUvecaj = i;
						
						break;
					}
				}
				if(indexUvecaj != -1) {
					
					int brojPrisustva = prisustvo.get(indexUvecaj);
					brojPrisustva++;
					prisustvo.set(indexUvecaj, brojPrisustva);
					System.out.println("Prisustvo polaznika uvecano je za jedan.");
				}
				else {
					System.out.println("Ne postoji polaznik sa navedenim imenom i prezimenom");
					break;
				}
			}
					
				
		}while(!opcija.equals("x"));
				
		sc.close();
	}
}

		
		

	
	



