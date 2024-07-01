//Problem statement
//Ninja was playing with her sister to solve a puzzle pattern. However, even after taking several hours, they could not solve the problem.
//
//A value of N is given to them, and they are asked to solve the problem. Since they are stuck for a while, they ask you to solve the problem. Can you help solve this problem?
//
//Example : Pattern for N = 4
//
//****
// ***     
//  **
//   *
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//1 <= T <= 50
//1 <= N <= 300
//
//Time Limit: 1 sec
//Sample Input 1:
//2
//3
//2
//Sample Output 1:
//***
// **     
//  *
//
//**
// *     
//Explanation for Sample Input 1:
// In the first test case, the value of ‘N’ is 3, so three rows are to be printed from 1 to 3 where each row starts from 3, which goes on till 1. Hence the answer is [“***”,”**”,”*”].
//
// In the second test case, the value of ‘N’ is 2, so the two rows are to be printed from 1 to 3 where each row starts from 3, which goes on till 1. Hence the answer is [“**”,”*”].
//Sample Input 2:
//
//2
//4
//5
//Sample Output 2:
//****
// ***     
//  **
//   *
//
//*****
// ****     
//  ***
//   **
//    *

package test;

import java.util.Scanner;

public class yet_another_pattern {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int n=s.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=(i-1);j++) {
//				System.out.print(" ");
//			}
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}

		Scanner sr = new Scanner(System.in);  
		int t = sr.nextInt();
		while (t > 0) {
			int n = sr.nextInt();
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (j >= i) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println();
			}
			t--;
		}
	}
}




                        
