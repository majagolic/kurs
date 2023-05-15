package com.ftninformatika.op.vezbe02.primer01;

public class PrimitiveTypes01 {

	public static void main(String[] args) {
		//deklaracija i inicijalizacija vrednosti
		int a = 1;
		double b = 3.14;
		
		//implicitna konverzija, sa manjeg na veci tip MOZE
		System.out.println("1. Stara vrednost b=" + b);
		b = a;
		System.out.println("1. Nova vrednost b=" + b +"\n");
		System.out.println("-------------------------------------------------------------");
		
		//implicitna konverzija, sa veceg na manji tip NE MOZE
		//naredna linija vraca gresku, odkomentarisite kod
		//a = b;
		
		//eksplicitna konverzija moze, dolazi do gubitka podataka
		System.out.println("2. Stara vrednost a=" + a);
		b = 3.14;
		a = (int)b;
		System.out.println("2. Nova vrednost a=" + a +"\n");
		System.out.println("-------------------------------------------------------------");
		
		//ARITMETICKI OPERATORI
		//operator + za sabiranje, isprobajte operatore - , * , /
		a = 1+1 - 5 * 9;
		b = a + 3.14; 
		System.out.println("3. Nova vrednost b=" + b +"\n");
		System.out.println("-------------------------------------------------------------");
		
		//prioritet operacija
		//da li je rezultat 4 ?, za definisanje prioriteta koristite zadrade
		a = 1 + 1 * 2; 
		System.out.println("4. Nova vrednost a=" + a +"\n");
		System.out.println("-------------------------------------------------------------");
		
		// koriscenje kombinovanog operatora a+=3 isto kao i a=a+3
		// isprobajte za -= , *=
		System.out.println("5. Stara vrednost a=" + a);
		
		//a = a + 3;
		
		a += 3;
		System.out.println("5. Nova vrednost a=" + a +"\n");
		System.out.println("-------------------------------------------------------------");
		
		a = 4;
		System.out.println("6. a je " + ++a);
		System.out.println("7. a je " + a +"\n");
		
		a = 4;
		System.out.println("8. a je " + a++);
		
		System.out.println("9. a je " + a +"\n");
		System.out.println("-------------------------------------------------------------");
		
		//operator %, ostatak pri deljenju
		b = a % 2;
		System.out.println("Ostatak pri deljenju "+ a + " i 2 je "+b);
		
		int prvi = 9;
		double drugi = (double)prvi/2;
		System.out.println("Drugi sa castovanjem = " + drugi);
		drugi = prvi/2;
		System.out.println("Drugi bez castovanja = " + drugi);
		System.out.println("-------------------------------------------------------------");
		
		
		boolean x = true;
		System.out.println("Poredjenje: " + (x || (a == 5)));
		
		boolean logicka = true;
		boolean drugaLogicka = !logicka; //false
		
		boolean trecaLogicka = logicka && (drugaLogicka || logicka);
		//						true && (false || true)
		
		System.out.println("Treca logicka = " + trecaLogicka);
		
	}

}
