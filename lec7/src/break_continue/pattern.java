package break_continue;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = 4;
		int i = 1;
		while (i <= n) {
			int j = 1;
			while (j <= n) {
				System.out.print(j + " ");
				j++;
				if (j>i) {
					break;
				}
			}
			System.out.println();
			i++;
		}

	}

}
