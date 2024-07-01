//Number of Digits
//Send Feedback
//You are given a number 'n'.
//
//
//Return number of digits in ‘n’.
//
//
//Example:
//Input: 'n' = 123
//
//Output: 3
//
//Explanation:
//The 3 digits in ‘123’ are 1, 2 and 3. 
//
//
//Input format:
//The first line of input contains an integer ‘n’.
//
//
//Output Format:
//Return an integer as described in the problem statement. 
//
//
//Note
//You don’t need to print anything, it has already been taken care of, just complete the given function.
//Sample Input 1:
//121
//
//
//Sample Output 1:
//3
//
//
//Explanation of sample output 1:
//There are 3 digits in 121 are 1,2 and 1.
//
//Sample Input 2:
//38
//
//
//Sample Output 2:
//2
//
//
//Expected time complexity :
//The expected time complexity is O(log n).
//
//
//Constraints:
//1 <= ‘n’ <= 10^9

package question;

import java.io.*;
import java.util.*;

public class NumberOfDigits {
	public static int countDigits(int n) {
		if (n < 10) {
			return 1;
		}
		// Recursive case: Divide n by 10 and make a recursive call.
		return 1 + countDigits(n / 10);
	}

//	public static class FastReader {
//
//		BufferedReader br;
//		StringTokenizer root;
//
//		public FastReader() {
//			br = new BufferedReader(new InputStreamReader(System.in));
//		}
//
//		String next() {
//			while (root == null || !root.hasMoreTokens()) {
//				try {
//					root = new StringTokenizer(br.readLine());
//				} catch (Exception r) {
//					r.printStackTrace();
//				}
//			}
//			return root.nextToken();
//		}
//
//		String nextL() throws IOException {
//			return br.readLine();
//		}
//
//		int nextInt() {
//			return Integer.parseInt(next());
//		}
//
//		long nextLong() {
//			return Long.parseLong(next());
//		}
//	}
//
//	public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
//	public static FastReader sc = new FastReader();
//
//	private static int t;
//	private static int[] n;
//
//	private static void takeInput() throws IOException {
//		t = 1;
//		n = new int[t];
//		for (int i = 0; i < t; ++i) {
//			n[i] = sc.nextInt();
//		}
//	}
//
//	private static void execute() {
//		for (int i = 0; i < t; ++i) {
//			countDigits(n[i]);
//		}
//	}
//
//	private static void executeAndPrintOutput() {
//		for (int i = 0; i < t; ++i) {
//			int ans = countDigits(n[i]);
//			System.out.println(ans);
//		}
//	}
//
//	public static void main(String[] args) throws IOException {
//		takeInput();
//		executeAndPrintOutput();
//	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		System.out.println(countDigits(n));
	}
}
