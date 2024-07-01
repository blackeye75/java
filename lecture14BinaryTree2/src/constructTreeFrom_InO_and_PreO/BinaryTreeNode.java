package constructTreeFrom_InO_and_PreO;


public class BinaryTreeNode<T> {
	public BinaryTreeNode(T data) {
		this.data = data;
	}
	public T data;
	public BinaryTreeNode<T> left;
	public BinaryTreeNode<T> right;
}
