package proizvod;

public class Cena {

	public static void main(String[] args) {
		
		double cenaProizvoda = 250;
		int kolicina = 5;
		boolean akcija = true;
		double ukupnaCena;
		
		ukupnaCena = cenaProizvoda * kolicina;
		
		if(akcija) {
			ukupnaCena = 0.9 * ukupnaCena;
		}
		
		System.out.println("Cena je " + ukupnaCena);
		
		if(akcija) {
			System.out.println("U cenu je uracunat akcijski popust 10%");
		}
	}

}

/*
double cenaProizvoda = 250;
int kolicina = 5;
boolean akcija = true;
double ukupnaCena;


ukupnaCena = cenaProizvoda * kolicina;

if(akcija) {
	ukupnaCena = 0.9 * ukupnaCena;
	System.out.println("Cena je " + ukupnaCena);
	System.out.println("U cenu je uracunat akcijski popust 10%");
}
else{
    ukupnaCena = cenaProizvoda * kolicina;
    System.out.println("Cena je " + ukupnaCena);
}
*/

//ili obrnuto if(!akcija)