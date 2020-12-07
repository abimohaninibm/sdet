package Activity4_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;



public class ScannerDemo {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the int numbers and to end enter a non int : ");
		while (s.hasNextInt()) {
			al.add(s.nextInt());	
		}
		
		System.out.println("*************Entered list*****************");
		for (Iterator iterator = al.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
		
		Random r = new Random();
		System.out.println("Random array field generated : "+al.get(r.nextInt(10)));
		
		
	}

}
