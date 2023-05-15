package artikal;

public class Artikal {
	
	String naziv;
	double osnovnaCena;
	double porez;


	
	Artikal(){
	
    } 

	Artikal(String naziv, double cena){
		
		this.naziv = naziv;
		this.osnovnaCena = cena;
		this.porez = 0.18;
	}

	Artikal(String naziv, double cena, double porez) {
		this.naziv = naziv;
		this.osnovnaCena = cena;
		this.porez = porez;
	}
	
	double izracunajKonacnuCenu() {
		
		double konacnaCena = osnovnaCena + osnovnaCena * porez;
		return konacnaCena;
	}
 	
	double izracunajCenuSaPopustom(double popust) {
		
		double cenaSaPorezom = izracunajKonacnuCenu();
		double cenaSaPopustom = cenaSaPorezom * (1 - popust);
		return cenaSaPopustom;
	}

}