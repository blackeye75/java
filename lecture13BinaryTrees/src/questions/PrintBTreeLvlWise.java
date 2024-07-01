//Problem statement
//For a given a Binary Tree of type integer, print the complete information of every node, when traversed in a level-order fashion.
//
//To print the information of a node with data D, you need to follow the exact format :
//
//           D:L:X,R:Y
//
//Where D is the data of a node present in the binary tree. 
//X and Y are the values of the left(L) and right(R) child of the node.
//Print -1 if the child doesn't exist.
//Example:
//alt text
//
//For the above depicted Binary Tree, the level order travel will be printed as followed:
//
//1:L:2,R:3
//2:L:4,R:-1
//3:L:5,R:6
//4:L:-1,R:7
//5:L:-1,R:-1    
//6:L:-1,R:-1
//7:L:-1,R:-1
//
//Note: There is no space in between while printing the information for each node.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= N <= 10^5
//Where N is the total number of nodes in the binary tree.
//
//Time Limit: 1 sec
//Sample Input 1:
//8 3 10 1 6 -1 14 -1 -1 4 7 13 -1 -1 -1 -1 -1 -1 -1
// Sample Output 1:
//8:L:3,R:10
//3:L:1,R:6
//10:L:-1,R:14
//1:L:-1,R:-1
//6:L:4,R:7
//14:L:13,R:-1
//4:L:-1,R:-1
//7:L:-1,R:-1
//13:L:-1,R:-1
//Sample Input 2:
//1 2 3 4 5 6 7 -1 -1 -1 -1 -1 -1 -1 -1
// Sample Output 2:
//1:L:2,R:3
//2:L:4,R:5
//3:L:6,R:7
//4:L:-1,R:-1
//5:L:-1,R:-1
//6:L:-1,R:-1
//7:L:-1,R:-1

package questions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PrintBTreeLvlWise {
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
		BinaryTreeNode<Integer> root= takeInputLevelWise();
		printLevelWise(root);
	}
}
