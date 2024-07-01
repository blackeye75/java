package reverseLlBetter;

import java.util.Scanner;

public class ReverseLLbetter {
	
//	public class DoubleNode {
//
//		Node<Integer> head;                               it can be written in same class but it should be public
//		Node<Integer> tail;
////		public String data;
////		public DoubleNode next;
//
//	}
	
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		Node<Integer> head=null,tail=null;
		int data=s.nextInt();
		while(data!=-1) {
			Node< Integer> newNode=new Node<Integer>(data);
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
		System.out.println();
	}
	public static Node<Integer> reverseLLR(Node<Integer> head){
		if(head==null || head.next==null) {
			return head;
		}
		Node<Integer> finalHead=reverseLLR(head.next);
		Node<Integer> temp=finalHead;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		return finalHead;
	}
	
	public static DoubleNode reverseLLrBetter(Node<Integer> head) {
		if(head==null || head.next==null) {
			DoubleNode ans=new DoubleNode();
			ans.head=head;
			ans.tail=head;
			return ans;
		}
		DoubleNode smallAns=reverseLLrBetter(head.next);
		smallAns.tail.next=head;
		head.next=null;
		
		DoubleNode ans=new DoubleNode();
		ans.head=smallAns.head;
		ans.tail=head;
		return ans;
		
	}

	public static void main(String[] args) {
		Node <Integer> head=takeInput();
//		print(head);
		DoubleNode ans=reverseLLrBetter(head);
		print(ans.head);

	}

}
