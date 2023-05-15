package nizPalindrom;

public class Palindrom {

	public static void main(String[] args) {
		
		char[] rec = {'a', 'n', 'a'};
		
		boolean palindrom = true;
		
		for(int i = 0; i < rec.length; i++) {
			
			if(rec[i] != rec[rec.length - 1 -i]) {
				
				palindrom = false;
				
				break;
			}
		}
		if(palindrom) {
			
			System.out.println("Jeste palindrom.");
		}
		
		else {
			System.out.println("Nije palindrom.");
	}

}
}

		
		

