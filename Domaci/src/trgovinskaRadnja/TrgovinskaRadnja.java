package trgovinskaRadnja;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrgovinskaRadnja {
	
	public static ArrayList<String> identifikatori = new ArrayList<String>();
	public static ArrayList<String> nazivi = new ArrayList<String>();
	public static ArrayList<Double> cene = new ArrayList<Double>();
	
	public static Scanner scanner = new Scanner(System.in);
	
public static void load(String path) {
		
		identifikatori = new ArrayList<String>();
		nazivi = new ArrayList<String>();
		cene = new ArrayList<Double>();
		
		List<String> lines;
		try {
			lines = Files.readAllLines(Paths.get(path));
			
			for (String line: lines) {
				
				String[] attributes = line.split(";");
				
				String id = attributes[0];
				String naziv = attributes[1]; 
				double cena = Double.parseDouble(attributes[2]); 
				
				identifikatori.add(id);
				nazivi.add(naziv);
				cene.add(cena);
				
			}
		} catch (Exception e) {
			System.out.println("Datoteka " + path + " nije pronađena.");
		}	
	}
				
public static void ispisProizvodaPoID() {
	
	System.out.println("Identifikator proizvoda: ");
	String id = scanner.nextLine().trim();

	for (int i = 0; i < identifikatori.size(); i++) {
		//Ukoliko pronađemo traženi proizvod, ispisujemo podatke o njemu i izlazimo iz metode
		if(identifikatori.get(i).equals(id)) {
			System.out.printf("%5s %15s %15s\n", "Id", "Naziv proizvoda", "Cena proizvoda");
			System.out.println("--------------------------------------------------------------------------------");
			System.out.printf("%5s %15s %15.2f\n", identifikatori.get(i), nazivi.get(i), cene.get(i));	
			return;
		}
	}
	System.out.println("Proizvod sa zadatim identifikatorom ne postoji.");
}
	
	
public static void unosProizvoda() {

	String id;
	String naziv;
	double cena;
	
	System.out.print("Identifikator: ");
	id = scanner.nextLine();
	
	System.out.print("Naziv proizvoda: ");
	naziv = scanner.nextLine();
	
	String cenaString;
	do {
		System.out.print("Cena: ");
		cenaString = scanner.nextLine();
	} while(!isDouble(cenaString));
	
	cena = Double.parseDouble(cenaString);

	//dodavanje unosa u kolekcije
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
		nazivi.add(naziv);
		cene.add(cena);

		System.out.println("Proizvod je uspešno dodat.");
		
	} else {
		System.out.println("Došlo je do greške. Proizvod nije dodat.");
	}
}

public static boolean isDouble(String doubleString) {
	try {
		Double.parseDouble(doubleString);
	} catch (Exception e) {
		return false;
	}
	return true;
}

public static void pretragaProizvodaPoNazivu() {

	System.out.println("Unesite naziv proizvoda: ");
	String naziv = scanner.nextLine();
	System.out.printf("%5s %15s %15s\n", "Id", "Naziv proizvoda", "Cena proizvoda");
	System.out.println("----------------------------------------------------------------------------");
	
	//prolazimo kroz listu na standardan naèin
	for (int i = 0; i < nazivi.size(); i++) {
		//Ukoliko pronađemo traženi proizvod, ispisujemo podatke o njemu i nastavljamo pretragu
		if(nazivi.get(i).equals(naziv)) {
			System.out.printf("%5s %15s %15.2f\n", identifikatori.get(i), nazivi.get(i), 
					cene.get(i));		
		}
	}
}

