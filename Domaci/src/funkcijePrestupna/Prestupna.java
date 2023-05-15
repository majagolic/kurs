package funkcijePrestupna;

public class Prestupna {
	
	public static boolean prestupna(int year) {
		
		if (year % 400 == 0) {
			return true;
		}
		else if (year % 100 == 0) {
			return false;
		}
		else if (year % 4 == 0) {
			return true;
		}
		else 
		return false;
	    }

	public static void main(String[] args) {
		
		System.out.println(prestupna(1988));
		System.out.println(prestupna(1990));
		System.out.println(prestupna(2023));
		
	}

}
