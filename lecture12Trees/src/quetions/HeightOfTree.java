package quetions;

import java.util.Scanner;

public class HeightOfTree {
	
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
	
	public static int getHeight(TreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		 if(root==null){
			 return 0;
		 }
		 int maxH=1;
		 for(int i=0;i<root.children.size();i++){
			 int small=1+getHeight(root.children.get(i));
			 if(maxH<small){
				 maxH=small;
			 }
		 }
		 return maxH;
	}

	public static void main(String[] args) {
		TreeNode<Integer> root=takeInputLevelWise();
		Print(root);
		System.out.println(getHeight(root));

	}

}
