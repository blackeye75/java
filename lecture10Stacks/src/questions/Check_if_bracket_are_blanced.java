//Problem statement
//For a given a string expression containing only round brackets or parentheses, check if they are balanced or not. Brackets are said to be balanced if the bracket which opens last, closes first.
//
//
//
//Example:
//Expression: (()())
//Since all the opening brackets have their corresponding closing brackets, we say it is balanced and hence the output will be, 'true'.
//You need to return a boolean value indicating whether the expression is balanced or not.
//
//Note:
//The input expression will not contain spaces in between.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= N <= 10^7
// Where N is the length of the expression.
//
//Time Limit: 1sec
//Sample Input 1 :
//(()()())
//Sample Output 1 :
//true
//Sample Input 2 :
//()()(()
//Sample Output 2 :
//false
//Explanation to Sample Input 2:
//The initial two pairs of brackets are balanced. But when you see, the opening bracket at the fourth index doesn't have its corresponding closing bracket which makes it imbalanced and in turn, making the whole expression imbalanced. Hence the output prints 'false'.

package questions;

import java.util.Scanner;
import java.util.Stack;

public class Check_if_bracket_are_blanced {

//	public static boolean isBalanced(String Expression) {
//		Stack<Character> stack = new Stack<Character>();
//		for (int j = 0; j < Expression.length(); j++) {
//			char i = Expression.charAt(j);
//			if (i == '(' || i == '{' || i == '[') {
//				stack.push(i);
//			} else if (i == ')' || i == '}' || i == ']') {
//				if (stack.isEmpty()) {
//					return false;
//				} else {
//					if (i == ')') {
//						if (stack.peek() != '(') {
//							return false;
//						} else {
//							stack.pop();
//						}
//					} else if (i == '}') {
//						if (stack.peek() != '{') {
//							return false;
//						} else {
//							stack.pop();
//						}
//					} else if (i == ']') {
//						if (stack.peek() != '[') {
//							return false;
//						} else {
//							stack.pop();
//						}
//					}
//				}
//			}
//
//		}
//		return stack.isEmpty();
//	}

	public static boolean isBalanced(String Expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < Expression.length(); i++) {
			if (Expression.charAt(i) == '(') {
				stack.push(Expression.charAt(i));
			} else if (Expression.charAt(i) == ')') {
				if (stack.isEmpty()) {
					return false;
				}
				char topChar = stack.pop();
				if (Expression.charAt(i) == ')' && topChar == '(') {
					continue;
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		Scanner sr = new Scanner(System.in);
		String expression = sr.next();
		System.out.println(isBalanced(expression));

	}

}
