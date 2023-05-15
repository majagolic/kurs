package listaNajveciElement;

import java.util.ArrayList;

public class NajveciElementUListi {

	public static void main(String[] args) {
		
		ArrayList<Double> lista = new ArrayList<Double>();
		
		lista.add(4.5);
		lista.add(81.5);
		lista.add(22.0);
		lista.add(15.31);
		lista.add(4.2);
		lista.add(-15.21);
		lista.add(7.58);
		
		double najveci = lista.get(0);
		
		for(int i = 1; i < lista.size(); i++) {      //ide od 1 jer je nulti stavljen za najveci
			
			if(lista.get(i) > najveci) {
				najveci = lista.get(i);
			}
			
		}
		System.out.println("Najveci element je " + najveci);
	}

}
