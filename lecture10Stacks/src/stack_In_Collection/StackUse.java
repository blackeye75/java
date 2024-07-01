package stack_In_Collection;

import java.util.Stack;

public class StackUse {

	public static void main(String[] args) {
	Stack<Integer> stack = new Stack<Integer>();
	int arr[]= {5,2,8,1};
	for(int i=0;i<arr.length;i++) {
		stack.push(arr[i]);
	}
	System.out.println(stack.size());
	
	while(!stack.isEmpty()) {
		System.out.print(stack.peek()+" ");
		stack.pop();
	}

	}

}
