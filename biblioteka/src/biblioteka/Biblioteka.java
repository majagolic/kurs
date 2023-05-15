package biblioteka;

import java.util.ArrayList;
import java.util.Scanner;


public class Biblioteka {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> clanskiBroj = new ArrayList<Integer>();
		ArrayList<String> ime = new ArrayList<String>();
		ArrayList<String> prezime = new ArrayList<String>();
		ArrayList<Integer> sifraKnjige = new ArrayList<Integer>();
		ArrayList<String> naslov = new ArrayList<String>();
		ArrayList<String> nazivAutora = new ArrayList<String>();

		//clanski brojevi

		clanskiBroj.add(15);
		clanskiBroj.add(21);
		clanskiBroj.add(32);

		//imena

		ime.add("Maja");
		ime.add("Sanja");
		ime.add("Olivera");

		//prezimena

		prezime.add("Golic");
		prezime.add("Vuletic");
		prezime.add("Gajin");

		//sifra knjige

		sifraKnjige.add(123);
		sifraKnjige.add(500);
		sifraKnjige.add(81);

		//naslov

		naslov.add("Stranac");
		naslov.add("Jadi mladog Vertera");
		naslov.add("Zlocin i kazna");

		//naziv autora

		nazivAutora.add("Alber Kami");
		nazivAutora.add("Gete");
		nazivAutora.add("Dostojevski");


		Scanner sc = new Scanner(System.in);

		String opcija;

