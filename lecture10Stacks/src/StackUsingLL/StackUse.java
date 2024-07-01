package StackUsingLL;
public class StackUse {

	public static void main(String[] args)  {
		
		StackUsingLL<Integer> stack = new StackUsingLL<>();
		
//		StackUsingArray stack = new StackUsingArray(3);
		for(int i = 1; i <= 5; i++){
			stack.push(i);
		}
		
		while(!stack.isEmpty()){
			try {
				System.out.println(stack.pop());
			} catch (StackEmptyException e) {
				// Never reach here
			}
		}

	}

}