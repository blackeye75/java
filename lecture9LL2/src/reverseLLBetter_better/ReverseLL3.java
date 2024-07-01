package reverseLLBetter_better;

import java.util.Scanner;

class Node<T> {

	T data;
	Node<T> next;

	Node(T data) {
		this.data = data;
		next = null;
	}
}

public class ReverseLL3 {
	
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		Node<Integer> head=null,tail=null;
		int data=s.nextInt();
		while(data!=-1) {
			Node <Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}else {
				tail.next=newNode;
				tail=newNode;
			}
			data=s.nextInt();
		}
		return head;
	}
	public static void print(Node<Integer> head) {
		Node<Integer> temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static Node<Integer> reverseLLr(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> reversedTail=head.next;
		Node<Integer> smallHead=reverseLLr(head.next);
		reversedTail.next=head;
		head.next=null;
		return smallHead;
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		head=reverseLLr(head);
		print(head);

	}

}

