package quetions;

import java.util.ArrayList;
import java.util.Scanner;


public class NoOfNodesGreaterThanX {
	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>(); // Queue of node that are
																								// entered themselves
																								// but their children
																								// aren't added yet
	System.out.println("Enter root Data");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> currentNode;
			try {
				currentNode = pendingNodes.dequeue();
			System.out.println("Enter number of children of "+currentNode.data);
				int numChild = s.nextInt();
				for (int i = 0; i < numChild; i++) {
				System.out.println("Enter "+ (i+1) + "th child of " + currentNode.data);
					int currentChild = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(currentChild);
					pendingNodes.enqueue(childNode);
					currentNode.children.add(childNode);
				}
			} catch (QueueEmptyException e) {
			}
		}
		return root;
	}

	public static int numNodeGreater(TreeNode<Integer> root, int x) {
		if (root == null) {
			return 0;
		}

		int count = 0;
		if (root.data > x) {
			count++;
		}

		for (int i = 0; i < root.children.size(); i++) {
			count += numNodeGreater(root.children.get(i), x);
		}

		return count;
		// Write your code here

	}
	public static void Print(TreeNode<Integer> root) {
		QueueUsingLL<TreeNode<Integer>> pendingNode = new QueueUsingLL<>();
		
		pendingNode.enqueue(root);
		pendingNode.enqueue(null);
		while(!pendingNode.isEmpty()) {
			try {
				TreeNode<Integer> frontNode=pendingNode.dequeue();
				if(frontNode!=null) {
					System.out.print(frontNode.data+" ");
					for(int i=0;i<frontNode.children.size();i++) {
						pendingNode.enqueue(frontNode.children.get(i));
					}
			}else {
				System.out.println();
				if(!pendingNode.isEmpty()) {
					pendingNode.enqueue(null);
				}
			}
			}catch (QueueEmptyException e) {}
			
		} 
	}

	public static void main(String[] args) {
		int x = s.nextInt();
		TreeNode<Integer> root = takeInputLevelWise();
		Print(root);
		System.out.println(numNodeGreater(root, x));

	}

}
