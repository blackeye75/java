package TakeInput_LevelWiseAndPrintLevelWise;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

import questions.BinaryTreeNode;

public class BinaryTreeUse {

	public static void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + "";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
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
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s) {
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
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
		//Scanner s = new Scanner(System.in);
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		printLevelWise(root);
//		printTree(root);
		//s.close();
//		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(1);
//		BinaryTreeNode<Integer> node1 = new BinaryTreeNode<>(2);
//		root.left = node1;
//		BinaryTreeNode<Integer> node2 = new BinaryTreeNode<>(3);
//		root.right = node2;
	}
}
