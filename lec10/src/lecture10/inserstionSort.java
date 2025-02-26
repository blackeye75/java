//Code Insertion Sort
//Send Feedback
//You are given an integer array 'arr' of size 'N'.
//
//
//You must sort this array using 'Insertion Sort' recursively.
//
//
// Note:
//Change in the input array itself. You don't need to return or print the elements.
//Example:
//Input: ‘N’ = 7
//'arr' = [2, 13, 4, 1, 3, 6, 28]
//
//Output: [1 2 3 4 6 13 28]
//
//Explanation: After applying insertion sort on the input array, the output is [1 2 3 4 6 13 28].
// Input format :
//The first line contains an integer 'N' representing the size of the array.
//
//The second line contains 'N' single space-separated integers representing the elements of the array.
//Output Format :
//Print the array elements in sorted order, separated by a single space.
//Sample Input 1:
//5
//9 3 6 2 0
//Sample Output 1:
//0 2 3 6 9
//Sample Input 2:
//4
//4 3 2 1
//Sample Output 2:
//1 2 3 4 
//Constraints :
//0 <= N <= 10^3
//0 <= arr[i] <= 10^5
//Time Limit: 1 sec

package lecture10;

import java.util.Scanner;

public class inserstionSort {
	public static void InserstionSort(int arr[]) {
		for (int i = 1; i < arr.length; i++) {
			int j = i - 1;
			int temp = arr[i];
			for (; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = s.nextInt();
		}
		InserstionSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
