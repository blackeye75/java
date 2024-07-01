package TakeInputLevelWiseAndPrintTrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeUse {

	public static TreeNode<Integer> takeInput(Scanner s) {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter no of children for " + n);
		int childCount = s.nextInt();

		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;

	}

	public static void print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}

	public static TreeNode<Integer> TakeInputLevelWise() {
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

	public static void printLevelWise(TreeNode<Integer> root) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Print output and don't return it. Taking
		 * input is handled automatically.
		 */
		if (root == null) {

			return;
		}

		// Standard level order traversal code
		// using queue
		// Queue<TreeNode<Integer> > pendingNodes = new LinkedList<>(); // Create a
		// queue
		// pendingNodes.add(root); // Enqueue root
		// while (!pendingNodes.isEmpty())
		// {
		// int n = pendingNodes.size();

		// // If this node has children
		// while (n > 0)
		// {
		// // Dequeue an item from queue
		// // and print it
		// TreeNode<Integer> p = pendingNodes.peek();
		// pendingNodes.remove();
		// System.out.print(p.data + " ");

		// // Enqueue all children of
		// // the dequeued item
		// for (int i = 0; i < p.children.size(); i++)
		// pendingNodes.add(p.children.get(i));
		// n--;
		// }

		// // Print new line between two levels
		// System.out.println();
		// }

		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		pendingNodes.add(null);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> fornt = pendingNodes.poll();
			if (fornt != null) {
				System.out.print(fornt.data + " ");
				for (int i = 0; i < fornt.children.size(); i++) {
					pendingNodes.add(fornt.children.get(i));
				}
			} else {
				System.out.println();
				if (!pendingNodes.isEmpty()) {
					pendingNodes.add(null);
				}
			}
		}

	}

	// using our queueUsingLl
	public static void printLvlWise2(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<TreeNode<Integer>>();
		TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(nullNode);
		System.out.println(root.data);
		while (pendingNodes.size() != 1) {
			TreeNode<Integer> temp = null;
			try {
				temp = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block

			}
			if(temp==nullNode) {
				pendingNodes.enqueue(nullNode);
				System.out.println();
				continue;
			}
			for(int i=0;i<temp.children.size();i++) {
				System.out.print(temp.children.get(i).data+" ");
				pendingNodes.enqueue(temp.children.get(i));
			}
		}

	}

	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		TreeNode<Integer> root=takeInput(s);
//		print(root);
		TreeNode<Integer> root = TakeInputLevelWise();
		printLvlWise2(root);

	}

}
