//Problem statement
//Given a generic tree, count and return the sum of all nodes present in the given tree.
//
//
//
//For the above tree , total sum of all nodes is 10 + 30 + 50 + 25 + 5 + 45 + 56 + 34 = 225
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input :
//10 3 20 30 40 2 40 50 0 0 0 0 
//Sample Output :
//190
//Explananation
//For 10, 3 children are there : 20, 30, 40
//For 20. 2 children are there : 40, 50
//For 30, 40, 40, 50 no child is there , so the answer for this is 10+20+30+40+40+50 = 190
//

package quetions;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfAllNodes {

	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data");
		int rootdata = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> rootNode = new TreeNode<Integer>(rootdata);
		pendingNodes.enqueue(rootNode);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter no of children of " + frontNode.data);
				int numchildrens = s.nextInt();
				for (int i = 0; i < numchildrens; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int childData = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(childData);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// shouldn't come here
				return null;
			}
		}
		return rootNode;
	}

	public static int sumOfAllNodes(TreeNode<Integer> root) {
		int sum = root.data;
		for (int i = 0; i < root.children.size(); i++) {
			int smallSum = sumOfAllNodes(root.children.get(i));
			sum+=smallSum;
		}
		return sum;

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
		TreeNode<Integer> root = takeInputLevelWise();
		Print(root);
		
		System.out.println("Sum of All the nodes "+sumOfAllNodes(root));
		

	}

}
