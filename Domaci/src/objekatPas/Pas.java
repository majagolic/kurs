package objekatPas;

public class Pas {

	private String ime;
	private int starost;
	private boolean vakcinisan;
	private String rasa;
	
	public Pas() {
		
		this.ime = "";
		this.rasa = "";		
	}
	
	
	public Pas(String ime, int starost) {
		
		this.ime = ime;
		this.starost = starost;
	}
	
	public Pas(String ime, String rasa) {
		
		super();
		
		this.ime = ime;
		this.rasa = rasa;
	} 
	
	
	public Pas(String ime, int starost, boolean vakcinisan, String rasa) {
		
		this.ime = ime;
		this.starost = starost;
		this.vakcinisan = vakcinisan;
		this.rasa = rasa;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public int getStarost() {
		return starost;
	}

	public void setStarost(int starost) {
		this.starost = starost;
	}

	public boolean isVakcinisan() {
		return vakcinisan;
	}

	public void setVakcinisan(boolean vakcinisan) {
		this.vakcinisan = vakcinisan;
	}

	public String getRasa() {
		return rasa;
	}

	public void setRasa(String rasa) {
		this.rasa = rasa;
	}
	
	public boolean vakcinisi() {
		
		boolean uspesno =  false;
		if(!this.vakcinisan) {
			this.vakcinisan = true;
			uspesno = true;
		}
		if(uspesno) {
			System.out.println("Vas pas " + this.ime + " je uspesno vakcinisan.");
		}
		else {
			System.out.println("Vas pas " + this.ime + " nije uspesno vakcinisan.");
		}
		return uspesno;
	}
	
	public void ispisiStarostULjudskimGodinama() {
		System.out.println("Vaš pas " + this.ime + " ima " + this.starost*7 + " ljudskih godina.");
	}

	@Override
	public String toString() {
		
		if(this.vakcinisan) {
			return "Pas " + this.ime + " je rase " + this.rasa + ", ima " + this.starost + " godina i vakcinisan je.";
		} else {
			return "Pas " + this.ime + " je rase " + this.rasa + ", ima " + this.starost + " godina i nije vakcinisan.";
		}
	
	
	
}
}
