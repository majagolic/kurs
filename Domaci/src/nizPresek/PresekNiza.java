package nizPresek;

public class PresekNiza {

	public static void main(String[] args) {
		
		int[] nizA = {1, 5, 8, 17, 2};
		int[] nizB = {8, 6, 2, 1, 15};
		
		int brojElemenata; //duzina preseka, tj.kraceg niza
		
		if(nizA.length > nizB.length) {
			
			brojElemenata = nizB.length;
		}
		else {
			brojElemenata = nizA.length;
		}
		
		int k = 0; //k je iterator  niza presek
		
		int[] presek = new int[brojElemenata];
		
		for(int i=0; i<nizA.length; i++) {
			
			for(int j=0; j<nizB.length; j++) {
				
				if(nizA[i] == nizB[j]) {
					
					presek[k] = nizA[i];
					
					k = k + 1;
					
					break;
					
				}
			}
		}
		
		System.out.println("Presek dva niza je: ");
		
		for(int p = 0; p < k; p++) {
			
			System.out.print(presek[p] + " ");
		}
	}

}
