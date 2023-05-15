package listaEvidencijaPolaznika;

import java.util.ArrayList;


public class EvidencijaPolaznika {

	public static void main(String[] args) {
		
		ArrayList<String> ime = new ArrayList<String>();
		ArrayList<String> prezime = new ArrayList<String>();
		ArrayList<Integer> prisustvo = new ArrayList<Integer>();
		
		ime.add("Strahinja");
		prezime.add("Golic");
		prisustvo.add(0);
		
		ime.add("Filip");
		prezime.add("Brkic");
		prisustvo.add(0);
		
		ime.add("Milan");
		prezime.add("Nedic");
		prisustvo.add(0);
		
		ime.add("Stefan");
		prezime.add("Jokic");
		prisustvo.add(0);
		
		ime.add("Maja");
		prezime.add("Vuletic");
		prisustvo.add(0);
		
		ime.add("Aleksandra");
		prezime.add("Ostojic");
		prisustvo.add(0);
	
		System.out.println("-----------PRIKAZ SVIH POLAZNIKA--------------");
		
		
		for(int i = 0; i < ime.size(); i++) {
			
			System.out.println(ime.get(i) +" " + prezime.get(i) +" " + prisustvo.get(i));
		}

		//BRISANJE NA OSNOVU INDEXA
		
		int indexZaBrisanje = 2;
		
		ime.remove(indexZaBrisanje);
		prezime.remove(indexZaBrisanje);
		prisustvo.remove(indexZaBrisanje);
		
		System.out.println("---------PRIKAZ POLAZNIKA NAKON BRISANJA--------");
		
			for(int i = 0; i < ime.size(); i++) {
			
			System.out.println(ime.get(i) +" " + prezime.get(i) +" " + prisustvo.get(i));
		
		}
			
			//BRISANJE NA OSNOVU IMENA I PREZIMENA
			
		int indexBrisi = -1;
		
		String imeBrisi = "Stefan";
		String prezimeBrisi = "Jokic";
		
		for(int i = 0; i < ime.size(); i++) {
			
			if(ime.get(i).equals(imeBrisi)&&prezime.get(i).equals(prezimeBrisi)) {
				
				indexBrisi = i;
				break;
			}
		}
		
		if(indexBrisi > -1) {   //znaci da smo pronasli element koji brisemo
			
			ime.remove(indexBrisi); //ne pisem u zagradu i jer nije vidljivo van for-a
			prezime.remove(indexBrisi);
			prisustvo.remove(indexBrisi);
			
}
		System.out.println("---------PRIKAZ POLAZNIKA NAKON BRISANJA PO IMENU I PREZIMENU-----------");
		
			for(int i = 0; i < ime.size(); i++) {
			
			System.out.println(ime.get(i) +" " + prezime.get(i) +" " + prisustvo.get(i));
		
	}
	
			
			int indexUvecaj = -1;
			
			String imeUvecaj = "Maja";
			String prezimeUvecaj = "Vuletic";
			
			for(int i = 0; i < ime.size(); i++) {
				
				if(ime.get(i).equals(imeUvecaj)&&prezime.get(i).equals(prezimeUvecaj)) {
					indexUvecaj = i;
					break;
				}
			}
			if(indexUvecaj>-1) {
				int brojPrisustva = prisustvo.get(indexUvecaj);
				
				brojPrisustva++;
				
				prisustvo.set(indexUvecaj, brojPrisustva);
				
				
			}
			System.out.println("--------PRIKAZ POLAZNIKA NAKON UVECANJA PRISUSTVA----------");
			
			for(int i = 0; i < ime.size(); i++) {
				
				System.out.println(ime.get(i) +" " + prezime.get(i) +" " + prisustvo.get(i));
			
}
}
}
