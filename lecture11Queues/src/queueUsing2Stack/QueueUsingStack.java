package queueUsing2Stack;

import java.util.Stack;

public class QueueUsingStack<T> {

	Stack<T> s1;
	Stack<T> s2;

	public QueueUsingStack() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	void enqueue(T element) {
		s1.push(element);
	}

	T dequeue() {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T ans = s2.pop();
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}

	T peek() {
		while (!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		T ans = s2.peek();
		while (!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		return ans;
	}
}
