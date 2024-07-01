//Problem statement
//For a given a binary tree of integers and an integer X, find and return the total number of nodes of the given binary tree which are having data greater than X.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= N <= 10^5
//Where N is the total number of nodes in the binary tree.
//
//Time Limit: 1 sec
//Sample Input 1:
//1 4 2 3 -1 -1 -1
//2
//Sample Output 1:
//2
//Explanation for Sample Input 1:
//Out of the four nodes of the given binary tree, [3, 4] are the node data that are greater than X = 2.
//Sample Input 2:
//5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//5
//Sample Output 2:
//3

package questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NodeGreaterThanX {
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

	public static int countNodesGreaterThanX(BinaryTreeNode<Integer> root, int x) {
		if (root == null) {
			return 0;
		}

		int smallOutput = countNodesGreaterThanX(root.left, x) + countNodesGreaterThanX(root.right, x);
		if (root.data > x) {
			return smallOutput + 1;
		} else {
			return smallOutput;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
