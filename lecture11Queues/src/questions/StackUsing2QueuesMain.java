package questions;

import java.util.Scanner;

public class StackUsing2QueuesMain {


	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		StackUsing2queues stack = new StackUsing2queues();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch (choice) {
			case 1:
				input = s.nextInt();
				stack.push(input);
				break;

			case 2:
				System.out.println(stack.pop());
				break;

			case 3:
				System.out.println(stack.top());
				break;

			case 4:
				System.out.println(stack.getSize());
				break;

			default:
				System.out.println((stack.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}
