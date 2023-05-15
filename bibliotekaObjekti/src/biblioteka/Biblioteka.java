package biblioteka;

import java.util.ArrayList;

public class Biblioteka {
	
	private String naziv = "";
	private String adresa = "";
	private ArrayList<Knjiga> spisakKnjiga = new ArrayList<Knjiga>();
	
	
	public Biblioteka() {
		
	}


	public Biblioteka(String naziv, String adresa) {
		super();
		this.naziv = naziv;
		this.adresa = adresa;
		this.spisakKnjiga =new ArrayList<Knjiga>();
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getAdresa() {
		return adresa;
	}


	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}


	public ArrayList<Knjiga> getSpisakKnjiga() {
		return spisakKnjiga;
	}


	public void setSpisakKnjiga(ArrayList<Knjiga> spisakKnjiga) {
		this.spisakKnjiga = spisakKnjiga;
	}
	
	//metoda za dodavanje knjige u evidenciju
	//Metoda dodajKnjigu dodaje prosleđeni objekat Knjiga u listu knjiga.
	
	public boolean dodajKnjigu(Knjiga novaKnjiga) {
		
		for (int i = 0; i < this.spisakKnjiga.size(); i++) {
			if(this.spisakKnjiga.get(i).getBroj() == novaKnjiga.getBroj()) {
				System.out.println("Knjiga vec postoji.");
				return false;
				}
			}
		this.spisakKnjiga.add(novaKnjiga);
		System.out.println("Uspeno dodata knjiga.");
		return true;
	}
	
	//metodu za brisanje knjige iz evidencije (na osnovu broja knjige)
	
	public boolean obrisiKnjigu(int broj) {
		
		for (int i = 0; i < this.spisakKnjiga.size(); i++) {
			if(this.spisakKnjiga.get(i).getBroj() == broj){
				 spisakKnjiga.remove(i);
				return true;
				}
			}
		System.out.println("Knjiga ne postoji.");
		return false;
	}
	
	//Metoda ukupnoKnjiga vraća ukupan broj knjiga u listi
	
	public int UkupnoKnjiga() {
		
		return this.spisakKnjiga.size();
	}
	
	//Metoda izdato vraća ukupan broj knjiga koje su izdate.
	
	public int izdata() {
		
		int brojIzdatih = 0;
		
		for (int i = 0; i <spisakKnjiga.size(); i++) {
			if(spisakKnjiga.get(i).isIzdata()) {
				brojIzdatih++;
			}
		}
		return brojIzdatih;
	}
	
	public int nijeIzdato() {
		
		return this.spisakKnjiga.size() - izdata();
	}
	
	public void vratiKnjigePoAutoru(String imeAutora) {
		
		for (int i = 0; i < spisakKnjiga.size(); i++) {
			if(spisakKnjiga.get(i).getIme().equals(imeAutora)) {
				System.out.println(this.spisakKnjiga.get(i));
			}
		}
	}


	@Override
	public String toString() {
		
		String temp = "";
		temp += "Naziv biblioteke" + this.naziv + "\n";
		temp += "Adresa biblioteke" + this.adresa + "\n";
		for (int i = 0; i < spisakKnjiga.size(); i++) 
			temp += (spisakKnjiga.get(i));
			return temp.trim();
		}
		
		
	
	
	
	
	

}
