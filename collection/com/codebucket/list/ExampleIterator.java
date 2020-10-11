package org.office.project.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Anurag Tiwari
 *
 */
public class ExampleIterator {

	@SuppressWarnings("unchecked")
	public static void main(String args[]){
		@SuppressWarnings("rawtypes")
		ArrayList animal = new ArrayList();
		animal.add("Horse");
		animal.add("Lion");
		animal.add("Tiger");
		animal.add("Cat");
		animal.add("Dog");

		@SuppressWarnings("rawtypes")
		Iterator animalItr = animal.iterator();

		System.out.println("Printing the animal iterator :: \n");
		while(animalItr.hasNext()) {
			String animalObj = (String)animalItr.next();
			System.out.print(animalObj+"\t");
		}
	}


}
