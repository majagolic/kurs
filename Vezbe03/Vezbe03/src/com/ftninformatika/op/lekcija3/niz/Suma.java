package com.ftninformatika.op.lekcija3.niz;

/*
 *  Primer programa koji racuna sumu niza brojeva.
 */
public class Suma {
	
  public static void main(String[] args) {
    int niz[] = {1, 2, 3, 4, 5};      
    int suma = 0;
    int prod = 1;
    
    for (int i = 0; i < niz.length; i++) {
      suma += niz[i]; // suma = suma + niz[i];
      prod *= niz[i];
    }  
   
    System.out.println("Suma niza je:" + suma);   
    System.out.println("Proizvod niza je: " + prod);
  }
}