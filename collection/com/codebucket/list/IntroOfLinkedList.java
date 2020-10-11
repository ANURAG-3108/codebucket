package theCollectionsAndConcurrency;

import java.util.LinkedList;

public class IntroOfLinkedList {

	private String str;
	public static void main(String[] args) {

		LinkedList<String> myList = new LinkedList<String>();
		for (char i = 'a'; i <= 'z'; i++) {
			myList.add(i + "");
		}
		System.out.println("myList ::" + myList);

	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((str == null) ? 0 : str.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IntroOfLinkedList other = (IntroOfLinkedList) obj;
		if (str == null) {
			if (other.str != null)
				return false;
		} else if (!str.equals(other.str))
			return false;
		return true;
	}
}
