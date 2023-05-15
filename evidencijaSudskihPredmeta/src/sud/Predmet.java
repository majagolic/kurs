package sud;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Predmet {
	
	private int broj;
	private String naziv = "";
	private String tekst = "";
	private LocalDate datum = LocalDate.now();
	
	
	public Predmet() {
		
	}


	public Predmet(int broj, String naziv, String tekst, LocalDate datum) {
		
		this.broj = broj;
		this.naziv = naziv;
		this.tekst = tekst;
		this.datum = datum;
	}


	public int getBroj() {
		return broj;
	}


	public void setBroj(int broj) {
		this.broj = broj;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public String getTekst() {
		return tekst;
	}


	public void setTekst(String tekst) {
		this.tekst = tekst;
	}


	public LocalDate getDatum() {
		return datum;
	}


	public void setDatum(LocalDate datum) {
		this.datum = datum;
	}


	@Override
	
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy.");
		return "Predmet [broj=" + broj + ", naziv=" + naziv + ", tekst=" + tekst + ", datum=" + dtf.format(datum) + "]";
	}
	
	
	
	
	
	
	

}
