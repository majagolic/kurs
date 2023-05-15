package listaSrednjaVrednost;

import java.util.ArrayList;

public class SrednjaVrednost {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		lista.add(5);
		lista.add(7);
		lista.add(8);
		lista.add(14);
		lista.add(10);
		lista.add(2);
		
		int suma = 0;
		
		double srednjaVrednost;
		
		for(int i = 0; i < lista.size(); i++) {
			
			suma = suma + lista.get(i);
		}

		
		srednjaVrednost = (double)suma / lista.size();
		
		System.out.println("Srednja vrednost je " + srednjaVrednost);
	}

}
