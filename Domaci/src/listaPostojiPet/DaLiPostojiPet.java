package listaPostojiPet;

import java.util.ArrayList;

public class DaLiPostojiPet {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>lista = new ArrayList<Integer>();
		
		lista.add(4);
		lista.add(16);
		lista.add(7);
		lista.add(36);
		lista.add(5);
		lista.add(11);
		
		boolean postojiPet = lista.contains(5);
		
		if(postojiPet) {
			System.out.println("Postoji 5.");
		}

		else {
			System.out.println("Ne postoji 5.");
		}
	}

}