		do {
		System.out.println("*********** MENI **********");
		System.out.println("1. Unos člana ");
		System.out.println("2. Prikaz svih članova");
		System.out.println("3. Brisanje člana (za člana koji se briše unosi se članski broj)");
		System.out.println("4. Izmena člana (za člana koji se menja unosi se članski broj) ");
		System.out.println("5. Pretraga članova po članskom broju");
		System.out.println("6. Unos knjige");
		System.out.println("7. Prikaz svih knjiga");
		System.out.println("8. Brisanje knjige (za knjigu koja se briše unosi se šifra knjige)");
		System.out.println("9. Izmena knjige (za knjigu koja se menja unosi se šifra knjige)");
		System.out.println("10.Pretraga knjiga po autoru (ignorišu se velika i mala slova, može biti više knjiga istog autora)");
		System.out.println("11.Pretraga knjiga po naslovu (ignorišu se velika i mala slova, može biti više knjiga sa istim naslovom)");
		System.out.println("x. Izlaz");
		System.out.print("Unesite opciju: ");


		opcija = sc.nextLine();

		switch (opcija) {

		//Unos clana

		case "1":
		System.out.print("Unesite clanski broj novog clana: ");
		int clBroj= Integer.parseInt(sc.nextLine());
		System.out.print("Unesite ime novog clana: ");
		String imeClana = sc.nextLine();
		System.out.print("Unesite prezime novog clana: ");
		String prezimeClana = sc.nextLine();

		//unete podetke dodajemo u odgovarajuce liste (na kraj liste)
		clanskiBroj.add(clBroj);
		ime.add(imeClana);
		prezime.add(prezimeClana);
		System.out.println("Clan je uspesno dodat.");
		break;


		   //Prikaz svih članova
		case "2":
		for (int i = 0; i < ime.size(); i++) {

		System.out.printf("%5d %10s %10s\n", clanskiBroj.get(i), ime.get(i), prezime.get(i));
		}
		break;

		//Brisanje člana (za člana koji se briše unosi se članski broj)

		case "3":
		System.out.print("Unesite clanski broj clana: ");
		clBroj = Integer.parseInt(sc.nextLine());

		int pozicija = clanskiBroj.indexOf(clBroj);

		if(pozicija != -1) {
		clanskiBroj.remove(pozicija);
		ime.remove(pozicija);
		prezime.remove(pozicija);

		System.out.println("Clan je uspesno obrisan.");
		}
		else
		System.out.println("Clan sa unesenim clanskim brojem ne postoji.");

		break;

		//Izmena člana (za člana koji se menja unosi se članski broj)

		case "4":

		System.out.print("Unesite clanski broj clana: ");
		clBroj = Integer.parseInt(sc.nextLine());

		//trazimo poziciju
		pozicija = clanskiBroj.indexOf(clBroj);

		if(pozicija != -1) {
		System.out.print("Unesite novo ime clana: ");
		String novoIme = sc.nextLine();
		System.out.print("Unesite novo prezime clana: ");
		String novoPrezime = sc.nextLine();

		//azuriramo podatke na odgovovarajucoj poziciji u nizu
		ime.set(pozicija, novoIme);
		prezime.set(pozicija, novoPrezime);

		System.out.println("Clan je uspesno promenjen.");
		}
		else
		System.out.println("Clan sa unesenim clanskim brojem ne postoji.");

		break;

		//Pretraga članova po članskom broju

		case "5":
		System.out.print("Unesite clanski broj clana: ");
		clBroj = Integer.parseInt(sc.nextLine());
		pozicija = clanskiBroj.indexOf(clBroj);
		//ako postoji clan sa tim clanskim brojem, prikazemo njegove podatke
		if(pozicija != -1)  {
			System.out.printf("%5d %10s %10s\n", clanskiBroj.get(pozicija), ime.get(pozicija), prezime.get(pozicija));
		}
		else
		System.out.println("Student sa unesenim clanskim brojem ne postoji.");

		break;

		//unos knige
		
		case "6":
			
			System.out.println("Unesite sifru nove knjige: ");
			int sifra= Integer.parseInt(sc.nextLine());
			System.out.println("Unesite naslov nove knjige: ");
			String naziv = sc.nextLine();
			System.out.println("Unesite autora nove knjige: ");
			String autor = sc.nextLine();
			
			//unete podetke dodajemo u odgovarajuce liste (na kraj liste)
			sifraKnjige.add(sifra);
			naslov.add(naziv);
			nazivAutora.add(autor);
			System.out.println("Knjiga je uspesno dodata.");
			break;
			
		
		//prikaz svih knjiga
			
		case "7":
			
			for (int i = 0; i < naslov.size(); i++) {

				System.out.printf("%5d %10s %10s\n",sifraKnjige.get(i), naslov.get(i), nazivAutora.get(i));
				}
				break;

		//Brisanje knjige (za knjigu koja se briše unosi se šifra knjige)	
				
		case "8":
			
			System.out.print("Unesite sifru knige: ");
			sifra = Integer.parseInt(sc.nextLine());

			int pozicijaKnjige = sifraKnjige.indexOf(sifra);

			if(pozicijaKnjige != -1) {
			sifraKnjige.remove(pozicijaKnjige);
			naslov.remove(pozicijaKnjige);
			nazivAutora.remove(pozicijaKnjige);

			System.out.println("Knjiga je uspesno obrisana.");
			}
			else
			System.out.println("Knjiga sa unesenom sifrom ne postoji.");

			break;

			//izmena knjige(za knjigu koja se menja unosi se sifra knige)
			
		case "9":
			
			System.out.print("Unesite sifru knjige: ");
			sifra= Integer.parseInt(sc.nextLine());

			//trazimo poziciju
			pozicijaKnjige = sifraKnjige.indexOf(sifra);

			if(pozicijaKnjige != -1) {
			System.out.print("Unesite novi nasliv knjige: ");
			naziv = sc.nextLine();
			System.out.print("Unesite novg autora knjige: ");
			autor = sc.nextLine();
			
			//azuriramo podatke na odgovovarajucoj poziciji u nizu
			naslov.set(pozicijaKnjige, naziv);
			nazivAutora.set(pozicijaKnjige, autor);

			System.out.println("Knjiga je uspesno promenjena.");
			}
			else
			System.out.println("Kniga sa unesenom sifrom ne postoji.");

			break;
			
			//Pretraga knjiga po autoru(ignorišu se velika i mala slova, može biti više knjiga istog autora)

		case "10":
			System.out.print("Unesite autora knjige: ");
			autor = sc.nextLine();
			boolean pronadjen = false;
			
			//pronalazimo index knjige koji se menja;
			for(int i = 0; i < nazivAutora.size(); i++) {
				String tekuciAutor = nazivAutora.get(i);
				//poredimo sa equalsIgnoreCase sto omogucuje da se ne razlikuju velika i mala slova npr: a == a i A == A i a == A
				if(tekuciAutor.equalsIgnoreCase(autor)) {
					System.out.printf("%5d %-30s %10s \n", sifraKnjige.get(i), naslov.get(i), nazivAutora.get(i));
					pronadjen = true;
				}
			}
			
			//ako nema knjige sa navedenim naslovom poruka o tome
			if(!pronadjen)
				System.out.println("Ne postoji knjiga sa navedenim autorom");
			break;
			
			//Pretraga knjiga po naslovu(ignorišu se velika i mala slova, može biti više knjiga sa istim naslovom)

		case "11":
			
			System.out.print("Unesite naziv knjige: ");
			naziv = sc.nextLine();
			//indikator da li smo pronasli bar jednu knjigu sa navedenim naslovom
			pronadjen = false;
			
			//pronalazimo index knjige koji se menja;
			for(int i = 0; i < naslov.size(); i++) {
				String tekucaKnjiga = naslov.get(i);
				//poredimo sa equalsIgnoreCase sto omogucuje da se ne razlikuju velika i mala slova npr: a == a i A == A i a == A
				if(tekucaKnjiga.equalsIgnoreCase(naziv)) {
					System.out.printf("%5d %-30s %10s \n", sifraKnjige.get(i), naslov.get(i), nazivAutora.get(i));
					pronadjen = true;
				}
			}
			//ako nema knjige sa navedenim naslovom poruka o tome
			if(!pronadjen)
				System.out.println("Ne postoji knjiga sa navedenim nazivom");
			break;
		}

		}while (!opcija.equals("x"));
		

		}

}
