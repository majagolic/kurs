package prestupnaGodina;

public class Prestupna {

	public static void main(String[] args) {
		
		int godina = 2020;
		
		if (godina % 400 == 0) {
			
			System.out.println("Prestupna je.");
		}
		else if (godina % 100 == 0) {
			System.out.println("Nije prestupna.");
		}
		else if (godina % 4 == 0) {
			System.out.println("Prestupna je.");
		}
		else 
		System.out.println("Nije prestupna.");
	}

}
