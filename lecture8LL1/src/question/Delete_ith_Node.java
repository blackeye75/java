//Delete Node in LL
//You have been given a linked list of integers. Your task is to write a function that deletes a node from a given position,
//'POS'.
//Note :
//Assume that the Indexing for the linked list always starts from 0.
//If the position is greater than or equal to the length of the linked list, you should return the same linked list without any change.

package question;

import java.util.Scanner;

public class Delete_ith_Node {

//	public static Node<Integer> deleteIthNode(Node<Integer> head, int pos) {
//		if (head == null) {
//			return head;
//		}
//		if (pos == 0) {
//			return head.next;
//		}
//		int count = 0;
//		Node<Integer> temp = head;
//		while (temp != null && count < pos - 1) {
//			temp = temp.next;
//			count++;
//		}
//		if (temp == null) {
//			return head;
//		}
//		if (temp.next != null) {
//			temp.next = temp.next.next;
//		}
//		return head;

	public static Node<Integer> deleteIthNode(Node<Integer> head, int pos) {
		if (head == null) {
			return head;
		}
		if (pos == 0) {
			return head.next;
		}
		Node<Integer> current = head;
		for (int i = 0; i < pos - 1 && current != null; i++) {
			current = current.next;
		}
		if (current == null || current.next == null) {
			return head;
		}
		Node< Integer> temp = current.next;
		current. next = temp. next;
		temp = null;
		return head;

	}

	public static Node<Integer> takeInput() {
		Node<Integer> head = null, tail = null;
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();

		while (data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}

	public static void print(Node<Integer> head) {

		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in); 
		Node<Integer> head = takeInput();
		print(head);
		System.out.println("Enter postion from wher to remove node");
		int pos=s.nextInt();
		head = deleteIthNode(head, pos);
		print(head);

	}

}
