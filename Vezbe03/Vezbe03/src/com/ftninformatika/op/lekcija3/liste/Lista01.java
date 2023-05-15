package com.ftninformatika.op.lekcija3.liste;

import java.util.ArrayList;

public class Lista01 {
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
		
		System.out.println("-----------------Pronalazenje elementa na odredjenoj poziciji u listi-----------------");
		//Kako da procitamo 5. element u listi
		//imamo lista.get(4) jer indeks prvog elementa je 0, lista krece od 0
		String element5 = lista.get(4);
		System.out.println("5 element u listi je " + element5);
				
		
		//prolazak kroz listu,
		
		//VARIJANTA 1:
		System.out.println("-----------------Prolazak kroz listu varijanta 1-----------------");
		//VAZNO:
		//PRVI ELEMENT LISTE IMA INDEX 0, A NE 1
		for (int i = 0; i < lista.size(); i++) {
			String el = lista.get(i);
			System.out.println(el);
		}

		//VARIJANTA 2
		System.out.println();
		System.out.println("-----------------Prolazak kroz listu varijanta 2-----------------");
		//U varijabli el se cuva tekuci element liste
		for(String el : lista) {
			System.out.println(el);
		}
		System.out.println();
		
		//U CEMU JE RAZLIKA VARIJANTA 1 i 2
		//Ne postoji bitna razlika, 
		//Varijanta 2 je samo kraci zapis, menje potrebno kucati koda :-)
		//varijanta 1. je opstija jer imamo i index (poziciju) elementa u listi
		//KOJU VARIJANTU KORISTITIT I KAD:
		//Ako nam je bitna pozicija elmenta u listi onda mora varijanta 1
		//Ako nam nije bitna pozicija elementa u listi onda moze bilo koja varijanta
		
		System.out.println("-----------------Izbacivanje elmenta iz liste---------------");
		//uklanjanje elementa sa zadate pozicije
		lista.remove(6);// "Giosue Carducci"
		//Idemo u prikaz svih
		for(String el : lista) {
			System.out.println(el);
		}
		
		System.out.println();
		System.out.println("-----------------Promena 3. elmenta u liste---------------");
		//2 je pozicija u listi
		//"Petar Petrovic" je nova vrednost na poziciji 2
		lista.set(2, "Petar Petrovic");
		
		//Idemo u prikaz svih
		for(String el : lista) {
			System.out.println(el);
		}
	}
}
