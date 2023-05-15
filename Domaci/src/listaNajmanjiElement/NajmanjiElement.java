package listaNajmanjiElement;

import java.util.ArrayList;

public class NajmanjiElement {

	public static void main(String[] args) {
		
		ArrayList<Double> lista = new ArrayList<Double>();
		
		lista.add(10.0);
		lista.add(17.23);
		lista.add(250.21);
		lista.add(-15.24);
		lista.add(-5.55);
		
		double najmanji = lista.get(0);
		
		for(int i = 1; i < lista.size(); i++) {
			
			if(najmanji > lista.get(i)) {
				
				najmanji = lista.get(i);
			}
		}
		System.out.println("Najmanji broj u listi je " + najmanji);
	}

}
