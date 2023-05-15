package funkcijeBonus;

public class Bonus {
	
	//1. Utvrdite da li se karakter ‘l’ nalazi u stringu “marmelada”
	
	public static void marmeladaSadrziL() {
		
	String r = "marmelada";
		
		System.out.println(r.contains("l"));
	
	
		}
	
	//2. Nađite na kom indeksu se karakter ‘a’ nalazi u stringu “marmelada”.

		public static void marmelada() {
		
			String a = "marmelada";
		
			int indexPoslednjegA = -1;
		
			for(int i = 0; i < a.length(); i++) {
			
				if('a' == a.charAt(i)) {
				
					indexPoslednjegA = i;	//svaki put ce se upisati novo a
				
					System.out.println(i);
				}
			}
			
// 3.Pronađite indeks poslednjeg pojavljivanja karaktera ‘a’ u stringu “marmelada”.

		System.out.println("Index poslednjeg A je na poziciji " + indexPoslednjegA);
		
	}
		
	//4.Pronađite karakter koji se nalazi na indeksu 4 stringa “Popokatepetl”.
		
		
		public static void karakterNaIndexu() {
			
			
			String m = "Popokatepetl";
			
			System.out.println("Cetvrti indeks je: " + m.charAt(3));
		}
		
		
		
		//5.Ispišite svaki drugi karakter zadatog stringa.

	
	public static void svakiDrugiKarakter(String a) {
		
		
		for(int i = 0; i < a.length(); i++) {
			
			if( i % 2 == 1) {
				
				System.out.println(a.charAt(i));
			}
		}
		
	}

	public static void main(String[] args) {
		
		marmeladaSadrziL();
		marmelada();
		karakterNaIndexu();
		svakiDrugiKarakter("popokatepetl");
	}

}
