package nizTrecizadatak;

public class nizTrecizadatak {

	public static void main(String[] args) {
		
		
int niz[] =  {3, 15, 7, 9, 11, 12,  }; 
		
boolean postoji5 = false;
		
		
		for(int i = 0; i < niz.length; i++) {
			
			if(niz[i] == 5) {
				
				postoji5 = true;
				System.out.println("Postoji broj 5.");
				break;
			}
		
		}
		if (postoji5 == false) {
			
			System.out.println("Ne postoji 5.");
		}
}
}