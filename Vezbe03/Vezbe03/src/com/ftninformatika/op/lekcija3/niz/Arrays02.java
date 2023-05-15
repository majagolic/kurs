package com.ftninformatika.op.lekcija3.niz;

public class Arrays02 {

	public static void main(String[] args) {
		//definisanje visedimenzionalnih nizova
		int C [] [] = new int [4] [7];
		
		for (int i = 0; i < 4 ; i++ )
			for (int j = 0; j < 7 ; j++ )
				C[i][j] = i * 10 + j;
		
		//ispis clanova matrice C
		System.out.println("2. Ispis matrice C");
		int suma = 0;
		for (int i = 0; i < 4 ; i++ )
			for (int j = 0; j < 7 ; j++ ) {
				suma += C[i][j];
				System.out.println("C [" + i +"][" + j + "] clan niza je " + C[i][j]);
			}
		
		System.out.println("Suma matrice je " + suma);
	}
}
