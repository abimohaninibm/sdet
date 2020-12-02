package Activity3_3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class MyDqueue {

	public static void main(String[] args) {

		Deque<String> dq = new LinkedList<String>();
		
		dq.add("dog");
		dq.add("cat");
		dq.add("camel");
		
		for (Iterator iterator = dq.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("*************************************");
		dq.addFirst("tiger");
		dq.addLast("Lion");
		
		for (Iterator iterator = dq.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		System.out.println("*************************************");
		System.out.println("First Element : "+dq.peekFirst());
		System.out.println("Last Element : "+dq.peekLast());
		
		System.out.println("*************************************");
		dq.removeFirst();
		dq.removeLast();
		
		
		System.out.println("Size of the dequeue : "+dq.size());
		
	}

}
