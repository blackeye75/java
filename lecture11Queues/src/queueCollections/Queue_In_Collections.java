package queueCollections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_In_Collections {

	public static void main(String[] args) {
		Queue<Integer> queue= new LinkedList<Integer>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		System.out.println(queue.size());
		System.out.println(queue.poll());
		System.out.println(queue.size());
		System.out.println(queue.isEmpty());
		System.out.println(queue.peek());
		System.out.println(queue.remove());

	}

}
