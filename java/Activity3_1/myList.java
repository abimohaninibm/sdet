package Activity3_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class myList {

	public static void main(String[] args) {
		
		List<String> l = new ArrayList<String>();
		
		l.add("Abishek");
		l.add("Neil");
		l.add("Zuko");
		l.add("Aang");
		l.add("Korra");
		
		String string=null;
		System.out.println("List of all the names in the array");
		System.out.println("*****************************");
		
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			string = (String) iterator.next();
			System.out.println(string);
			
		}
		//Print third element
		System.out.println("*****************************");
		System.out.println("The 3rd element is : "+l.get(2));
		
		System.out.println("*****************************");
		if(l.contains("Aang")) {
			System.out.println("Present");
		}
		else {
			System.out.println("Not Present");
		}
		
		System.out.println("*****************************");
		System.out.println("Number of elements : "+l.size());
		
		l.remove("Aang");
		System.out.println("*****************************");
		System.out.println("Number of elements after removing one : "+l.size());
		

	}

}
