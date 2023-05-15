package com.ftninformatika.op.lekcija3.petlje;

public class PrimerBreakContinue {

	public static void main(String[] args) {
		//UGNJEZDENE KONSTRUKCIJE
		//prolazi u petlji se mogu preskakati naredbom continue, 
		//a moze se i izaci naredbom break
		for(int i = 0; i < 10; i++){
			
			if (i == 2)
				continue;
			
			if (i==7){
				break;
			}
			
			System.out.println("Broj je:" + i);
		}
		
	}
}
