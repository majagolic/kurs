package stringRegistracijaKorisnika;

import java.util.Scanner;

public class RegistracijaKorisnika {
	
	//Ime mora da počne velikim slovom
	//Validacija imena
	
	public static boolean isFirstNameValid(String firstName) {
		
		if(firstName.equals("")) {
			return false;
		}
		else {
			return Character.isUpperCase(firstName.charAt(0));	
		}
	}
		
	//Prezime mora da počne velikim slovom
		//Validacija prezimena
	
	
	public static boolean isLastNameValid(String lastName) {
		if (lastName.equals("")) {
			return false;
		}
		return Character.isUpperCase(lastName.charAt(0));
	}
	
	//Korisnično ime mora da sadrži samo slova
	
	public static boolean  isUserNameValid(String username) {
		
		if(username.equals("")) {
			return false;
		}
		boolean sadrziSamoSlova = true;
		
		for(int i = 0; i<username.length(); i++) {
			if(!Character.isLetter(username.charAt(i))) {
				sadrziSamoSlova = false;
				break;
			}
		}
		return sadrziSamoSlova;
	}
			
			
	//Validira lozinku (sadrži bar jedno malo slovo, veliko slovo, 
	//cifru i specijalni znak i ima između 6 i 12 znakova
	
	public static boolean isPasswordValid(String password) {
		if(password.equals("")) {
			return false;
		}
	    boolean isValidLength = password.length()>=6 && password.length()<=12;
		
		boolean containsDigit = false;
		
		  for(int i = 0; i < password.length(); i++) {
			if(Character.isDigit(password.charAt(i))){
				containsDigit = true;
				break;
			}
		}
		boolean containsLowerCaseLetter = false;
		
		 for(int i = 0; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i))){
			    containsLowerCaseLetter = true;
				break;
			}
		}
		boolean containsUpperCaseLetter = false;
		
		 for(int i = 0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				containsUpperCaseLetter = true;
				break;
			}
		}
		boolean containsSpecialCharacter = false;
		
		 for(int i = 0; i < password.length(); i++) {
			 if(!Character.isDigit(password.charAt(i)) && !Character.isLetter(password.charAt(i))) {
				 containsSpecialCharacter = true;
				 break;
			 }
		 }
		 return isValidLength && containsDigit && containsLowerCaseLetter && containsUpperCaseLetter && containsSpecialCharacter;
	}
		 
		 // Validira e-mail adresu (sadrži znak @)
		 
		 public static boolean isEmailValid(String email) {
				if (email.equals("")) {
					return false;
				}
				
				return email.contains("@");
		 }
		 // Validira JMBG (ima tačno 13 cifara)
		
		public static boolean isJmbgValid(String jmbg)	{
			if(jmbg.equals("")) {
				return false;
			}
		boolean containsDigitsOnly  = true;
		 for (int i = 0; i < jmbg.length(); i++) {
			 if(!Character.isDigit(jmbg.charAt(i))) {
				 containsDigitsOnly  = true;
				 break;
			 }
		 }
			 return jmbg.length() == 13 && containsDigitsOnly;
		 }
		
		
		
		public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String firstName;
			do {
				System.out.println("First name: ");
				firstName = scanner.nextLine();
			}while (!isFirstNameValid(firstName));
			
		String lastName;
			do {
				System.out.println("Last Name: ");
				lastName = scanner.nextLine();
			}while(!isLastNameValid(lastName));
		
		String username;
			do {
				System.out.println("Username: ");
				username = scanner.nextLine();
			}while(!isUserNameValid(username));
			
			
		String password;
			do {
				System.out.println("Password: ");
				password = scanner.nextLine(); 
			}while(!isPasswordValid(password));
			
		String email;
		do {
			System.out.println("Email: ");
			email = scanner.nextLine(); 
		}while(!isEmailValid(email));
		
		String jmbg;
		do {
			System.out.println("JMBG: ");
			jmbg = scanner.nextLine(); 
		}while(!isJmbgValid(jmbg));
		
		System.out.println("User data:");
		System.out.println("-----------------------------");
		System.out.println("First name: " + firstName);
		System.out.println("Last name:" + lastName);
		System.out.println("Username:" + username);
		System.out.println("Password: " + password);
		System.out.println("E-mail: " + email);
		System.out.println("JMBG: " + jmbg);
		System.out.println("-----------------------------\n");
		
		
			scanner.close();
	}

}
