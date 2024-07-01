package questions;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class rootToNodePath_inBST {

	public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
		if (root == null)
			return null;
		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		if (data < root.data) {
			ArrayList<Integer> output = getPath(root.left, data);

			if (output != null) {
				output.add(root.data);
				return output;
			}
		}
		ArrayList<Integer> output2;
		if (data > root.data) {
			output2 = getPath(root.right, data);

			if (output2 != null) {
				output2.add(root.data);
				return output2;
			}
		}

		return null;

	}

	public static ArrayList<Integer> getPath2(BinaryTreeNode<Integer> root, int k) {
		if (root == null) {
			return null;
		}
		if (root.data == k) {
			ArrayList<Integer> output = new ArrayList<Integer>();
			output.add(root.data);
			return output;
		} else if (k < root.data) {
			ArrayList<Integer> leftOutput = getPath(root.left, k);
			if (leftOutput != null) {
				leftOutput.add(root.data);
			}
			return leftOutput;
		} else {
			ArrayList<Integer> rightOutput = getPath(root.right, k);
			if (rightOutput != null) {
				rightOutput.add(root.data);
			}
			return rightOutput;
		}
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
		BinaryTreeNode<Integer> root=takeInputLevelWise();
		printLevelWise(root);
		System.out.println(getPath2(root, 6));
	} 

}
