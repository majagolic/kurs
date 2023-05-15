package stringSplit;

import java.util.ArrayList;

public class SplitString {


		public static ArrayList<Integer> clanoviBroj = new ArrayList<Integer>();
		public static ArrayList<String> clanoviIme = new ArrayList<String>();
		
		
		public static void main(String[] args) {
		
			String podatak = "325;   NIKOLA  \n";
		
			podatak = podatak.replace(" ", "");
			System.out.println(podatak);
			
			String podatakBezNewLine = podatak.substring(0, podatak.length()-1);
			
			String[] splits = podatakBezNewLine.split(";");
			
			String brojStr = splits[0];
			
			int broj = Integer.parseInt(brojStr);
			System.out.println("Članski broj: " + broj);
			
			String imeVelikaSlova = splits[1];
			char prvoSlovoImena = imeVelikaSlova.charAt(0);
			
			String ostalaSlovaImena = imeVelikaSlova.substring(1);
			
			String ostalaSlovaImenaMalimSlovima = ostalaSlovaImena.toLowerCase();
			
			String ime = prvoSlovoImena + ostalaSlovaImenaMalimSlovima;
			System.out.println("Ime: " + ime);
			
			
			
			
	}

}

