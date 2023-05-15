package listePresek;

import java.util.ArrayList;

public class PresekDveListe {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista1 = new ArrayList<Integer>();
		ArrayList<Integer> lista2 = new ArrayList<Integer>();
		
		lista1.add(12);
		lista1.add(18);
		lista1.add(122);
		lista1.add(5);
		
		lista2.add(122);
		lista2.add(150);
		lista2.add(1);
		lista2.add(57);
		lista2.add(8);
		lista2.add(12);
		
		ArrayList<Integer> presek = new ArrayList<Integer>();
		
		for(int i = 0; i < lista1.size(); i++) {
			
			for(int j = 0; j<lista2.size(); j++) {
				
				if(lista1.get(i)==lista2.get(j)) {
					
					if(!presek.contains(lista1.get(i))) {
						
						presek.add(lista1.get(i));
						
						break;
					}
					
				}
			}
		}
		
		if(presek.size() == 0) {
			
			System.out.println("Presek liste1 i liste2 je prazan.");
		}
		else {
			System.out.println("Presek liste1 i liste2 je: ");
			
			for(int i = 0; i<presek.size(); i++) {
				System.out.println(presek.get(i));
			}
		}
		
		
	}

}