public static void izmenaProizvoda() {

	System.out.println("Identifikator proizvoda za izmenu: ");
	String id = scanner.nextLine().trim();

	//prolazimo kroz listu na standardan način
	for (int i = 0; i < identifikatori.size(); i++) {
		/*
		 * Ukoliko pronađemo traženi proizvod, tražimo od korisnika da unese nove vrednosti 
		 * za naziv i cenu
		 */
		if(identifikatori.get(i).equals(id)) {
			//Unos novog naziva
			System.out.print("Naziv proizvoda: ");
			String naziv = scanner.nextLine();
		
			//Unos i parsiranje cene
			String cenaString = null;
			double cena;
			do {
				System.out.print("Cena: ");
				cenaString = scanner.nextLine();
			} while(!isDouble(cenaString));
			
			cena = Double.parseDouble(cenaString);		

			//dodavanje novih vrednosti u kolekcije
			nazivi.set(i,naziv);
			cene.set(i,cena);
			System.out.println("Proizvod je uspešno izmenjen.");
			return;
		}
	}
	
	System.out.println("Proizvod sa zadatim identifikatorom ne postoji.");
}

public static void brisanjeProizvoda() {

	System.out.println("Identifikator proizvoda za brisanje: ");
	String id = scanner.nextLine().trim();

	//prolazimo kroz listu na standardan naèin
	for (int i = 0; i < identifikatori.size(); i++) {
		//Ukoliko pronađemo traženi proizvod, brišemo ga
		if(identifikatori.get(i).equals(id)) {
			identifikatori.remove(i);
			nazivi.remove(i);
			cene.remove(i);		
			return;
		}
	}
	
	System.out.println("Proizvod sa zadatim identifikatorom ne postoji.");

}	

public static void save(String path) {
	
	/*
	 * lista koja će se popuniti redovima u formatu:
	 * identifikator;naziv;cena
	 */
	ArrayList<String> lines = new ArrayList<String>();
	
	//prolazimo kroz listu na standardan način
	for (int i = 0; i < identifikatori.size(); i++) {
		/*
		 * Kreiramo String line koji predstavlja jedan red u tekstualnoj datoteci a sadrži informacije o pojedinačnom proizvodu
		 */ 
		String line = identifikatori.get(i) + ";" + nazivi.get(i) + ";" + cene.get(i);
		lines.add(line);
	}
	
	//Pokušavamo da upišemo podatke iz liste stringova lines u datoteku na putanji path
	try {
		Files.write(Paths.get(path), lines, StandardOpenOption.WRITE, StandardOpenOption.CREATE,
				StandardOpenOption.TRUNCATE_EXISTING);
	} catch (Exception e) {
		System.out.println("Datoteka " + path + " nije pronađena.");
		e.printStackTrace();
	}
}

public static void ispisProizvoda() {

	System.out.printf("%5s %15s %15s\n", "Id", "Naziv proizvoda", "Cena proizvoda");
	System.out.println("--------------------------------------------------------------------------");
	//Prolazimo for petljom kroz kolekcije
	for(int i = 0; i < identifikatori.size(); i++) {
		System.out.printf("%5s %15s %15.2f\n", identifikatori.get(i), nazivi.get(i), cene.get(i));
	}
}

public static void main(String[] args) {
		
		load("./src/trgovinskaRadnja/proizvodi.txt");
		
		String answer = null;
		
		do {

			System.out.println("Meni:");
			System.out.println("1. Ispis svih proizvoda");
			System.out.println("2. Ispis proizvoda po identifikatoru");
			System.out.println("3. Unos proizvoda");
			System.out.println("4. Izmena proizvoda");
			System.out.println("5. Brisanje proizvoda");
			System.out.println("6. Pretraga proizvoda po nazivu");
			System.out.println("x. Izlaz");

			answer = scanner.nextLine();

			switch (answer) {
			case "1":
				ispisProizvoda();
				break;
			case "2":
				ispisProizvodaPoID();
				break;
			case "3":
				unosProizvoda();
				break;
			case "4":
				izmenaProizvoda();
				break;
			case "5":
				brisanjeProizvoda();
				break;
			case "6":
				pretragaProizvodaPoNazivu();
				break;
			}

		} while (!answer.equals("x"));
		
		save("./src/trgovinskaRadnja/proizvodi.txt");
		scanner.close();


	}

}


		
	
