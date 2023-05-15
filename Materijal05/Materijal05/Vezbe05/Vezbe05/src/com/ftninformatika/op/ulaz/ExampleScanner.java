package com.ftninformatika.op.ulaz;

import java.util.Scanner;

public class ExampleScanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Molimo unesite tekst:");
		String s = sc.nextLine(); 
		System.out.println("Uneli ste tekst: " + s);
		
		System.out.println("Molimo unesite broj:");
		//int i = sc.nextInt();
		int i = Integer.parseInt(sc.nextLine());
		System.out.println("Uneli ste broj: " + i);
		
		System.out.println("Molimo unesite decimalni broj:");
		//float f = sc.nextFloat();
		double f = Double.parseDouble(sc.nextLine());
		System.out.println("Uneli ste decimalni broj: " + f);
		
		sc.close();
	}
}
