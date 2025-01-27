package Questions;

public class CheckBST {
	
	 // public static boolean isBST(BinaryTreeNode<Integer> root) {


    //         if(root==null)
    //          return true;
    //         if(root.left!=null && root.right!=null){
    //             if(root.data>root.left.data && root.data<=root.right.data)
    //                 return true;
    //             if(root.data<=root.left.data && root.data>root.right.data)
    //           return false;
    //     }
    //         boolean ans1=isBST(root.left);
    //         boolean ans2=isBST(root.right);
    //         return (ans1&& ans2);
    //     }
    // }



    // true methods--------------------
    //         if(root==null)
    //             return true;
    //         int max=maximum(root.left);
    //         int min=minimum(root.right);
    //         if(root.data<=max || root.data>min)
    //             return false;

    //         boolean ans1=isBST(root.left);
    //         boolean ans2=isBST(root.right);
    //         return(ans1&& ans2);

    //     }
    //     public static int maximum(BinaryTreeNode<Integer> root)
    //     {
    //         if(root==null)
    //             return Integer.MIN_VALUE;
    //         return Math.max(root.data,Math.max(maximum(root.left),maximum(root.right)));


    //         }
    //     public static int minimum(BinaryTreeNode<Integer> root)
    //     {
    //         if(root==null)
    //             return Integer.MAX_VALUE;
    //         return Math.min(root.data,Math.min(minimum(root.left),minimum(root.right)));
    //     }

    // }







    // -----------with less time comp..---------------------
     public static boolean isBST(BinaryTreeNode<Integer> root) {
         Pair<Boolean,Pair<Integer,Integer>> output=isBST2(root);
         return output.first;
     }
    
    public static Pair<Boolean,Pair<Integer,Integer>> isBST2(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {   Pair<Integer,Integer> output1=new Pair<>(Integer.MIN_VALUE,Integer.MAX_VALUE);
         Pair<Boolean,Pair<Integer,Integer>> output=new Pair<>(true,output1);
         return output;
        }
        Pair<Boolean,Pair<Integer,Integer>> leftOut=isBST2(root.left);
        Pair<Boolean,Pair<Integer,Integer>> rightOut=isBST2(root.right);
        int minimum=Math.min(root.data,Math.min(leftOut.second.second,rightOut.second.second));
        int maximum=Math.max(root.data,Math.max(leftOut.second.first,rightOut.second.first));
        boolean isBSTT=root.data>leftOut.second.first
            && root.data<=rightOut.second.second
            && leftOut.first
            && rightOut.first;
        Pair<Integer,Integer> output1=new Pair<>(maximum,minimum);
        Pair<Boolean,Pair<Integer,Integer>> output=new Pair<>(isBSTT,output1);
        return output;



    }
}
class Pair<T,U> {
  public  T first;
   public U second;
    public Pair(T first,U second)
    {        
        this.first=first;
        this.second=second;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
