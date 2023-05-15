package objekatTelefonskiImenik;

import java.util.ArrayList;

public class Imenik {
	
	private ArrayList<Kontakt> listaKontakta =  new ArrayList<Kontakt>();

	public Imenik() {
		
	}

	public Imenik(ArrayList<Kontakt> listaKontakta) {
		
		this.listaKontakta = new ArrayList<Kontakt>(); 
	}

	public ArrayList<Kontakt> getListaKontakta() {
		return listaKontakta;
	}

	public void setListaKontakta(ArrayList<Kontakt> listaKontakta) {
		this.listaKontakta = listaKontakta;
	}

	
	public boolean unosKontakta(Kontakt noviKontakt) {
		
		for (int i = 0; i < listaKontakta.size(); i++) {
			if(listaKontakta.get(i).getId() == noviKontakt.getId()) {
				System.out.println("Kontakt vec postoji.");
				return false;
			}
			
		}
		listaKontakta.add(noviKontakt);
		System.out.println("Uspesno ste uneli kontakt.");
		return true;
		}
	
	
	public void ispisKontakata() {
		
		for (int i = 0; i < listaKontakta.size(); i++) {
			System.out.println(listaKontakta.get(i));
			}
	}
	
	public boolean izmenaKontakta(Kontakt noviKontakt) {
		
		for (int i = 0; i < listaKontakta.size(); i++) {
			if(listaKontakta.get(i).getId() == noviKontakt.getId()) {
				listaKontakta.set(i, noviKontakt);
				System.out.println("Uspesno izmenjen kontakt.");
				return true;
			}
		}
		System.out.println("Kontakt ne postoji.");
		return false;
	}
	
	public boolean obrisiKontakt(int broj) {
		
		for (int i = 0; i < listaKontakta.size(); i++) {
			if(listaKontakta.get(i).getId() == broj){
				listaKontakta.remove(i);
				System.out.println("Uspesno ste obrisali kontakt.");
				return true;
			}
		}
		System.out.println("Kontakt ne postoji.");
		return false;
	}
	
	
	
	
	
	
	
	
	

}
