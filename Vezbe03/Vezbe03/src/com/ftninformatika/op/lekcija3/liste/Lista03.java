package com.ftninformatika.op.lekcija3.liste;

import java.util.ArrayList;

public class Lista03 {
	public static void main(String[] args) {
		
		//Kako se pravi lista za druge tipove
		
		//lista int-ova
		ArrayList<Integer> listaIntova = new ArrayList<Integer>();
		
		listaIntova.add(1);
		int a = 4;
		listaIntova.add(a);
		
		
		//lista double-ova
		ArrayList<Double> listaDouble = new ArrayList<Double>();
		
		listaDouble.add(1.0);
		double b = 4.3;
		listaDouble.add(b);
		
		
		//lista boolean-ova
		ArrayList<Boolean> listaBoolean = new ArrayList<Boolean>();
		
		listaBoolean.add(true);
		boolean c = false;
		listaBoolean.add(c);
		
		
	}
}
