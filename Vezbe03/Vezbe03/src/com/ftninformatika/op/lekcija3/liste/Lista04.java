package com.ftninformatika.op.lekcija3.liste;

import java.util.ArrayList;

public class Lista04 {
	
	public static void main(String[] args) {
		ArrayList<String> imena = new ArrayList<String>();
		ArrayList<String> prezimena = new ArrayList<String>();
		ArrayList<Integer> bodovi = new ArrayList<Integer>();
		
		imena.add("Marko");
		imena.add("Marko");
		imena.add("Petar");
		imena.add("Ivan");
		
		prezimena.add("Petrovic");
		prezimena.add("Markovic");
		prezimena.add("Petrovic");
		prezimena.add("Markovic");
		
		bodovi.add(98);
		bodovi.add(62);
		bodovi.add(100);
		bodovi.add(47);
		
		String ime = "Marko";
		String prezime = "Markovic";
		
		int index = -1;
		for(int i = 0; i < imena.size(); i++)
			if(imena.get(i).equals(ime) && prezimena.get(i).equals(prezime)) {
				index = i;
				break;
			}
				
		if(index > -1) {
			System.out.println(index + " " + imena.get(index) + " " + prezimena.get(index) + " " + bodovi.get(index));
		}
		
	}

}
