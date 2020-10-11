package theCollectionsAndConcurrency;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class IntroductionOfSet {

	public static void main(String[] args) {
		int count[] = { 10, 20, 30, 40, 50, 60, 70 };
		Set<Integer> mySet = new HashSet<Integer>();

		for (int i = 0; i <= 7; i++) {
			mySet.add(count[i]);
			System.out.println("Value of myHashSet is " + mySet);
			
		}
		
		TreeSet<Integer> myTreeSet = new TreeSet<Integer>();
		for(int j=0 ; j<=7;j++){
			myTreeSet.add(count[j]);
			System.out.println("Value of myTreeSet is " + mySet);			

		}
	}
}
