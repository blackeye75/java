package check_If_Tree_IsBalanced;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;




public class BinaryTreeUse{

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
    public static int numNodes(BinaryTreeNode<Integer> root){
        if(root==null) return 0;
        int leftNodeCount= numNodes(root.left);
        int rightNodeCount= numNodes(root.right);
        return 1+leftNodeCount+rightNodeCount;
    }
    public static int largest(BinaryTreeNode<Integer> root){
        if(root==null){
            return -1;
        }
        int largestLeft= largest(root.left);
        int largestRight= largest(root.right);
        return Math.max(root.data, Math.max(largestLeft, largestRight));
    }
    public static int numLeaves(BinaryTreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.left==null &&root.right==null){
            return 1;
        }
        return numLeaves(root.left)+numLeaves(root.right);
      }

    public static void printAtDepthK(BinaryTreeNode<Integer> root, int k){
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
            return;
        }

        printAtDepthK(root.left, k-1);
        printAtDepthK(root.right, k-1);
    }

    public static BinaryTreeNode<Integer> removeLeaves(BinaryTreeNode<Integer> root) {
      if(root==null) {
          return null;
          }
      if(root.left==null && root.right==null) {
          return null;
          }
      root.left = removeLeaves(root.left);
      root.right = removeLeaves(root.right);
      return root;
      }

      public static int height(BinaryTreeNode<Integer> root) {
        if(root==null) {
          return 0;
          }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        return 1+ Math.max(leftHeight, rightHeight);
      }

      //bad time complexity Worst case:- O(n2), avg case:- O(nlogn)
      public static boolean isBalanced(BinaryTreeNode<Integer> root) {
          if(root==null) {
              return true;
            }
          int leftHeight=height(root.left);
          int rightHeight=height(root.right);
          if(Math.abs(leftHeight - rightHeight) >1){
              return false;
              }
          boolean isLeftBalanced = isBalanced(root.left);
          boolean isRightBalanced = isBalanced(root.right);
          return isLeftBalanced && isRightBalanced ;
          }


    public static void main(String[] args){
//        BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(1);
//
//        BinaryTreeNode<Integer> rootLeft = new BinaryTreeNode<Integer>(2);
//        BinaryTreeNode<Integer> rootRight = new BinaryTreeNode<Integer>(3);
//        root.left = rootLeft;
//        root.right= rootRight;
//
//
//        BinaryTreeNode<Integer> twoRight = new BinaryTreeNode<Integer>(4);
//        BinaryTreeNode<Integer> threeLeft = new BinaryTreeNode<Integer>(5);
//
//        rootLeft.right= twoRight;
//        rootRight.left= threeLeft;
//
        BinaryTreeNode<Integer> root = takeInputLevelWise();
        printLevelWise(root);
        System.out.println("Num nodes "+numNodes(root));
        System.out.println("Largest is " + largest(root));
        printAtDepthK(root,2);
//        BinaryTreeNode<Integer> newRoot= removeLeaves(root);
//        printTreeDetailed(newRoot);
        System.out.println(isBalanced(root));

    }
}
