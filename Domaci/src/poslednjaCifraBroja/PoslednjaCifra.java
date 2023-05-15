package poslednjaCifraBroja;

public class PoslednjaCifra {
	
	public static int digit(int n) {
		
		int x = n % 10;
		
		return x;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(digit(205));
		System.out.println(digit(111258));

	}

}
