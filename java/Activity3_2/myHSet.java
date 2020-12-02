package Activity3_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class myHSet {

	public static void main(String[] args) {

		Set<Integer> hs = new HashSet<Integer>();

		hs.add(93);
		hs.add(3);
		hs.add(233);
		hs.add(1);
		hs.add(8);
		hs.add(933);
		hs.add(933);

		System.out.println("Size of the HastSet : " + hs.size());
		hs.remove(233);

		System.out.println("**********************");
		if (hs.contains(233)) {
			System.out.println("233 is present..");
		} else {
			System.out.println("233 is not present..");
		}

		System.out.println("**********************");

		for (Iterator iterator = hs.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}

}
