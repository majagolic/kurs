package com.ftninformatika.op.lekcija3.niz;

public class Arrays01 {

	public static void main(String[] args) {
		//naredni kod definise niz koji sadrzi prvih 5 prirodnih brojeva
		int a [];			//deklaracija niza ciji su elementi celi brojevi
		a = new int [5]; 	//alokacija 5 memoriskih polja velicine celobrojnog tipa
		a[0]  = 1;			//promena vrednosti 1. elementa niza
		a[1]  = 2;			//promena vrednosti 2. elementa niza
		a[2]  = 3;			//promena vrednosti 3. elementa niza
		a[3]  = 4;			//promena vrednosti 4. elementa niza
		a[4]  = 5;			//promena vrednosti 5. elementa niza
		
		//skraceni oblik ovog istog
		int b [] = { 1 , 2 , 3 , 4 ,  5};	//deklaracija, alokacija i inicijalizacija
		
		// elementi niza mogu da budu vrednost konstante, promenljive, rezultati poziva funkcije
		// niz celih, sta ce da se desi sa 11/3 (napomena celobrojno delenje)
		int broj = 2;
		int[] celi = { 7, 5, broj, 9, 22 + 11 / 3, -13, 1 };
		
		// niz realnih
		double[] realni = { 3.14/2, 3.0, 2 + 3 / 5, 2.712345, 1.4367854};
		
		// niz stringova
		String[] imena = { "Pera", "Mika", "Laza" };
		
		//pristup elementu niza A
		System.out.println("Peti element niza A je " + a[4] +"\n");
		
		//ispis elemenata niza A
		System.out.println("Ispis elemenata niza");
		for (int i = 0; i < a.length ; i++ ) {
			System.out.println(i + " clan niza A je " + a[i]);
		}
		
		//ispis u obrnutom redosledu
		for(int i = a.length - 1; i >=0; i--)
			System.out.println(a[i]);
		
	}
}
