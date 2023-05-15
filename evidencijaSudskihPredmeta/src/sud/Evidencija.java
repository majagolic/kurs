package sud;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


public class Evidencija {
	
	private String nazivSuda = "";
	private String adresaSuda = "";
	private ArrayList<Predmet> spisakPredmeta = new ArrayList<Predmet>();
	
	
	
	public Evidencija() {
		
	}



	public Evidencija(String nazivSuda, String adresaSuda) {
	
		this.nazivSuda = nazivSuda;
		this.adresaSuda = adresaSuda;
		this.spisakPredmeta = new ArrayList<Predmet>();
	}



	public String getNazivSuda() {
		return nazivSuda;
	}



	public void setNazivSuda(String nazivSuda) {
		this.nazivSuda = nazivSuda;
	}



	public String getAdresaSuda() {
		return adresaSuda;
	}



	public void setAdresaSuda(String adresaSuda) {
		this.adresaSuda = adresaSuda;
	}



	public ArrayList<Predmet> getSpisakPredmeta() {
		return spisakPredmeta;
	}



	public void setSpisakPredmeta(ArrayList<Predmet> spisakPredmeta) {
		this.spisakPredmeta = spisakPredmeta;
	}
	
	
	public boolean dodajPredmet(Predmet noviPredmet) {
		
		for (int i = 0; i < spisakPredmeta.size(); i++) {
			if(noviPredmet.getBroj() == spisakPredmeta.get(i).getBroj()) {
				System.out.println("Predmet vec postoji.");
					return false;
				}
		}
			spisakPredmeta.add(noviPredmet);
			System.out.println("Predmet uspesno dodat.");
			return true;
			
		}
	
	public void ispisPredmeta() {
		for (int i = 0; i < spisakPredmeta.size(); i++) {
			System.out.println(spisakPredmeta.get(i));
		}
	}
	
	public boolean obrisiPredmet(int broj) {
		
		for (int i = 0; i < spisakPredmeta.size(); i++) {
			if(spisakPredmeta.get(i).getBroj() == broj) {
				spisakPredmeta.remove(i);
				System.out.println("Uspesno brisanje!");
				return true;
			}
			
		}
		System.out.println("Ne postoji predmet pod unesenim brojem.");
		return false;
		}
	
	public boolean izmeniPredmet(Predmet noviPredmet) {
		for (int i = 0; i < spisakPredmeta.size(); i++) {
			if(spisakPredmeta.get(i).getBroj() == noviPredmet.getBroj()) {
				spisakPredmeta.set(i, noviPredmet);
				System.out.println("Uspesno izmenjen predmet.");
				return true;
			}
		}
		System.out.println("Predmet ne postoji.");
		return false;
		
	}
	
	public void ispisNaOsnovuBroja(int brojPredmeta ) {
		
		for (int i = 0; i < spisakPredmeta.size();  i++) {
			if(spisakPredmeta.get(i).getBroj() == brojPredmeta){
				System.out.println(spisakPredmeta.get(i));
				return;
			}
		}
		System.out.println("Predmet ne postoji.");
	}
	
	public void ispisNaOsnovuImena(String imePredmeta) {
		
		boolean pronadjen = false;
		for (int i = 0; i < spisakPredmeta.size(); i++) {
			if(spisakPredmeta.get(i).getNaziv().equals(imePredmeta)) {
				System.out.println(spisakPredmeta.get(i));
				pronadjen = true;
			}
		}
		if(!pronadjen) {
			System.out.println("Predmet sa zadatim imenom ne postoji.");
		}
	}
	
	public void dodajTekst(String noviTekst, int brojPredmeta) {
		
		for (int i = 0; i < spisakPredmeta.size();  i++) {
			if(spisakPredmeta.get(i).getBroj() == brojPredmeta){
				String tekstZaDodavanje = spisakPredmeta.get(i).getTekst() + " " + noviTekst;
				spisakPredmeta.get(i).setTekst(tekstZaDodavanje);
				return;
				}
			}
		System.out.println("Predmet ne postoji.");
		}
	
	
	public void ispisPredmetaUOpseguDatuma(LocalDate min, LocalDate max) {
		
		for (int i = 0; i < spisakPredmeta.size(); i++) {
			
			if(spisakPredmeta.get(i).getDatum().compareTo(min) >= 0 && spisakPredmeta.get(i).getDatum().compareTo(max) <= 0){
				System.out.println(spisakPredmeta.get(i));
			}
			
		}
	}
	
	public void save(String path) {
		
		ArrayList<String> lines = new ArrayList<String>();
	
		lines.add(this.nazivSuda);
		lines.add(this.adresaSuda);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		
		for (int i = 0; i < this.spisakPredmeta.size(); i++) {
			
			String line3 = spisakPredmeta.get(i).getBroj() + ";" + spisakPredmeta.get(i).getNaziv() + ";" + spisakPredmeta.get(i).getTekst() + ";" + dtf.format(spisakPredmeta.get(i).getDatum());
			lines.add(line3);
			try {
				Files.write(Paths.get(path), lines, Charset.defaultCharset(), StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE); 
			} catch (IOException e) {
				System.out.println("File " + path + " not found.");
			}
		}
	}
	
	
	public void load(String putanja) {
		
		try {
			List<String> lines = Files.readAllLines(Paths.get(putanja));
			
			nazivSuda = lines.get(0);
			adresaSuda = lines.get(1);
			
			spisakPredmeta.clear();
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
			
			for (int i = 2; i < lines.size(); i++) {
				String linija = lines.get(i);
				String[] podaciOPr = linija.split(";");
				
				Predmet predmet = new Predmet(Integer.parseInt(podaciOPr[0]), podaciOPr[1], podaciOPr[2], LocalDate.parse(podaciOPr[3], dtf));
				spisakPredmeta.add(predmet);
			}
		} catch (IOException e) {
			System.out.println("Doslo je do greske prilikom ucitavanja.");
		}
	}


	@Override
	public String toString() {
		
		String podaci = "";
		podaci += "Naziv suda: " + this.nazivSuda + "\n";
		podaci += "Adresa suda: " + this.adresaSuda + "\n";
		podaci += "Spisak predmeta:\n";
		for(int i = 0; i < spisakPredmeta.size(); i++) {
			podaci += spisakPredmeta.get(i) + "\n";
		}

		return podaci.trim();
	}
}
	
	
		
	
	
	
	
	
	
	
	
	




