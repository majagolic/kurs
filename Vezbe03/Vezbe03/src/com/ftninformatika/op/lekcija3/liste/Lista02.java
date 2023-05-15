package com.ftninformatika.op.lekcija3.liste;

import java.util.ArrayList;

public class Lista02 {
	public static void main(String[] args) {
		
		//kreiranje lise
		
		//Sta je sta:
		
		//ArrayList - klasa koja predstavlja listu (detaljnu pricu o klasama cucete na narednim kursevima)
		//ArrayList se nalazi u paketu java.util, pa zato to imamo u imort sekciji
		//<String> - kog tipa su podaci u listi, naime u listi mogu da se stavljaju bilo koji tipovi (String, boolean, int, double, ...) 
		//pa je potrebno navesti kog tipa ce biti podaci u listi
		//NE PRAKTIKUJE SE stavljanje u listu podataka razlicitpg tipa, npr Sting, pa double, pa String, pa int
		//lista - naziv varijable
		//new ArrayList<String>() - zauzima se memorija za elemente liste, tj. instancira se novi objekat (detaljnu pricu o ovome cucete na narednim kursevima)
		
		ArrayList<String> lista = new ArrayList<String>();
		
		//dodavanje elemenata u listu
		//elementi se dodaju po redu pocev od 0. pozicije
		//element na poziciji 0
		lista.add("Sully Prudhomme");
		//element na poziciji 1
		lista.add("Theodor Mommsen");
		//element na poziciji 2
		lista.add("Bjornstjerne Bjornson");
		//element na poziciji 3
		lista.add("Frederic Mistral");
		//element na poziciji 4
		lista.add("Frederic Mistral");
		//element na poziciji 5
		lista.add("Henryk Sienkiewicz");
		//element na poziciji 6
		lista.add("Giosue Carducci");
		//element na poziciji 7
		lista.add("Rudyard Kipling");
		//element na poziciji 8
		lista.add("Rudolf Christoph Eucken");
		//element na poziciji 9
		lista.add("Selma Lagerlof");
		//element na poziciji 10
		lista.add("Paul Heyse");
		//element na poziciji 11
		//moze i ovako, potpuno je svejedno
		String element = "Maurice Maeterlinck";
		lista.add(element);
		
		//Kako mzoemo proveriti da li lista sadrzi neki element
		System.out.println("----------------Provera da li lista sadrzi neki element---------------------------");
		boolean sadrzi = lista.contains("Rudyard Kipling");
		System.out.println("Lista sadrzi Rudyard Kipling: " + sadrzi);
		
		//STA AKO NA NEKI NACIN ZELIMO PRONACI INDEKS ELEMENTA U LISTI KOGA ZELIMO PROMENITI / OBRISATI
		//NPR. ZELIMO PROMENITI KORISNIKA KOJI SE ZOVE Maurice Maeterlinck (NE ZNAMO UNAPRED NJEGOVU POZICIJU U LISTI) 
		System.out.println("-----------------Promena korisnika koji se zove Maurice Maeterlinck-----------------");
		//poziciju nego elementa mozemo saznati ovako
		element = "Maurice Maeterlinck";
		int index = lista.indexOf(element);
		//ako je index > -1 znaci da taj element postoji u listi
		if(index > -1)
			lista.set(index, "Mika Antic");
		
		//Idemo u prikaz svih
		for(String el : lista) {
			System.out.println(el);
		}
		
		//Potencijalni problem sa prethodnim slucajem pronalaska elementa
		//Npr. Ne znam da li su pesnici uneseni sa velimim ili malim slovima
		//Ako hocemo da resimo ovaj problem treba nam malo slozenija potraga za indeksom koja se implementira preko for petlje
		System.out.println("-----------------Promena korisnika koji se zove Selma Lagerlof bez obzia na velika ili mala slova u imenu-----------------");
		
		element = "SELMA lagerlof";
		//stavicemo da je index -1, i time pretpostavima da tog korisnika nema
		index = -1;
		//sada idemo kroz for petlju i trazimo ga
		for(int i = 0; i < lista.size(); i++) {
			//konkretno za poredjenje stringova uz ignorisanje velikih i malih slova koristi se equalsIgnoreCase
			//ako su isti, stavimo index na i, i mozemo break jer smo pronasli trazeni index
			if(element.equalsIgnoreCase(lista.get(i))) {
				index = i;
				break;
			}
				
		}
		//ako je index > -1 znaci da taj element postoji u listi
		if(index > -1)
			lista.set(index, "Desanka Maksimovic");
		//Idemo u prikaz svih
		for(String el : lista) {
			System.out.println(el);
		}
		
	}
}
