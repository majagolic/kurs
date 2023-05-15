package registracijaKorisnika2;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class RegistracijaKorisnika2 {
	
	//Kolekcije u kojima se cuvaju podaci o korisnicima
	
	public static ArrayList<String> firstNames = new ArrayList<String>();
	public static ArrayList<String> lastNames =  new ArrayList<String>();
	public static ArrayList<String> usernames =  new ArrayList<String>();
	public static ArrayList<String> passwords =  new ArrayList<String>();
	public static ArrayList<String> emails =  new ArrayList<String>();
	public static ArrayList<String> ids =  new ArrayList<String>();

	public static Scanner scanner = new Scanner(System.in);
	
	//Validira ime
	
	public static boolean isFirstNameValid(String firstName) {
		if(firstName.equals("")) {
			return false;
		}
		return Character.isUpperCase(firstName.charAt(0));
	}
		
		
	//Validira prezime
	
	public static boolean isLastNameValid(String lastName) {
		if(lastName.equals("")) {
			return false;
		}
		return Character.isUpperCase(lastName.charAt(0));
	}
		
	//Validira username
	
	public static boolean isUsernameValid(String username) {
		if(username.equals("")) {
			return false;
			}
		
		boolean containsLettersOnly = true;
		for(int i = 0; i < username.length(); i++) {
			if(!Character.isLetter(username.charAt(i))) {
				containsLettersOnly = false;
				break;
			}
		}
			return containsLettersOnly;
		}
		
		
		//validira password
		
		public static boolean isPasswordValid(String password) {
			
			if (password.equals("")) {
				return false;
		}
			
			boolean isLengthValid = password.length()>=6 && password.length()<=12;
			
			boolean containsDigit = false;
			for (int i = 0; i < password.length(); i++) {
				if(Character.isDigit(password.charAt(i))) {
					containsDigit = true;
					break;
				}
			}
			
			boolean containsUpperCaseLetter = false;
			for (int i = 0; i < password.length(); i++) {
				if (Character.isUpperCase(password.charAt(i))) {
					containsUpperCaseLetter = true;
					break;
				}
			}
			
			boolean containsLowerCaseLetter = false;
			for (int i = 0; i < password.length(); i++) {
				if (Character.isLowerCase(password.charAt(i))) {
					containsLowerCaseLetter = true;
					break;
				}
			}
			
			boolean containsSpecialCharacter = false;
			for (int i = 0; i < password.length(); i++) {
				if (!Character.isLetter(password.charAt(i)) && !Character.isDigit(password.charAt(i))) {
					containsSpecialCharacter = true;
					break;
				}
			}
	return isLengthValid && containsDigit && containsUpperCaseLetter && containsLowerCaseLetter && containsSpecialCharacter;
			
	}
		
		//Validira e-mail adresu (sadrži znak @)
		
		public static boolean isEmailValid(String email) {
			if(email.equals("")) {
				return false;
				}
			return email.contains("@");
			
		}
		
		//Validira JMBG (ima tačno 13 cifara)
		
		public static boolean isIDValid(String id) {
			
			if (id.equals("")) {
				return false;
			}
		boolean containsDigitsOnly = true;
		for(int i = 0; i < id.length(); i++) {
			if(!Character.isDigit(id.charAt(i))) {
				containsDigitsOnly = false;
				break;
			}
		}
		return id.length() == 13 && containsDigitsOnly;
		}
		
		
		//Registracija korisnika
		
		public static void register() {
			
		String firstName;
		do {
			System.out.println("First name: ");
			firstName = scanner.nextLine();
		}while(!isFirstNameValid(firstName));
		
		firstNames.add(firstName);
		
		String lastName;
		do {
			System.out.println("Last name: ");
			lastName = scanner.nextLine();
		}while(!isLastNameValid(lastName));
		
		lastNames.add(lastName);
		
		String username;
		do {
			System.out.println("Username: ");
			username = scanner.nextLine();
		}while(!isUsernameValid(username));
		
		usernames.add(username);
		
		String password;
		do {
			System.out.println("Password: ");
			password = scanner.nextLine();
		}while(!isPasswordValid(password));
		
		passwords.add(password);
		
		String email;
		do {
			System.out.println("Email: ");
			email = scanner.nextLine();
		}while(!isEmailValid(email));
		
		emails.add(email);
		
		String id;
		do {
			System.out.println("ID: ");
			id = scanner.nextLine();
		}while(!isIDValid(id));
		
		ids.add(id);
		}
		
		//Prikaz svih korisnika

   public static void list() {
	   
	   System.out.printf(
		"|  First Name  |   Last Name  |   Username   |   Password   |         E-Mail         |       ID      |\n");
	   
	   		for (int i = 0; i < usernames.size(); i++) {
	   			System.out.printf("| %12s | %12s | %12s | %12s | %22s | %13s |\n", firstNames.get(i), lastNames.get(i),
						usernames.get(i), passwords.get(i), emails.get(i), ids.get(i));
			}
		}
	   	//Prijava korisnika
   
   public static void login() {
	   
	   System.out.print("username: ");
		String username = scanner.nextLine();
		System.out.print("password: ");
		String password = scanner.nextLine();
		
		for (int i = 0; i < usernames.size(); i++) {
			
			if(usernames.get(i).equals(username) && passwords.get(i).equals(password)) {
				
				System.out.println("Hello " + firstNames.get(i) + " " + lastNames.get(i) + ".");
				
				return;
				}
			else {
				System.out.println("Wrong username or password.");
			}
		}
   }
   
   //Učitavanje podataka iz datoteke
   
   
   public static void load(String path) {
	   
	   
	    firstNames = new ArrayList<String>();
		lastNames = new ArrayList<String>();
		usernames = new ArrayList<String>();
		passwords = new ArrayList<String>();
		emails = new ArrayList<String>();
		ids = new ArrayList<String>();
		
		
		List<String> lines;
		
		try {
			System.out.println(path);
			System.out.println(Paths.get(path));
			
			lines = Files.readAllLines(Paths.get(path));
			
			// for (int i = 0; i < lines.lenght(); i++) {
			//    String line = lines[i]
			for(String line : lines) {
				
				String[] atributes = line.split((";"));
				
				
				String firstName = atributes[0];
				firstNames.add(firstName);
				
				String lastName = atributes[1];
				lastNames.add(lastName);

				String username = atributes[2];
				usernames.add(username);

				String password = atributes[3];
				passwords.add(password);

				String email = atributes[4];
				emails.add(email);

				String id = atributes[5];
				ids.add(id);
				
				}
			}catch (Exception e) {
				
				System.out.println("Učitavanje podataka sa putanje " + path + " nije uspelo.");
			}
   }
   
   		//Snimanje podataka u datoteku
   
   			public static void save(String path) {
   				
   				ArrayList<String> lines = new ArrayList<String>();
   				
   				for(int i = 0; i < firstNames.size(); i++) {
   					
   					String line = firstNames.get(i) + ";" + lastNames.get(i) + ";"  
   						+ usernames.get(i) + ";" + passwords.get(i)
   						+ ";" + emails.get(i) + ";" + ids.get(i);
   					
   					lines.add(line);
   				}
   				try {
   					Files.write(Paths.get(path), lines, 
   							StandardOpenOption.CREATE,
   							StandardOpenOption.TRUNCATE_EXISTING,
   							StandardOpenOption.WRITE);
   				} catch (Exception e) {
   					System.out.println("Snimanje podataka na putanju " + path + " nije uspelo.");
   				}
   			}
   			
   			//Sortiranje korisnika po korisničkom imenu.
   			
   				
   		public static void sort() {

   			for (int i = 0; i < usernames.size()-1; i++) {
   				for (int j = i+1; j < usernames.size(); j++) {
   					//Poredimo dva korisnička imena (String) pomoću metode compareTo
   					if (usernames.get(i).compareTo(usernames.get(j)) > 0) {
   								
   					 String usenameTemp = usernames.get(i);
   					usernames.set(i, usernames.get(j));
   					usernames.set(j, usenameTemp);
   					
   					//Da bi se podaci ispravno sortirali, nije dovoljno samo zameniti mesta
   					//korisničkim imenima korisnika i i j, nego je potrebno zameniti sve podatke
   					//korisnika i sa podacima korisnika j
   					String firstNameTemp = firstNames.get(i);
   					firstNames.set(i, firstNames.get(j));
   					firstNames.set(j, firstNameTemp);
   								
   					String lastNameTemp = lastNames.get(i);
   					lastNames.set(i, lastNames.get(j));
   					lastNames.set(j, lastNameTemp);
   								
   					String passwordTemp = passwords.get(i);
   					passwords.set(i, passwords.get(j));
   					passwords.set(j, passwordTemp);
   								
   					String emailTemp = emails.get(i);
   					emails.set(i, emails.get(j));
   					emails.set(j, emailTemp);
   								
   					String idTemp = ids.get(i);
   					ids.set(i, ids.get(j));
   					ids.set(j, idTemp);
   							}
   							
   						}
   					}
   				}
   		public static void main(String[] args) {
   			
   			load("users.txt");
   			
   			String answer = null;

   			do {
   				// Prikaz menija
   				System.out.println("Menu:");
   				System.out.println("1. Register");
   				System.out.println("2. List");
   				System.out.println("3. Login");
   				System.out.println("4. Sort");
   				System.out.println("x. Exit");

   				// Unošenje opcije sa tastature
   				answer = scanner.nextLine();

   				// Izvršavanje unete opcije (poziv izabrane funkcije)
   				switch (answer) {
   				case "1":
   					register();
   					break;
   				case "2":
   					list();
   					break;
   				case "3":
   					login();
   					break;
   				case "4":
   					sort();
   					break;
   				case "x":
   					break;
   				default:
   					System.out.println("Wrong option. Please try again.");
   				}

   			} while (!answer.equals("x"));

   			// Snimanje podataka u datoteku
   			save("users.txt");

   			scanner.close();
   		
   		
   			}
   				
   				
}
   
   
   
   
   
   
   
   
   
   
  








		
		

	


