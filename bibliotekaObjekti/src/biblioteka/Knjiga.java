package biblioteka;

public class Knjiga {
	
	private int broj;
	private String naziv = "";
	private String ime= "";
	private boolean izdata;
	
	public Knjiga() {
		
	}

	public Knjiga(int broj, String naziv, String ime, boolean izdata) {
	
		this.broj = broj;
		this.naziv = naziv;
		this.ime = ime;
		this.izdata = izdata;
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

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public boolean isIzdata() {
		return izdata;
	}

	public void setIzdata(boolean izdata) {
		this.izdata = izdata;
	}

	@Override
	public String toString() {
		return "Knjiga [broj=" + broj + ", naziv=" + naziv + ", ime=" + ime + ", izdata=" + izdata + "]";
	}
	
	
	
	
	
	
}
