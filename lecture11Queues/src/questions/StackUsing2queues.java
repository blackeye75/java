//Problem statement
//Implement a Stack Data Structure specifically to store integer data using two Queues. You have to implement it in such a way that the push operation is done in O(1) time and the pop and top operations are done in O(N) time.
//
//There should be two data members, both being Queues to store the data internally. You may use the inbuilt Queue.
//
//Implement the following public functions :
//
//1. Constructor:
//It initialises the data members as required.
//
//2. push(data) :
//This function should take one argument of type integer. It pushes the element into the stack and returns nothing.
//
//3. pop() :
//It pops the element from the top of the stack and in turn, returns the element being popped or deleted. In case the stack is empty, it returns -1.
//
//4. top :
//It returns the element being kept at the top of the stack. In case the stack is empty, it returns -1.
//
//5. size() :
//It returns the size of the stack at any given instance of time.
//
//6. isEmpty() :
//It returns a boolean value indicating whether the stack is empty or not.
//
//Operations Performed on the Stack:
//Query-1(Denoted by an integer 1): Pushes an integer data to the stack.
//
//Query-2(Denoted by an integer 2): Pops the data kept at the top of the stack and returns it to the caller.
//
//Query-3(Denoted by an integer 3): Fetches and returns the data being kept at the top of the stack but doesn't remove it, unlike the pop function.
//
//Query-4(Denoted by an integer 4): Returns the current size of the stack.
//
//Query-5(Denoted by an integer 5): Returns a boolean value denoting whether the stack is empty or not.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= q <= 100
//1 <= x <= 5
//-2^31 <= data <= 2^31 - 1 and data != -1
//
//Where 'q' is the total number of queries being performed on the stack, 'x' is the range for every query and data represents the integer pushed into the stack. 
//
//Time Limit: 1 second
//Sample Input 1:
//6
//1 13
//1 47
//4
//5
//2
//3
//Sample Output 1:
//2
//false
//47
//13
//
//Explanation: The operations are as follows:
//Push 13 into the stack.
//Push 47 into the stack.
//Print the size of the stack. Since we have pushed two elements, the size is 2.
//Check if the stack is empty. Since there are elements in the stack, it returns false.
//Pop the top element from the stack. The top element is 47, so it is removed and returned.
//Fetch and return the top element of the stack. Now, the top element is 13, so 13 is returned.
//So, the output for this test case is 2 false 47 13.
//Sample Input 2:
//4
//5
//2
//1 10
//5
// Sample Output 2:
//true
//-1
//false
//
//Explanation: The operations are as follows:
//Check if the stack is empty. Since no elements have been pushed yet, it returns true.
//Try to pop the top element from the stack. Since the stack is empty, it returns -1.
//Push 10 into the stack.
//Check if the stack is empty. Since there is one element in the stack, it returns false.
//So, the output for this test case is true -1 false.

package questions;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsing2queues {
	private Queue<Integer> queue1;
	private Queue<Integer> queue2;
	private int size;

	public StackUsing2queues() {
		// Implement the Constructor
		queue1 = new LinkedList<Integer>();
		queue2 = new LinkedList<Integer>();
		size = 0;
	}

	public int getSize() {
		// Implement the getSize() function
		return size;

	}

	public boolean isEmpty() {
		// Implement the isEmpty() function
		return size == 0;

	}

	public void push(int element) {
		// Implement the push(element) function
		queue1.add(element);
		size = size + 1;
	}

	public int pop() {
		// Implement the pop() function
		if (queue1.isEmpty()) {
			return -1;
		}
		while (queue1.size() != 1) {
			queue2.add(queue1.remove());
		}
		int top = queue1.remove();

		while (!queue2.isEmpty()) {
			queue1.add(queue2.remove());
		}
		size = size - 1;
		return top;
	}

	public int top() {
		// Implement the top() function
		if (queue1.isEmpty()) {
			return -1;
		}
		while (queue1.size() != 1) {
			queue2.add(queue1.remove());
		}
		int top = queue1.peek();
		queue2.add(queue1.remove());

		Queue<Integer> q = queue1;
		queue1 = queue2;
		queue2 = q;
		return top;
	}

}
