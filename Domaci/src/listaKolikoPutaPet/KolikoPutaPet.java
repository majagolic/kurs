package listaKolikoPutaPet;

import java.util.ArrayList;

public class KolikoPutaPet {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
			lista.add(8);
			lista.add(5);
			lista.add(11);
			lista.add(5);
			lista.add(5);
			lista.add(6);
			lista.add(51);
			
			int brojPetica = 0;
			
			for(int i = 0; i < lista.size(); i++) {
				
				if(lista.get(i) == 5) //ako je element na poziciji index jednako 5
					
					brojPetica++;
			}
			System.out.println("U listi ima " + brojPetica + " elemanata sa vrednoscu 5.");
	}

}
