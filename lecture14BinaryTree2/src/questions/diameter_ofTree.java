//Problem statement
//For a given Binary of type integer, find and return the ‘Diameter’.
//
//Diameter of a Tree
//The diameter of a tree can be defined as the maximum distance between two leaf nodes.
//Here, the distance is measured in terms of the total number of nodes present along the path of the two leaf nodes, including both the leaves.
//Example:
//alt txt
//
//The maximum distance can be seen between the leaf nodes 8 and 9. 
//The distance is 9 as there are a total of nine nodes along the longest path from 8 to 9(inclusive of both). Hence the diameter according to the definition will be 9.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= N <= 10^5
//Where N is the total number of nodes in the binary tree.
//
//Time Limit: 1 sec
//Sample Input 1:
//2 4 5 6 -1 -1 7 20 30 80 90 -1 -1 8 -1 -1 9 -1 -1 -1 -1 -1 -1 
//Sample Output 1:
//9
//Sample Input 2:
//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
//Sample Output 2:
//5

package questions;

import java.util.Scanner;

public class diameter_ofTree {

	
	 public static int height(BinaryTreeNode<Integer> root){
	        if(root==null){
	            return 0;
	        }

	        int leftH=height(root.left);
	        int rightH=height(root.right);


	        return Math.max(leftH, rightH)+1;
	    }

		public static int diameterOfBinaryTree(BinaryTreeNode<Integer> root){
			//Your code goes here
		// 	  if (root==null)
	    //     {
	    //         return 0;
	    //     }
	    //     return findHeight(root.left)+findHeight(root.right)+1;

	         return height(root.left)+height(root.right)+1;
//
//	            if (root == null) {
//				return 0;
//			}
//			
//			int option1 = height(root.left) + height(root.right);
//			int option2 = diameterOfBinaryTree(root.left);
//			int option3 = diameterOfBinaryTree(root.right);
//			return Math.max(option1, Math.max(option2, option3))+1;
		}
		// public static int findHeight(BinaryTreeNode<Integer> root)
	    // {
	    //     if (root==null)
	    //     {
	    //         return 0;
	    //     }
	    //     int leftHeight=findHeight(root.left);
	    //     int rightHeight=findHeight(root.right);
	        
	    //     if(leftHeight>rightHeight)
	    //     {
	    //         return leftHeight+1;
	    //     }
	    //     else
	    //     {
	    //         return rightHeight+1;
	    //     }
		// }
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
			BinaryTreeNode<Integer> root= takeInputLevelWise();
			printTree(root);
			System.out.println(diameterOfBinaryTree(root));
		}
		
		
}
