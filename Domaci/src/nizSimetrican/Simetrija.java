package nizSimetrican;

public class Simetrija {

	public static void main(String[] args) {
		
		int niz[] = {12, 7, 5, 7, 12, 4};
		
		boolean simetrican = true;
		
		for(int i = 0; i < niz.length; i++) {
			
			if(niz[i] != niz[niz.length -i -1]) {
				
				simetrican = false;
				
				break;
			}
		}

		if(simetrican)
			System.out.println("Simetrican je.");
		else
			System.out.println("Nije simetrican.");
	}

}
