package org.office.project.collections;

/**
 * Algo :
 * 
 * Traverse The linkedList and get the length N Devide the n/2 and get the
 * middle element Print the middle element and operate it.
 * 
 */
public class MiddleElementOfLinkedList {

	private Node head;

	// Getting the node of LinkedList
	private static class Node {
		private int value;
		private Node next;

		Node(int value) {
			this.value = value;

		}
	}

	public void addToTheLast(Node node) {

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null)
				temp = temp.next;

			temp.next = node;
		}
	}

	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.format("%d ", temp.value);
			temp = temp.next;
		}
		System.out.println();
	}

	// This function will find middle element in linkedlist
	public Node findMiddleNode(Node head) {
		// step 1
		Node fastPtr = head;
		Node slowPtr = head;

		int i = 0;
		while (fastPtr.next != null) {

			if (i == 0) {
				fastPtr = fastPtr.next;
				i = 1;
			} else if (i == 1) {
				fastPtr = fastPtr.next;
				slowPtr = slowPtr.next;
				i = 0;

			}
		}

		return slowPtr;

	}

	public static void main(String[] args) {
		MiddleElementOfLinkedList list = new MiddleElementOfLinkedList();
		// Creating a linked list
		Node head = new Node(5);
		list.addToTheLast(head);
		list.addToTheLast(new Node(6));
		list.addToTheLast(new Node(7));
		list.addToTheLast(new Node(1));
		list.addToTheLast(new Node(2));

		list.printList();
		// finding middle element
		Node middle = list.findMiddleNode(head);
		System.out.println("Middle node will be: " + middle.value);

	}
}
