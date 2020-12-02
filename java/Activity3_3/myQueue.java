package Activity3_3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class myQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new LinkedList<Integer>();

		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);

		for (Iterator iterator = q.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}

		q.remove();

		System.out.println("*************************");
		System.out.println("Head of the queue after removing 1st : " + q.peek());

		System.out.println("*************************");

		for (Iterator iterator = q.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
