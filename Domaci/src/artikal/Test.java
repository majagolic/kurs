package artikal;

public class Test {

	public static void main(String[] args) {
	
		Artikal artikal1 = new Artikal();
		artikal1.naziv = "Jastuk";
		artikal1.osnovnaCena = 1800;
		artikal1.porez = 0.2;
		System.out.println("Konačna cena za artikal: " + artikal1.naziv +
				" je " + artikal1.izracunajKonacnuCenu());
		System.out.println("Cena sa popustom za artikal: " + artikal1.naziv +
				" je " + artikal1.izracunajCenuSaPopustom(0.2));

	
		
		

	
	}

}
