package stackUsing2Queues;


import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {

	Queue<Integer> q1;
	Queue<Integer> q2;
	int size;
	
	public StackUsingQueues() {
		q1=new LinkedList<Integer>();
		q2=new LinkedList<Integer>();
//		size=0;
	}
	
	void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.remove());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.remove());
		}
		size++;
	}
	int pop() {
		size--;
		return q1.remove();
	}
	int peek() {
		return q1.peek();
	}
	boolean isEmpty() {
		return size==0;
	}
	int size() {
		return size;
	}
	
}
