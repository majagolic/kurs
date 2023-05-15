package listaStudentskaSluzba;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentskaSluzba {

	public static void main(String[] args) {
		
		ArrayList<String> indeksi = new ArrayList<String>();
		ArrayList<String> ime = new ArrayList<String>();
		ArrayList<String> prezime = new ArrayList<String>();
		ArrayList<Double> prosek = new ArrayList<Double>();
		
		//dodati 5 studenata
		
		//indeksi
		
		indeksi.add("I1");
		indeksi.add("I2");
		indeksi.add("I3");
		indeksi.add("I4");
		indeksi.add("I5");
		
		//imena
		
		ime.add("Maja");
		ime.add("Sanja");
		ime.add("Olja");
		ime.add("Daca");
		ime.add("Andrea");
		
		//prezimena
		
		prezime.add("Golic");
		prezime.add("Brkic");
		prezime.add("Gajin");
		prezime.add("Obadov");
		prezime.add("Dudas");
		
		//prosek
		
		prosek.add(10.00);
		prosek.add(9.33);
		prosek.add(7.75);
		prosek.add(8.56);
		prosek.add(6.66);
		
		Scanner sc = new Scanner(System.in);
		
		String opcija;
		
		do {
			System.out.println("--------------MENI----------------");
			System.out.println("1. Spisak studenata");
			System.out.println("2. Pronalazenje studenta na osnovu broja indeksa");
			System.out.println("3. Pronalazenje studenta sa prosecnom ocenom vecom od navedene");
			System.out.println("4. Pronalazenje studenta sa najvisom prosecnom ocenom");
			System.out.println("5. Unos novog studenta");
			System.out.println("6. Brisanje studenta");
			System.out.println("7. Izmena podataka o studentu");
			System.out.println("8. Izmena prosecne ocene za studenta");
			System.out.println("x. Izlaz");
			System.out.println("Unesite opciju: ");
			
			opcija = sc.next();
			
			switch(opcija) {
			
			//spisak studenata
			
			case "1":
				
				for(int i = 0; i <indeksi.size(); i++) {
					
					System.out.printf("%10s %10s %10s %5.2f\n", indeksi.get(i), ime.get(i), prezime.get(i), prosek.get(i));
				}
				break;
				
			//pronalazenje studenta na osnovu broja indexa
				
			case "2":
				
				System.out.println("Unesite broj indeksa studenta: ");
				String brIndeksa = sc.nextLine();
				int pozicija = indeksi.indexOf(brIndeksa);
				
				//ako postoji
				
				if(pozicija != -1) {
					System.out.printf("%10s %10s %10s %5.2f \n", indeksi.get(pozicija), ime.get(pozicija), prezime.get(pozicija), prosek.get(pozicija));
				}
				else {
					System.out.println("Student sa unesenim brojem indeksa ne postoji.");
				}
				break;
				
				//pronalazenje studenata sa prosecnom ocenom vecom od navedene u pragu
				
			case "3":
				
				System.out.println("Unesite prag za ocenu:");
				double prag = Double.parseDouble(sc.nextLine());
				
				System.out.println("Studenti sa ocenom vecom od praga su:");
				
				for(int i = 0; i<indeksi.size(); i++) {
					if(prosek.get(i)>prag) {
						System.out.printf("%10s %10s %10s %5.2f %\n", indeksi.get(i), ime.get(i), prezime.get(i), prosek.get(i));
						}
					}
				break;
				
			//pronalazenje studenta sa najvisom prosecnom ocenom
				
			case "4":
				
				//prvo pronalazimo najvisu prosecnu ocenu
				//prvo proglasimo prvu za najvisu
				
				double ocenaMax = prosek.get(0);
				
				for(int i = 0; i<prosek.size(); i++) {
					
					//ako je neka ocena veca od ocenaMax, stavimo da je ona najveca
					
					if(prosek.get(i)>ocenaMax) {
						
						ocenaMax = prosek.get(i);
						}
				}
				System.out.println("Studenti sa najvisim prosecima su: ");
				
					for(int i = 0; i<prosek.size(); i++) {
						if(ocenaMax == prosek.get(i)) {
								
				System.out.printf("%10s %10s %10s %5.2f \n", indeksi.get(i), ime.get(i), prezime.get(i), prosek.get(i));
						}
					}
					break;
					
					//unos studenta
					
			case "5":
				
				System.out.println("Unesite broj indeksa studenta: ");
				String brojIndeksa = sc.nextLine();
				
				System.out.println("Unesite ime studenta: ");
				String imeStudenta = sc.nextLine();
				
				System.out.println("Unesite prezime studenta: ");
				String prezimeStudenta = sc.nextLine();
				
				System.out.println("Unesite prosek studenta: ");
				double prosekStudenta = Double.parseDouble(sc.nextLine());
				
				//dodate podatke dodajemo na kraj liste
				
				indeksi.add(brojIndeksa);
				ime.add(imeStudenta);
				prezime.add(prezimeStudenta);
				prosek.add(prosekStudenta);
				
				System.out.println("Student je uspesno upisan.");
				
				break;
				
				//brisanje studenta
				
			case "6":
				
				System.out.print("Unesite broj indeksa studenta: ");
				brIndeksa = sc.nextLine();
				
				//trazimo poziciju studenta u listi
				
				int pozicijA = indeksi.indexOf(brIndeksa);
				
				//ako postoji student sa tim brojem
				
				if(pozicijA != -1) {
					
					
				    indeksi.remove(pozicijA);
					ime.remove(pozicijA);
					prezime.remove(pozicijA);
					prosek.remove(pozicijA);
					System.out.println("Student je uspesno obrisan.");
				}
				else {
					System.out.println("Student sa unesenim brojem indeksa ne postoji.");
				}
				break;
				
				//izmena podataka o studentu
				
			case"7":
				
				System.out.println("Unesite broj indeksa studenta: ");
				String brIndexa = sc.nextLine();
				
				//trazimo poziciju studenta
				
				int pozicijaStudenta = indeksi.indexOf(brIndexa);
				
				if(pozicijaStudenta != -1) {
					
					System.out.print("Unesite novo ime studenta: ");
					String novoIme = sc.nextLine();
					System.out.print("Unesite novo prezime studenta: ");
					String novoPrezime = sc.nextLine();
					
					ime.set(pozicijaStudenta, novoIme);
					prezime.set(pozicijaStudenta, novoPrezime);
					
					System.out.println("Student je uspesno promenjen.");
				}
				else
					System.out.println("Ne postoji student sa unesenim brojem indeksa.");
				
					break;
					
					//izmena prosecne ocene za studenta
					
			case"8":
				
				System.out.println("Unesite broj indeksa studenta: ");
				String brIndexaStudenta = sc.nextLine();
				
				int pozicijaStudenata = indeksi.indexOf(brIndexaStudenta);
				
				if(pozicijaStudenata != -1) {
					System.out.print("Unesite novi prosek studenta: ");
					double noviProsek = Double.parseDouble(sc.nextLine());
					
					prosek.set(pozicijaStudenata, noviProsek);
					
					System.out.println("Prosek studenta je uspesno promenjen.");
				}
				else
					System.out.println("Student sa unesenim brojem indeksa ne postoji.");
				
				break;
				}
	   
		} while (!opcija.equals("x"));
		
		sc.close();
	}
						
}
		
		
