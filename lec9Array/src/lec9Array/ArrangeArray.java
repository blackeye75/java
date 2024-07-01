//Arrange Numbers in Array
//Send Feedback
//You have been given an empty array(ARR) and its size N. The only input taken from the user will be N and you need not worry about the array.
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
//Note:
//You need not print the array. You only need to populate it.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first and the only line of each test case or query contains an integer 'N'.
//Output Format :
//For each test case, print the elements of the array/list separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^4
//
//Time Limit: 1sec
//Sample Input 1 :
//1
//6
//Sample Output 1 :
//1 3 5 6 4 2
//Explanation of Sample Input 1 :
//Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
//Sample Input 2 :
//2
//9
//3
//Sample Output 2 :
//1 3 5 7 9 8 6 4 2
//1 3 2
//Your task is to populate the array using the integer values in the range 1 to N(both inclusive) in the order - 1,3,5,.......,6,4,2.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//The first and the only line of each test case or query contains an integer 'N'.
//Output Format :
//For each test case, print the elements of the array/list separated by a single space.
//
//Output for every test case will be printed in a separate line.

//Sample Input 1 :
//1
//6
//Sample Output 1 :
//1 3 5 6 4 2
//Explanation of Sample Input 1 :
//Since the value of N is 6, the number will be stored in the array in such a fashion that 1 will appear at 0th index, then 2 at the last index, in a similar fashion 3 is stored at index 1. Hence the array becomes 1 3 5 6 4 2.
//Sample Input 2 :
//2
//9
//3
//Sample Output 2 :
//1 3 5 7 9 8 6 4 2
//1 3 2

package lec9Array;

import java.util.Scanner;

public class ArrangeArray {
	public static void arrangeArray(int arr[], int n) {
		int val = 1, nVal = 0;
		if (n != 0) {
			if (n % 2 == 0)
				nVal = n;
			if (n % 2 != 0)
				nVal = n - 1;
			for (int i = 0; i <= (n - 1) / 2; i++) {
				arr[i] = val;
				val += 2;

			}
			for (int i = (((n - 1) / 2) + 1); i < n; i++) {
				arr[i] = nVal;
				nVal -= 2;

			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while (t > 0) {
			int n = s.nextInt();
			int arr[] = new int[n];
			arrangeArray(arr, n);
			for (int i = 0; i < n; i++) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
			t--;
		}

	}

}
