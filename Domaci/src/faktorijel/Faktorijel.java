package faktorijel;

public class Faktorijel {

	public static void main(String[] args) {
		
	/*	int x = 5;
		
		int res = 1;
		
		for(int i = 1; i <= x; i++) {
			
			res = res * i;
		}
			
			System.out.println("Faktorijel broja " + x + " je " + res);
	}

}
*/
		
	
		int i = 5;
		int res = 1;
		
		while(i>0) {
			
			res = res * i;
			i = i - 1;
			
		}
		System.out.println("Faktorijel je broj: " + res);
			
		}
}
