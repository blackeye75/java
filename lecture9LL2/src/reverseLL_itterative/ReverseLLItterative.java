package reverseLL_itterative;

import java.util.Scanner;

class Node<T> {
	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		next = null;
	}
}

public class ReverseLLItterative {

	public static Node<Integer> reverseLL(Node<Integer> head) {
		Node<Integer> current = head, previous = null, temp;
		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		return previous;
	}

	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		Node<Integer> head = null, tail = null;
		int data = s.nextInt();
		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		head=reverseLL(head);
		print(head);
	}

}
