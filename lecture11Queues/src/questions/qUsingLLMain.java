package questions;

import java.util.Scanner;

public class qUsingLLMain {
	
	private static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		QueueUsingLL queue = new QueueUsingLL();

		int q = s.nextInt();

		while (q > 0) {
			int choice, input;
			choice = s.nextInt();

			switch(choice) {
				case 1:
					input = s.nextInt();
					queue.enqueue(input);
					break;

				case 2:
					System.out.println(queue.dequeue());
					break;

				case 3:
					System.out.println(queue.front());
					break;

				case 4:
					System.out.println(queue.getSize());
					break; 

				default: 
					System.out.println((queue.isEmpty()) ? "true" : "false");
			}

			q -= 1;
		}

	}

}
