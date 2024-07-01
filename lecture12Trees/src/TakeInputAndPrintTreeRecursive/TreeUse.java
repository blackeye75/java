package TakeInputAndPrintTreeRecursive;

import java.util.Scanner;

public class TreeUse {
	static Scanner s = new Scanner(System.in);

	public static TreeNode<Integer> takeInput() {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter no of children for " + n);
		int childCount = s.nextInt();

		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput();
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

	public static void main(String[] args) {
		TreeNode<Integer> root = takeInput();
		print(root);
	}

}
