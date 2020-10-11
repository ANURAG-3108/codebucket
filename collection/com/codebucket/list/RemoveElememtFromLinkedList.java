package org.office.project.collections;

public class RemoveElememtFromLinkedList {
	
	public static void main(String [] args){
		
		
		   //Preparing some linked list structure
        LinkedList linkedList = new LinkedList(5);
        linkedList.next = new LinkedList(4);
        linkedList.next.next = new LinkedList(3);
        linkedList.next.next.next = new LinkedList(2);
        linkedList.next.next.next.next = new LinkedList(1);
 
        System.out.println("Original Linked List: " + linkedList.toString());
        
        linkedList = recursiveRemove(linkedList);
        System.out.println("Recursively Reversed List: "+ linkedList.toString());
 		
	}

	private static LinkedList recursiveRemove(LinkedList linkedList) {
		  if (linkedList == null || linkedList.next == null) {
	            return linkedList;
	        }
		  

	        LinkedList remainingRemove = recursiveRemove(linkedList.next);
	 
	        // update the tail as beginning
	        LinkedList current = remainingRemove;
	        while (current.next != null) {
	        	
	        	if(current.next.value==3){
	        		current = current.next.next;
	        	}
	        	else {
	            current = current.next;
	        	}
	        }
	        // assign the head as a tail
	        current.next = linkedList;
	        linkedList.next = null;
	 
	        return remainingRemove;
		  
		  
	}
}
