package meseciSwitch;

public class MeseciSwitch {

	public static void main(String[] args) {
		
		int mesec = 8;
		
		switch (mesec) {
		
		case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
			System.out.println("Mesec ima 31 dan.");
			break;
		
		case 2: 
			System.out.println("Mesec ima 28 ili 29 dana.");
			break;
		
		case 4: case 6: case 9: case 11: 
			System.out.println("Mesec ima 30 dana.");
			break;
		
		default: 
			System.out.println("Nepostojeci mesec.");
			break;
		}

	}

}
