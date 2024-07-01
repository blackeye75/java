package queueUsing2Stack;

import java.util.Stack;

public class QueueUsingStack2<T> {
	private Stack<T> stack1;
	private Stack<T> stack2;

	public QueueUsingStack2() {
		stack1 = new Stack<>();
		stack2 = new Stack<>();
	}

	public void push(T element) {
		stack1.push(element);
	}

	public T pop() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.pop();
	}

	public T peek() {
		if (isEmpty()) {
			throw new IllegalStateException("Queue is empty");
		}

		if (stack2.isEmpty()) {
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
		}

		return stack2.peek();
	}

	public int size() {
		return stack1.size() + stack2.size();
	}

	public boolean isEmpty() {
		return stack1.isEmpty() && stack2.isEmpty();
	}
}
