package questions;

//Following is the structure of the node class for a Singly Linked List

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

}

public class ImplementingStackUsingSinglyLL {

	private Node head;
	private int size;

	public ImplementingStackUsingSinglyLL() {
		// Implement the Constructor
		head = null;
		size = 0;
	}

	/*----------------- Public Functions of Stack -----------------*/

	public int getSize() {
		// Implement the getSize() function
		return size;
	}

	public boolean isEmpty() {
		// Implement the isEmpty() function
		return getSize() == 0;
	}

	public void push(int element) {
		// Implement the push(element) function
		Node newNode = new Node(element);
		newNode.next = head;
		head = newNode;
		size++;
	}

	public int pop() {
		// Implement the pop() function
		if (getSize() == 0) {
			return -1;
		}
		int tempdata = head.data;
		head = head.next;
		size--;
		return tempdata;
	}

	public int top() {
		// Implement the top() function
		if (getSize() == 0) {
			return -1;
		}
		return head.data;
	}

}
