package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		Queue<Integer> nums = new LinkedList<Integer>();

		System.out.println(nums.peek());
		//System.out.println(nums.element());

		System.out.println();
		nums.offer(1);
		nums.add(2);
		nums.offer(3);
		nums.add(4);
		System.out.println(nums.peek());
		System.out.println(nums.element());

		System.out.println("\n" + nums + "\n");

		nums.remove();
		nums.poll();
		nums.remove();
		nums.poll();
		System.out.println(nums + "\n");
		//System.out.println(nums.remove());
		System.out.println(nums.poll());// poll is null as nothing has remain in loop

		System.out.println();

		for (int i=1; i <=4; i++){
			System.out.println(nums.offer(i) + " ");
		}
		System.out.println("\n\n" + nums + "\n");

		Iterator<Integer> printer = nums.iterator();

		while (printer.hasNext()){

			System.out.println(printer.next());
		}
		System.out.println("\n");

		while (nums.isEmpty()){

			System.out.println(nums.remove());
		}

	}

}
