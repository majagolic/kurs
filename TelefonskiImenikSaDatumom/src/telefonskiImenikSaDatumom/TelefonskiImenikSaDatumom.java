package telefonskiImenikSaDatumom;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TelefonskiImenikSaDatumom {
	
	public static ArrayList<Integer> identifikatori = new ArrayList<Integer>();
	public static ArrayList<String> imena = new ArrayList<String>();
	public static ArrayList<String> prezimena = new ArrayList<String>();
	public static ArrayList<String> radnaMesta = new ArrayList<String>();
	public static ArrayList<String> brojeviProstorije = new ArrayList<String>();
	public static ArrayList<Integer> lokali = new ArrayList<Integer>();
	public static ArrayList<LocalDate> datumi = new ArrayList<LocalDate>();
	
	
	public static Scanner scanner = new Scanner(System.in);
	public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
	
	
	public static void load(String path) {
		identifikatori = new ArrayList<Integer>();
		imena = new ArrayList<String>();
		prezimena = new ArrayList<String>();
		radnaMesta = new ArrayList<String>();
		brojeviProstorije = new ArrayList<String>();
		lokali = new ArrayList<Integer>();
		datumi = new ArrayList<LocalDate>();
		
		List<String> lines;
		try {
			
			lines = Files.readAllLines(Paths.get(path));
			
			for (String line: lines) {
			
				String[] attributes = line.split(";");
				
				int id = Integer.parseInt(attributes[0]); 
				String ime = attributes[1];
				String prezime = attributes[2]; 
				String radnoMesto = attributes[3]; 
				String brojProstorije = attributes[4]; 
				int brojLokala = Integer.parseInt(attributes[5]);
				LocalDate datum = LocalDate.parse(attributes[6], formatter);
				
				identifikatori.add(id);
				imena.add(ime);
				prezimena.add(prezime);
				radnaMesta.add(radnoMesto);
				brojeviProstorije.add(brojProstorije);
				lokali.add(brojLokala);
				datumi.add(datum);

			}
		} catch (Exception e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
			e.printStackTrace();
		}	
	}
	
	
	public static void ispisKontakata() {

		System.out.printf("%15s %15s %15s %25s %15s %15s %20s \n", "ID" ,"Ime", "Prezime", "Radno mesto", "Broj prostorije", "Broj lokala", "Datum unosa");
		System.out.println("--------------------------------------------------------------------------------");
		
		for(int i = 0; i < identifikatori.size(); i++) {
			System.out.printf("%15d %15s %15s %15s %15s %15d %15s \n", identifikatori.get(i), imena.get(i), prezimena.get(i),radnaMesta.get(i), brojeviProstorije.get(i), lokali.get(i),  formatter.format(datumi.get(i)));
		}
	}
	
	public static boolean isNumber(String string) {
		try {
			Integer.parseInt(string);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public static boolean postojeciID(int id) {
		
		for (int i=0; i<identifikatori.size(); i++) {
			if (id == identifikatori.get(i)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isDate(String datum) {
		try {
			LocalDate.parse(datum, formatter);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	
	public static void unesiKontakt() {
		
		int id;
		String ime;
		String prezime;
		String radnoMesto;
		String brojProstorije;
		int brojLokala;
		LocalDate datum;
		
		String idKontakta = null;
		
		do {
		System.out.print("Identifikator: ");
		
		idKontakta = scanner.nextLine();
		id = Integer.parseInt(idKontakta);
		
		} while(!isNumber(idKontakta) || postojeciID(id));
		
		System.out.print("Ime kontakta: ");
		ime = scanner.nextLine();
		
		System.out.print("Prezime kontakta: ");
		prezime = scanner.nextLine();
		
		System.out.print("Naziv radnog mesta kontakta: ");
		radnoMesto = scanner.nextLine();
		
		System.out.print("Broj prostorije: ");
		brojProstorije = scanner.nextLine();
		
		String brLokala;
		do {
			System.out.print("Broj lokala: ");
			brLokala = scanner.nextLine();
		} while(!isNumber(brLokala));
		
		brojLokala = Integer.parseInt(brLokala);
		
		String datumString = null;
		do {
			System.out.print("Datum: ");
			datumString = scanner.nextLine();
		} while (!isDate(datumString));
		
		datum = LocalDate.parse(datumString,formatter);

		//proveravamo da li kontakt sa unetim identifikatorom već postoji
		boolean pronadjeno = false;
		for (int i=0; i<identifikatori.size(); i++) {
			if (identifikatori.get(i).equals(id)) {
				pronadjeno = true;
				break;
			}
		}
		//ukoliko nije pronadjen, možemo ga dodati u kolekcije
		if (!pronadjeno) {
			identifikatori.add(id);
			imena.add(ime);
			prezimena.add(prezime);
			radnaMesta.add(radnoMesto);
			brojeviProstorije.add(brojProstorije);
			lokali.add(brojLokala);
			datumi.add(datum);

			System.out.println("Kontakt je uspešno dodat.");
			
		} else {
			System.out.println("Došlo je do greške. Kontakt nije dodat.");
		}
	
		
	}
	
	public static void save(String path) {
		
		ArrayList<String> lines = new ArrayList<String>();
		
		for (int i = 0; i < identifikatori.size(); i++) {
			
			String line = identifikatori.get(i) + ";" + imena.get(i) + ";" + prezimena.get(i) + ";" + radnaMesta.get(i) + ";" + brojeviProstorije.get(i) + ";" + lokali.get(i) + ";" +  formatter.format(datumi.get(i));
			lines.add(line);
		}
		
		//Pokušavamo da upišemo podatke iz liste stringova lines u datoteku na putanji path
		try {
			Files.write(Paths.get(path), lines, StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
		} catch (Exception e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
			e.printStackTrace();
		}
	}

	public static void izmenaKontakta() {

		String idKontakta = null;
		do {
			System.out.println("Unesite identifikacioni broj kontakta: ");
			idKontakta = scanner.nextLine();
		} while(!isNumber(idKontakta) || !postojeciID(Integer.parseInt(idKontakta)));
		
		int id = Integer.valueOf(idKontakta);
		String ime;
		String prezime;
		String nazivRadnogMesta;
		String brojProstorije;
		int brojLokala;
		LocalDate datum = null;
		
		System.out.print("Ime kontakta: ");
		ime = scanner.nextLine();
		System.out.print("Prezime kontakta: ");
		prezime = scanner.nextLine();
		System.out.print("Naziv radnog mesta: ");
		nazivRadnogMesta = scanner.nextLine();
		System.out.print("Broj prostorije: ");
		brojProstorije = scanner.nextLine();
		String brLokala = null;
		do {
			System.out.print("Broj lokala: ");
			brLokala = scanner.nextLine();
		} while(!isNumber(brLokala));
		brojLokala = Integer.valueOf(brLokala);
		
		String strDatum;
		do {
			System.out.println("Datum: ");
			strDatum = scanner.nextLine();
		} while (!isDate(strDatum));
		
		datum = LocalDate.parse(strDatum, formatter);
		
		int i = identifikatori.indexOf(id);
		if (i > -1) {
			imena.set(i, ime); 
			prezimena.set(i, prezime);
			radnaMesta.set(i, nazivRadnogMesta);
			brojeviProstorije.set(i, brojProstorije);
			lokali.set(i, brojLokala);
			datumi.set(i, datum);
			System.out.println("Izmena je uspešno izvršena.");
		}
	}
		
		
	public static void kontaktiULokalu() {
		
		String brLokala = null;
		do {
			System.out.println("Unesite broj lokala: ");
			brLokala = scanner.nextLine();
		} while(!isNumber(brLokala));
		
		int brojLokala = Integer.valueOf(brLokala);
		printFormatedHeader();
		
		//prolazimo kroz listu na standardan načn
		for (int i = 0; i < lokali.size(); i++) {
			if(lokali.get(i) == brojLokala) {
				printContactData(i);
			} 
		}
	}

	public static void kontaktiNaIstomRadnomMestu() {

		System.out.println("Unesite naziv radnog mesta: ");
		String radnoMesto = scanner.nextLine();
		printFormatedHeader();
		for (int i = 0; i < radnaMesta.size(); i++) {
			if(radnaMesta.get(i).equalsIgnoreCase(radnoMesto)) {
				printContactData(i);
			}
		}
	}
		
	public static void kontaktiSaIstimImenom() {

		System.out.println("Unesite ime kontakta: ");
		String ime = scanner.nextLine();
		printFormatedHeader();
		
		for (int i = 0; i < imena.size(); i++) {
			if (imena.get(i).equalsIgnoreCase(ime)) {
				printContactData(i);
			}
		}
	}
	
	public static void kontaktiPoUslovima8() {

		System.out.println("Unesite ime kontakta: ");
		String ime = scanner.nextLine();
		System.out.println("Unesite prezime kontakta: ");
		String prezime = scanner.nextLine();
		System.out.println("Unesite pocetna slova naziva radnog mesta: ");
		String radnoMesto = scanner.nextLine();
		printFormatedHeader();
		//prolazimo kroz listu na standardan načn
		for (int i = 0; i < identifikatori.size(); i++) {
			
			if (imena.get(i).equalsIgnoreCase(ime) && prezimena.get(i).equalsIgnoreCase(prezime) &&
					radnaMesta.get(i).toLowerCase().startsWith(radnoMesto.toLowerCase())) {
				printContactData(i);
			}
		}
	}

	public static void brisanjeKontakta() {

		int id;
		String idKontakta = null;
		do {
			System.out.println("Identifikacioni broj kontakta za brisanje: ");
			idKontakta = scanner.nextLine().trim();
		} while(!isNumber(idKontakta));
		
		id = Integer.parseInt(idKontakta);

		for (int i = 0; i < identifikatori.size(); i++) {
			//Ukoliko pronađemo traženi kontakt, brišemo ga
			if(identifikatori.get(i) == id) {
				identifikatori.remove(i);
				imena.remove(i);
				prezimena.remove(i);
				radnaMesta.remove(i);
				brojeviProstorije.remove(i);
				lokali.remove(i);
				datumi.remove(i);
				return;
			}
		}
		
		System.out.println("Kontakt sa zadatim brojem ne postoji.");

	}
		
		//Štampa zaglavlje za tabelarni ispis kontakata
		public static void printFormatedHeader() {
			System.out.printf("%15s %15s %15s %25s %15s %15s %20s \n", 
					"Id", "Ime kontakta", "Prezime kontakta", "Naziv radnog mesta",
					"Broj prostorije", "Broj lokala", "Datum");
			System.out.println("-------------------------------------------------------------------------------------------------------------------------------------");
			
		}
	
	
	//Štampa formatirane podatke o jednom kontaktu
		public static void printContactData(int index) {
			System.out.printf("%15d %15s %15s %25s %15s %15d %20s \n",
					identifikatori.get(index), imena.get(index), prezimena.get(index),
					radnaMesta.get(index), brojeviProstorije.get(index), lokali.get(index),
					formatter.format(datumi.get(index)));
		
		}
		
	
	public static void main(String[] args) {
		
		if(Files.exists(Paths.get("kontakti.txt"))) {
			load("kontakti.txt");
		}
		
		String answer = null;

		do {

			System.out.println("Meni:");
			System.out.println("1. Unesi kontakt");
			System.out.println("2. Ispis svih kontakata");
			System.out.println("3. Izmena kontakta");
			System.out.println("4. Ispis kontakata u istom lokalu");
			System.out.println("5. Ispis kontakata sa istim radnim mestom");
			System.out.println("6. Ispis kontakata sa istim imenom");
			System.out.println("7. Ispis sa istim imenom, prezimenom i nazivom radnog mesta koje počnje sa prosleđenim stringom");
			System.out.println("8. Brisanje kontakta");
			System.out.println("x. Izlaz");

			answer = scanner.nextLine();

			switch (answer) {
			case "1":
				unesiKontakt();
				break;
		    case "2":
		    	ispisKontakata();
				break;
			case "3":
				izmenaKontakta();
				break;
			case "4":
				kontaktiULokalu();
				break;
			case "5":
				kontaktiNaIstomRadnomMestu();
				break;
			case "6":
				kontaktiSaIstimImenom();
				break;
			case "7":
				kontaktiPoUslovima8();
				break;
			case "8":
				brisanjeKontakta();
				break;
		    case "x":
				break;
			default:
				System.out.println("Pogrešan izbor opcije. Pokušajte ponovo.");
				
			}
			
		} while (!answer.equals("x"));

		save("kontakti.txt");
		scanner.close();
		}

	}
		
