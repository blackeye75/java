//Problem statement
//For a given Binary Tree of type integer and a number X, find whether a node exists in the tree with data X or not.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= N <= 10^5
//
//Where N is the total number of nodes in the binary tree.
//
//Time Limit: 1 sec.
//Sample Input 1:
//8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
//7
//Sample Output 1:
//true
//Explanation For Output 1:
//Clearly, we can see that 7 is present in the tree. So, the output will be true.
//Sample Input 2:
//2 3 4 -1 -1 -1 -1
//10
//Sample Output 2:
//false
///*
//


package assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsNodePresent {
	
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
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root, int x) {
	    //Your code goes here
		if(root==null){
			return false;
		}
		if(root.data==x){
			return true;
		}
		boolean ans=isNodePresent(root.left, x) || isNodePresent(root.right, x);
		return ans;
	}



	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
		System.out.println(isNodePresent(root, 100));

	}

}
