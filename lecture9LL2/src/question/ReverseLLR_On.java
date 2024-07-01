package question;

import java.util.Scanner;

public class ReverseLLR_On {
	
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
	
	public static Node<Integer> reverseRec(Node<Integer> head) {
		 if (head == null || head.next == null) {
           return head;
       }

       Node<Integer> reversedHead = reverseRec(head.next);

       head.next.next = head;
       head.next = null;

       return reversedHead;
	}

	public static void main(String[] args) {
		Node<Integer> head=takeInput();
		head=reverseRec(head);
		print(head);
	}

}
