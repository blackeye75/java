//Problem statement
//Given a generic tree and an integer x, check if x is present in the given tree or not. Return true if x is present, return false otherwise.
//
//Input format :
//
//Line 1 : Integer x
//
//Line 2 : Elements in level order form separated by space (as per done in class). Order is -
//
//Root_data, n (No_Of_Child_Of_Root), n children, and so on for every element
//
//Output format : true or false
//
//Sample Input 1 :
//40
//10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 1 :
//true
//Explanation
//Since, 40 is present in the given tree, so the answer will be true.
//Sample Input 2 :
//4
//10 3 20 30 40 2 40 50 0 0 0 0 
// Sample Output 2:
//false
//Explanation
//Since, 4 is not present in the given tree, so the answer is false.
 



package Assignment;

import java.util.Scanner;

public class Check_If_Tree_contain_x {
	
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
	public static boolean checkIfContainX(TreeNode<Integer> root,int x) {
		if(root==null) {
			return false;
		}
		if(root.data.equals(x)) {
			return true;
		}
		for(TreeNode<Integer> child:root.children) {
			if(checkIfContainX(child, x)) {
				return  true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		TreeNode<Integer> root=takeInputLevelWise();
	    Print(root);
	    System.out.println(checkIfContainX(root, 10));
	}

}
