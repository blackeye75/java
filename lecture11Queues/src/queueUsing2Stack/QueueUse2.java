package queueUsing2Stack;

public class QueueUse2 {

	public static void main(String[] args) {
		QueueUsingStack2<Integer> queue = new QueueUsingStack2<>();
		queue.push(1);
		queue.push(2);
		queue.push(3);

		System.out.println("Size of queue: " + queue.size());
		System.out.println("Element at front: " + queue.peek());

		System.out.println("Popped element: " + queue.pop());
		System.out.println("Size of queue after pop: " + queue.size());
	}
}
