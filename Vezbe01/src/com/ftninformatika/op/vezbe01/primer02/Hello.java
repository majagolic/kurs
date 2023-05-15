package com.ftninformatika.op.vezbe01.primer02;

//Ime klase je isto kao u prethodnom primeru, 
//ali to je samo SimpleName, puno ime je ime paketa + ime klase
//Trudimo se da je puno ime klase jedinstveno ne samo na nivou 
//naseg projekta, nego na globalnom nivou - pogledajte naziv paketa
public class Hello {


	public static void main(String[] args) {
		//Deklaracija lokalne varijable name koja je tipa String
		String name = "Dragan";
		System.out.println(name);
		
		//Moze i ovako
		//Pravimo varijablu car koja nema inicijalnu vrednost
		String car;
		//pa joj potom dodelim vrednost u novom redu
		car = "BMW";
		System.out.println(car);
		
		//Pravimo varijablu i dodelimo joj inicijalnu vrednost
		String street = "Fruskogorska";
		//pa joj promenimo vrednost
		street = "Laze Nancica";
		//Sta ce biti prikazano na ekranu?
		System.out.println(street);
		
		
		//Konkatenacija stringova se vrsi pomocu operatora +
		System.out.println("HelloWorld " + name + "!");
		//Primer konkatenacije stringova koja se smesta u lokalnu promenljivu
		//pa tek onda ispisuje
		String message = "HelloWorld " + name + "!";
		System.out.println(message);
		
		//Ako hocemo da ispisemo " (dupli navodnik), ne mozemo ga samo navesti, jer je 
		//dupli navodnik u javi znak za pocetak/kraj string, tzv. specijalni karakter (znak)
		//Ako hocemo da ispisemo " ili neki drugi specijalni karakter tada ispred navodnika pisemo kosu crtu i to \
		//NRP: \"
		//Specijalni karakteri se moraju eskejpovati pomocu \
		System.out.println("HelloWorld \"" + name + "\"!");
		
		int brojRacunara = 7;
		double cena = 39000.52;
		boolean imaCD = true;
		//vrsta operativnog sistema
		char os = 'W';
		//tip instaliranog operativnog sistema
		
		//malo promenimo cenu
		cena = 80000.00;
		
		//ispis svih podataka
		System.out.println("Broj racunara \n je: " + brojRacunara);
		System.out.print("\tCena:\" " + cena);
		System.out.println("\tSa CD uredjajem?: " + imaCD);
		System.out.println("\tOznaka operativnog sistema: " + os);
	}

}
