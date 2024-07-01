//Problem statement
//For a given Binary Tree of type integer, print all the nodes without any siblings.
//
//Example Input :
//1 4 5 6 -1 -1 7 20 30 80 90 -1 -1 -1 -1 -1 -1 -1 -1
//Explanation:
//The input tree when represented in a two-dimensional plane, it would look like this:     
//alt txt
//
//In respect to the root, node data in the left subtree that satisfy the condition of not having a sibling would be 6, taken in a top-down sequence. Similarly, for the right subtree, 7 is the node data without any sibling.
//
//Since we print the siblings in the left-subtree first and then the siblings from the right subtree, taken in a top-down fashion, we print 6 7.
//Example Output:
//6 7  
//Detailed explanation ( Input/output format, Notes, Images )
// Constraints:
//1 <= N <= 10^5
//Where N is the total number of nodes in the binary tree.
//
//Time Limit: 1 second
//Sample Input 1:
//5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
//Sample Output 1:
//9    

package assignment;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NodesWithoutSibling {
	
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
	
	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		//Your code goes here
		 if (root==null)
        {
            return; 
        }
        
        if (root.left==null && root.right==null)
        {
            return;
        }
        
        if (root.left==null)
        {
            System.out.print(root.right.data+" ");
            printNodesWithoutSibling(root.right);
        }
        else if (root.right==null)
        {
            System.out.print(root.left.data+" ");
            printNodesWithoutSibling(root.left);
            
        }
        else
        {
            printNodesWithoutSibling(root.left);
            printNodesWithoutSibling(root.right);
        }
	}

	public static void main(String[] args) {
		BinaryTreeNode<Integer> root =takeInputLevelWise();
		printLevelWise(root);
		printNodesWithoutSibling(root);

	}

}
