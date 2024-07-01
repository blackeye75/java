//Problem statement
//Given a generic tree, count and return the number of leaf nodes present in the given tree. A node is said to be a leaf node if it's not having any child
//
//
//Leaf nodes in the given tree are 40, 50, 30, 40. So the answer for this is 4.
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input 1 :
//10 3 20 30 40 2 40 50 0 0 0 0 
//Sample Output 1 :
//4

package Assignment;

import java.util.Scanner;


public class CountLeafNode {
	
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
	
	public static int countLeafNode(TreeNode<Integer> root) {
		if(root==null) {
			return 0;
		}
		int count=0;
		if(root.children.size()==0){
			count++;
		}
		for(int i=0;i<root.children.size();i++) {
			int smallAns=countLeafNode(root.children.get(i));
			count=count+smallAns;
		}
		return count;
		
	}

	public static void main(String[] args) {
	  TreeNode<Integer> root=takeInputLevelWise();
	  Print(root);
	 System.out.println( countLeafNode(root));

	}

}
