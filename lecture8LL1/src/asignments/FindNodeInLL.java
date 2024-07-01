//Find a Node in Linked List
//
//You have been given a singly linked list of integers. Write a function that returns the index/position of integer data denoted by 'N' (if it exists). Return -1 otherwise.
//Note :
//Assume that the Indexing for the singly linked list always starts from O.
//Input format :
//The first line contains an Integer 'T' which denotes the number of test cases.
//The first line of each test case or query contains the elements of the singly linked list separated by a single space.
//The second line contains the integer value 'N'. It denotes the data to be searched in the given singly linked list.
//Remember/Consider :
//While specifying the list elements for input, -1
//indicates the end of the singly linked list and hence -1 would never be a list element.
//Output format :
//For each test case, return the index/position of 'N' in the singly linked list. Return -1, otherwise.
//Output for every test case will be printed in a separate line.
//Note:
//You do not need to print anything; it has already been taken care of. Just implement the given function.
//Sample Input 1:
//3452619-1
//5
//10 20 30 40 50 60 70 -1
//6
//Sample Output 1:
//21
//-1
//Explanation for Sample Output 1:
//In test case 1, 'N' = 5 appears at position 2 (0-based
//indexing) in the given linked list.
//In test case 2, we can see that 'N' = 6 is not present in
//the given linked list.
//Sample Input 2 :
//2
//1 -1
//2
//3452619-1
//Sample Output 2 :
//-1
//4
//Explanation for Sample Output 2:
//In test case 1, we can see that 'N' = 2 is not present in
//the given linked list.
//In test case 2, 'N' = 6 appears at position 4 (0-based
//indexing) in the given linked list.

package asignments;

import java.util.Scanner;

import incrementEveryElementLL.Node;

public class FindNodeInLL {
	
	public static int find(Node <Integer> head,int n) {
		Node <Integer> temp=head;
		int pos=0;
		while(temp!=null) {
			if(temp.data.equals(n)) {
				return pos;
			}
			pos++;
			temp=temp.next;
		}
		return -1;
		// int pos = 0;
		// while (head != null) {
		// if (head.data.equals(n)) {
		// return pos;
		// }
		// head = head.next;
		// pos++;
		// }
		// return -1;
	}

	// return helper(head,0,n);
	// }
	// public static int helper(Node<Integer> head,int index,int n){
	// if(head==null)
	// return -1;
	// if(head.data==n)
	// return index;
	// int ans= helper(head.next,index+1,n);
	// return ans;
	// }
	
	public static Node<Integer> takeInput(){
		Scanner s= new Scanner(System.in);
		Node <Integer> head=null,tail=null;
		int data=s.nextInt();
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
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+ " ");
			head=head.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		Node<Integer> head=takeInput();
		print(head);
		System.out.println("Enter data to find postion");
		int data=s.nextInt();
		int postion=find(head, data);
		System.out.println(postion);
	}

}
