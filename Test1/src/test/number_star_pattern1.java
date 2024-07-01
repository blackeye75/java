//Problem statement
//Print the following pattern for given number of rows.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Sample Input :
//   5
//Sample Output :
// 5432*
// 543*1
// 54*21
// 5*321
// *4321
package test;

import java.util.Scanner;

public class number_star_pattern1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for (int i = 1; i <= n; i++) {
//			int start = n;
			for (int j = n; j >=1; j--) {
				if (j == i) {
					System.out.print("*");
				} else {
					System.out.print(j);
//					start--;
				}

			}
			System.out.println();
		}

	}
}


