package theCollectionsAndConcurrency;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import theBasicJava.ReverseArray;
import theBasicJava.ReversingArray;

public class LinkedListOperation {
	
	@SuppressWarnings("unchecked")
	public static void main(String [] args){		
		List aList = new LinkedList();
		
		// Iterator operations for LinkedList
		LoopingOperations(aList);		
				
		// Operations for hashcode and Equal methods
		ReverseArray rar1= new ReverseArray();
		ReversingArray rar2= new ReversingArray();		
		HashCodeAndEqualOperations(rar1, rar2);			
	}
	
	private static void HashCodeAndEqualOperations(ReverseArray rar1,
			ReversingArray rar2) {
		
		System.out.println("hashcode ofr rar1 "+rar1.hashCode());
		System.out.println("hashcode ofr rar2 "+rar2.hashCode());
		
		if(!(rar1.equals(rar2))){
			System.out.println("Hashcode are unequal");
		}
		
	}

	@SuppressWarnings("unchecked")
	private static void LoopingOperations(List aList) {
		aList.add(0,"Anurag Tiwari");
		aList.add(1,"Anurag sharma");
		aList.add(2,"Anurag bansal");
		aList.add(3,"Anurag trivedi");
		Iterator itr = aList.iterator();
		if(itr.hasNext()){			
			System.out.println("Loopong operations of Iterator");			
		}
		
	}


}
