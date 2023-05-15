package vreme;

public class Sekunde {

	public static void main(String[] args) {
		
		
		
	int sekundi = 86400;

	int sati;
	int minuta;

	sati = sekundi / 3600;
	minuta = (sekundi % 3600) / 60;

	sekundi = (sekundi % 60);

	System.out.print(sati + ":" + minuta + ":" + sekundi);
				
				
	}

}

