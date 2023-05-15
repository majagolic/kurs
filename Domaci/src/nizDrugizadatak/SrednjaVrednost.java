package nizDrugizadatak;

public class SrednjaVrednost {

	public static void main(String[] args) {
		
		
		int niz [] = {2, 5, 7, 8, 9};
		
		int suma = 0;
		
		double srednjaVrednost;
		
		for(int i = 0; i < niz.length; i++)
			
			suma = suma + niz[i];
		
		    srednjaVrednost = (double)suma / niz.length;
		    
		    System.out.println("Srednja vrednost niza je: " + srednjaVrednost);
		}

}
