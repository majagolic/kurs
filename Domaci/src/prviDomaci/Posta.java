package prviDomaci;

public class Posta {

	public static void main(String[] args) {
		
		String nazivPosiljaoca = "Maja Golic";
		String adresaPosiljaoca = "Doza Djerdja 4";
		double tezinaPaketa = 5.4;
		boolean preporuceno = false;
		
		String nazivPrimaoca;
		String adresaPrimaoca;
		
		nazivPrimaoca = "MZ Sirig";
		adresaPrimaoca = "Novosadska 38";
		
		System.out.println("Posiljac " + nazivPosiljaoca + " " + adresaPosiljaoca + 
				" salje paket primaocu" + " " + nazivPrimaoca + " " + adresaPrimaoca);
		
		System.out.println("Tezina paketa je " + tezinaPaketa + ".");

		System.out.println("Poslati preporuceno:" + preporuceno);
	}

}
