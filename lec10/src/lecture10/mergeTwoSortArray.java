//Code Merge Two Sorted Arrays
//Send Feedback
//You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively, merge them into a third array/list such that the third array is also sorted.
//Note:
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the first array/list.
//
//Second line contains 'N' single space separated integers representing the elements of the first array/list.
//
//Third line contains an integer 'M' representing the size of the second array/list.
//
//Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
//Output Format :
//For each test case, print the sorted array/list(of size N + M) in a single row, separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//0 <= M <= 10^5
//Time Limit: 1 sec 
//Note:
//Consider the case when size of the two arrays is not same.
//Sample Input 1 :
//1
//5
//1 3 4 7 11
//4
//2 4 6 13
//Sample Output 1 :
//1 2 3 4 4 6 7 11 13 
//Sample Input 2 :
//2
//3
//10 100 500
//7
//4 7 9 25 30 300 450
//4
//7 45 89 90
//0
//Sample Output 2 :
//4 7 9 10 25 30 100 300 450 500
//7 45 89 90

package lecture10;

import java.util.Scanner;

public class mergeTwoSortArray {
	public static int[] sort012(int[] arr1,int arr2[]) {
		int ans[]=new int[arr1.length+arr2.length];
		int i=0,j=0,k=0;
		while(i<arr1.length&&j<arr2.length) {
		if(arr1[i]<arr2[j]) {
			ans[k]=arr1[i];
			i++;
			k++;
		}else  {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		}
		while(i<arr1.length) {
			ans[k]=arr1[i];
			i++;
			k++;
		}while(j<arr2.length) {
			ans[k]=arr2[j];
			j++;
			k++;
		}
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int arr1[]=new int[n];
			for(int i=0;i<n;i++) {
				arr1[i]=s.nextInt();
			}
			int m=s.nextInt();
			int arr2[]=new int[m];
			for(int i=0;i<m;i++) {
				arr2[i]=s.nextInt();
			}
			int ans[]=new int[n+m];
			
			ans=sort012(arr1, arr2);
			for(int i=0;i<m+n;i++) {
				System.out.print(ans[i]+" ");
			}
			
			
			System.out.println();
			
			t--;
		}

	}

}
