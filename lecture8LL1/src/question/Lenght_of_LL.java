package question;

import java.util.Scanner;

public class Lenght_of_LL {

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
	public static int length(Node<Integer> head) {
		Node<Integer> temp=head;
		int length=0;
		while(temp!=null) {
			temp=temp.next;
			length++;
		}
		return length;
	}
	public static void main(String[] args) {
	Node <Integer> head=takeInput();
	int length=length(head);
	System.out.println(length);

	}

}
