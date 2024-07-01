//Print ith Node

//For a given a singly linked list of integers and a position 'i',
//print the node data at the 'i-th' position.
//Note :
//Assume that the Indexing for the singly linked list always starts from 0.
//If the given position 'i', is greater than the length of the given singly linked list, then don't print anything.
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//The first line of each test case or query contains the elements of the singly linked list separated by a single space.
//The second line contains the value of 'i'. It denotes the position in the given singly linked list.
//Remember/Consider :
//While specifying the list elements for input, -1 indicates the end of the singly linked list and hence,
//would never be a list element.
//Output format :
//For each test case, print the node data at the 'i-th' position of the linked list(if exists).
//Output for every test case will be printed in a seperate line.

package question;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Print_ithNode {

	public static void printIth(Node<Integer> head, int i) {
		int postion = 0;
		Node<Integer> temp = head;
//		while(temp!=null) {
//			temp=temp.next;
//			postion++;
//			if(postion==i) {
//			System.out.println(temp.data);
//			}
//		}
		while (temp != null && i > postion) {
			postion++;
			temp=temp.next;
		}
//			if(temp!=null) {
//			System.out.println(temp.data);
//		}
		System.out.println(temp.data);
			
	}

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static Node<Integer> takeInput() throws IOException {
		Node<Integer> head = null, tail = null;

		String[] datas = br.readLine().trim().split("\\s");

		int i = 0;
		while (i < datas.length && !datas[i].equals("-1")) {
			int data = Integer.parseInt(datas[i]);
			Node<Integer> newNode = new Node<Integer>(data);
			if (head == null) {
				head = newNode;
				tail = newNode;
			} else {
				tail.next = newNode;
				tail = newNode;
			}
			i += 1;
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

	public static void main(String[] args) throws NumberFormatException, IOException {
		int t = Integer.parseInt(br.readLine().trim());

		while (t > 0) {

			Node<Integer> head = takeInput();
			int i = Integer.parseInt(br.readLine().trim());
			printIth(head, i);

			t -= 1;
		}
	}

}
