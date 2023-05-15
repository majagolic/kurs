package funkcijeListaCeliBrojevi;

import java.util.ArrayList;

public class CeliBrojevi {


		
		//Definicija funkcije koja vraca min.element liste
		
		public static int min(ArrayList<Integer> list) {
			
			int min = list.get(0);
			
			for(int i = 0; i < list.size(); i++) {
				
				if(list.get(0)<min)
				{
					min = list.get(0);
				}
			}
			return min;
		}

		
		public static int max(ArrayList<Integer> list) {
			
			int max = list.get(0);
			
			for(int i = 0; i<list.size(); i++) {
				if(list.get(i)>max) {
					max = list.get(i);
				}
			}
			return max;
		}
		
		public static int sum(ArrayList<Integer> list) {
			
			int sum = 0;
			
			for(int i = 0; i<list.size(); i++) {
				sum = sum + list.get(i);
			}
			return sum;
		}
		
		public static double prosek(ArrayList<Integer> list) {
			
			return (double)sum(list) / list.size();
		}
		
		public static void main(String[]args) {
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			list.add(3);
			list.add(7);
			list.add(6);
			list.add(8);
			list.add(5);
			
			
			int minimum = min(list);
			System.out.println(minimum);
			
			int maximum = max(list);
			System.out.println(maximum);
			
			int suma = sum(list);
			System.out.println(suma);
			
			double prosecnaVrednost = prosek(list);
			System.out.println(prosecnaVrednost);
			
		}
	}
	


