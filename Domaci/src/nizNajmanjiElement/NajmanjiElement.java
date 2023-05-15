package nizNajmanjiElement;

public class NajmanjiElement {

	public static void main(String[] args) {
		
		double niz[] = {-560, 15, 122, 5, 0, -12.5, -651.2};
		
		double najmanji = niz[0];
		
		for(int i = 0; i < niz.length; i++) {
			
			if(niz[i] < najmanji) {
				
				najmanji = niz[i];
			}
		}
            System.out.println("Najmanji broj niza je " + najmanji);
	}

}
//kako je u 13.redu znak vece?