//roblem statement
//Given a BST, convert it into a sorted linked list. You have to return the head of LL.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//Time Limit: 1 second
//1<=n<=10^5
//Note:
//In case if you are facing any issue to solve this problem, please prefer to use the helper function.
//Sample Input 1:
//8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1
//
//
//Sample Output 1:
//2 5 6 7 8 10

package Questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pair2 {
	Node<Integer> head;
	Node<Integer> tail;
}

public class BST_to_Sorted_LL {
	
	//without pair class
//	coding ninjas solution

	public static Node<Integer> addNode(BinaryTreeNode<Integer> currBSTNode, Node<Integer> currLLNode) {
		Node<Integer> newNode = new Node<>(currBSTNode.data);
		currLLNode.next = newNode;
		return newNode;
	}

	public static Node<Integer> helper(BinaryTreeNode<Integer> currBSTNode, Node<Integer> currLLNode) {
		if (currBSTNode == null)
			return currLLNode;
		if (currBSTNode.left != null)
			currLLNode = helper(currBSTNode.left, currLLNode);
		currLLNode = addNode(currBSTNode, currLLNode);
		if (currBSTNode.right != null)
			currLLNode = helper(currBSTNode.right, currLLNode);
		return currLLNode;
	}
	public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
		if (root == null)
		return null;
		Node<Integer> head = new Node<>(root.data);
		helper (root, head);
		return head.next;
		}

//	public static Node<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {
//		Pair2 ans = helper(root);
//		return ans.head;
//	}
//
//	public static Pair2 helper(BinaryTreeNode<Integer> root) {
//		if (root == null) {
//			Pair2 output = new Pair2();
//			output.head = null;
//			output.tail = null;
//			return output;
//		}
//		Pair2 lefttree = helper(root.left);
//		Node<Integer> newNode = new Node<>(root.data);
//		Pair2 righttree = helper(root.right);
//		Pair2 output = new Pair2();
//		if (lefttree.head != null) {
//			output.head = lefttree.head;
//			lefttree.tail.next = newNode;
//
//		} else {
//			output.head = newNode;
//		}
//		newNode.next = righttree.head;
//		if (righttree.head == null) {
//			output.tail = newNode;
//
//		} else {
//			output.tail = righttree.tail;
//		}
//		return output;
//	}

	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
//			head=temp;
		//
//		while(head!=null) {
//			System.out.print(head.data+" ");
//			head=head.next;
//		}
	}

	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		// Your code goes here
		if (root == null) {
			return;
		}
		Queue<BinaryTreeNode<Integer>> pendingNodes = new LinkedList<BinaryTreeNode<Integer>>();
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front = pendingNodes.poll();
			System.out.print(front.data + ":");
			if (front.left != null) {
				pendingNodes.add(front.left);
				System.out.print("L:" + front.left.data);
			} else {
				System.out.print("L:-1");
			}

			if (front.right != null) {
				pendingNodes.add(front.right);
				System.out.print(",R:" + front.right.data);
			} else {
				System.out.print(",R:-1");
			}
			System.out.println();

		}
	}

	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);

		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}

			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);

		Node<Integer> ll = constructLinkedList(root);
		print(ll);
	}

}
