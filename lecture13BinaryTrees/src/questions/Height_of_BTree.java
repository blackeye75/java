//Problem statement
//For a given Binary Tree of integers, find and return the height of the tree. Height is defined as the total number of nodes along the longest path from the root to any of the leaf node.
//
//Example:
//ALTIMAGE
//
//Height of the given tree is 3. 
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//0 <= N <= 10^5
//Where N is the total number of nodes in the binary tree.
//
//Time Limit: 1 sec
//Sample Input 1:
//10 20 30 40 50 -1 -1 -1 -1 -1 -1
//Sample Output 1:
//3
//Sample Input 2:
//3 -1 -1
//Sample Output 2:
//1

package questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Height_of_BTree {
	
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
	public static int height(BinaryTreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int leftHeight=height(root.left);
		int rightHeight=height(root.right);
		if(leftHeight>rightHeight) {
			return leftHeight+1;
		}else {
			return 1+rightHeight;
		}
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		printLevelWise(root);
		System.out.println(height(root));

	}

}
