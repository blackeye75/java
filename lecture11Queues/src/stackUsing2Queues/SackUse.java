package stackUsing2Queues;

public class SackUse {

	public static void main(String[] args) {
		StackUsingQueues stack= new StackUsingQueues();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		stack.push(500);
		System.out.println(stack.size);
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
		
		for(int i=0;!stack.isEmpty();i++) {
			System.out.print(stack.pop()+" ");
		}

	}

}
