//roblem statement
//Given a sorted integer array A of size n, which contains all unique elements. You need to construct a balanced BST from this input array. Return the root of constructed BST.
//
//Note: If array size is even, take first mid as root.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//Time Limit: 1 second
//Sample Input 1:
//7
//1 2 3 4 5 6 7
//Sample Output 1:
//4 2 1 3 6 5 7 

package Questions;

public class ConstructBST_FormSortedArray {

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int n) {
		return SortedArrayToBST(arr, 0, arr.length - 1);
	}

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr, int si, int ei) {

		if (si > ei)
			return null;

		// if(arr.length==0)
		// return null;
		// if(arr.length==1)
		// {
		// BinaryTreeNode<Integer> root=new BinaryTreeNode<>(arr[0]);
		// return root;
		// }
		int mid = (ei + si) / 2;
		BinaryTreeNode<Integer> root = new BinaryTreeNode<>(arr[mid]);

		root.left = SortedArrayToBST(arr, si, mid - 1);
		root.right = SortedArrayToBST(arr, mid + 1, ei);
		return root;

	}

	public static BinaryTreeNode<Integer> SortedArrayToBST2(int[] arr, int n) {
		return SortedArrayToBSTHelper(arr, 0, n - 1);
	}

	private static BinaryTreeNode<Integer> SortedArrayToBSTHelper(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}
		int mid = start + (end - start) / 2;
		BinaryTreeNode<Integer> temp = new BinaryTreeNode<Integer>(arr[mid]);
		temp.left = SortedArrayToBSTHelper(arr, start, mid - 1);
		temp.right = SortedArrayToBSTHelper(arr, mid + 1, end);
		return temp;
	}

}
