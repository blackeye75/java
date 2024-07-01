package lec7;

import java.util.Scanner;

public class SquareRootNearest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
//		int output=0;
//		while(output*output<=num) {
//			output+=1;
//		}
//		System.out.println(output-1);

		// git hub

		int i = 0;   //i=1;
		if (num == 0) {
			System.out.print(num);

		}
		while (i < num) {
			int sqrt = i * i;
			if (sqrt == num) {
				System.out.print(i);
				break;
			}
			if (sqrt > num) {
				System.out.print(i - 1);
				break;
			}
			i++;
		}

	}

}
