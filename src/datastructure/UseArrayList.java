package datastructure;

import java.util.Iterator;
import java.util.ListIterator;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		java.util.ArrayList<String> list = new java.util.ArrayList<String>();

		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");

		System.out.println("Iterator using while loop: ");
		Iterator<String> it1 = list.iterator();
		while (it1.hasNext()) {
			System.out.println("Next element: " + it1.next());
		}

		System.out.println("Iterator using for loop: ");
		for (Iterator<String> it2 = list.iterator(); it2.hasNext();) {
			System.out.println("Next element: " + it2.next());
		}

		System.out.println("List iterator (forward iteration): ");
		ListIterator<String> lit = list.listIterator();
		while (lit.hasNext()) {
			System.out.println("Next element: " + lit.next());

		}

		System.out.println("List iterator (backward iteration): ");
		lit = list.listIterator(list.size());
		while (lit.hasPrevious()) {
			System.out.println("Previous element: " + lit.previous());

		}

		lit.next();
		lit.add("One more element");
		System.out
				.println("Modified list after the insertion of the new element");

		System.out.println("Index of next element: " + lit.nextIndex());
		System.out.println("Index of previous element: " + lit.previousIndex());

		for (lit = list.listIterator(); lit.hasNext();) {
			System.out.println("Next element: " + lit.next());
		}

		lit.previous();
		lit.remove();

		System.out.println("Modified list after the removal of an element");
		for (lit = list.listIterator(); lit.hasNext();) {
			System.out.println("Next element: " + lit.next());
		}

		// Iterator to traverse the list
		Iterator it = list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
		//remove parameter PA
		list.remove("Five");
		System.out.println("after removing node");
		it = list.listIterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}



	}

}
