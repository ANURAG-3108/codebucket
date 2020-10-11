package theCollectionsAndConcurrency;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * 
 * Bubble Rotate of Array. Complexity O(1);
 * 
 * @author Anurag
 */

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anurag");
		list.add("arti");
		list.add("Gaurav");
		list.add("Priyanka");
		list.add("Anonmouse");
		list.add("Anurag");

		ListIterator fwd = list.listIterator();
		ListIterator rev = list.listIterator(list.size());

		for (int i = 0, mid = list.size() >> 1; i < mid; i++) {
			Object tmp = fwd.next();
			fwd.set(rev.previous());
			rev.set(tmp);
		}
		System.out.println(list);
	}
}
