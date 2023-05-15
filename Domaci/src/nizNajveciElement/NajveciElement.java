package nizNajveciElement;

public class NajveciElement {

	public static void main(String[] args) {
		
		double niz[] = {10, -15, 11.45, 128.24, 3.2};
		
		double najveci = niz[0];
		
		for(int i = 1; i < niz.length; i++) {
			
			if(najveci < niz[i]) {
				
				najveci = niz[i];
			}
		}
			
	System.out.println("Najveci broj u nizu je " + najveci );
	}

}
