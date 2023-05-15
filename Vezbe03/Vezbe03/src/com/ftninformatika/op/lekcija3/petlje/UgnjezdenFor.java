package com.ftninformatika.op.lekcija3.petlje;

public class UgnjezdenFor {

	public static void main(String[] args) {

		for (int i = 1; i <= 3; i++) {
			System.out.println("i=" + i);
			for (int j = 1; j <= 5; j++) {
				System.out.println("    i=" + i + ", j=" + j);
			}
		}
	}

}
