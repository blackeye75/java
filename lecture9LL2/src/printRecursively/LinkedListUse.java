package printRecursively;

import java.util.Scanner;

public class LinkedListUse {

	public static void insert(Node<Integer> head, int elem, int pos) {
		Node<Integer> nodeToBeInserted = new Node<Integer>(elem);

		if (pos == 0) {
			nodeToBeInserted.next = head;
			head = nodeToBeInserted;
		} else {
			int count = 0;
			Node<Integer> prev = head;
			while (count < pos - 1 && prev != null) {
				count++;
				prev = prev.next;
			}
			if (prev != null) {
				nodeToBeInserted.next = prev.next;
				prev.next = nodeToBeInserted;
			}
		}
	}

	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while (data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if (head == null) {
				head = currentNode;
				tail = currentNode;
			} else {
				// Node<Integer> tail = head;
				// while(tail.next!==null){
				// tail= tail.next;
				// }
				// tail.next= currentNode;
				// }
				// data=s.nextInt();
				tail.next = currentNode;
				tail = currentNode; // tail=tail.next;
			}
			data = s.nextInt();
		}
		return head;

	}

	public static void printR(Node<Integer> head) {
		if (head == null) {
			return;
		}
		printR(head.next);                                    //swap for not reverseing the list
		System.out.print(head.data + " ");
	}

	public static void main(String[] args) {

		Node<Integer> head = takeInput();
		printR(head);
		// Node<Integer> n1= new Node<>(10);
		// System.out.println(length(head));

	}
}
