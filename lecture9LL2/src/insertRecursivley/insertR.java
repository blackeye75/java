package insertRecursivley;

import java.util.Scanner;

public class insertR {
	
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		int data=s.nextInt();
		Node <Integer> head=null,tail=null;
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
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
	public static void print(Node <Integer> head) 
	{
		if(head==null) {
			return;
		}
		System.out.print(head.data+" ");
		print(head.next);
	}
	
	public static Node<Integer> insertR(Node <Integer> head,int elem,int pos){
		if(pos==0) {
			Node <Integer> newNode=new Node<Integer>(elem);
			newNode.next=head;
			return newNode;
		}
		if(head==null) {
			return head;
		}
		head.next=insertR(head.next, elem, pos-1);
		return head;
	}

	public static void main(String[] args) {
		Node <Integer> head=takeInput();
		print(head);
		System.out.println();
		Node< Integer> head1=insertR(head, 100, 2);
		print(head1);

	}

}
