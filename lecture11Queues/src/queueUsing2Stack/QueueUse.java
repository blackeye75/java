package queueUsing2Stack;

public class QueueUse {

	public static void main(String[] args) {
		QueueUsingStack<Integer> queue=new QueueUsingStack<>();
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
//		queue.enqueue(40);
//		queue.enqueue(50);
		
		System.out.println(queue.peek());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
	}

}
