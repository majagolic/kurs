package funkicujeBoolean;

public class ParanNeparan {
	
	public static boolean odd(int x) {
		
		if(x % 2 == 0) {
			
			return false;
		}
		else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		
		boolean m = odd(15);
		boolean n = odd(4);
		
		System.out.println(m);
		System.out.println(n);

	}

}
