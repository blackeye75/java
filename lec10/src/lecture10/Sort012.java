//
//
//Sort 0 1 2
//Send Feedback
//You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s. Write a solution to sort this array/list in a 'single scan'.
//'Single Scan' refers to iterating over the array/list just once or to put it in other words, you will be visiting each element in the array/list just once.
//Note:
//You need to change in the given array/list itself. Hence, no need to return or print anything. 
//Input format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains an integer 'N' representing the size of the array/list.
//
//Second line contains 'N' single space separated integers(all 0s, 1s and 2s) representing the elements in the array/list.
//Output Format :
//For each test case, print the sorted array/list elements in a row separated by a single space.
//
//Output for every test case will be printed in a separate line.
//Constraints :
//1 <= t <= 10^2
//0 <= N <= 10^5
//Time Limit: 1 sec
//Sample Input 1:
//1
//7
//0 1 2 0 2 0 1
//Sample Output 1:
//0 0 0 1 1 2 2 
//Sample Input 2:
//2
//5
//2 2 0 1 1
//7
//0 1 2 0 1 2 0
//Sample Output 2:
//0 1 1 2 2 
//0 0 0 1 1 2 2
package lecture10;

import java.util.Scanner;

public class Sort012 {
//	public static void sort012(int [] arr) {
//		int nextZero=0;
//		int nextTwo=arr.length-1;
//		int i=0;
//		while(i<=nextTwo) {
//			if(arr[i]==0) {
//				int temp=arr[nextZero];
//				arr[nextZero]=arr[i];
//				arr[i]=temp;
//				i++;
//				nextZero++;
//			}else if(arr[i]==2) {
//				int temp=arr[nextTwo];
//				arr[nextTwo]=arr[i];
//				arr[i]=temp;
//				nextTwo--;
//				//i++;
//			}else {
//				i++;
//			}
//		}
//	}
//	variation
	
	public static void sort012(int[] arr) {
        int countzero = 0;
        int countone = 0;
        int counttwo = 0;
        int n = arr.length;
        int i = 0;
        while (i < n) {
            if (arr[i] == 0) {
                countzero = countzero + 1;
            }
            if (arr[i] == 1) {
                countone = countone + 1;
            }
            if (arr[i] == 2) {
                counttwo = counttwo + 1;
            }
            i = i + 1;
        }
        i = 0;
        while (i < countzero) {
            arr[i] = 0;
            i = i + 1;
        }
        while (i < countone + countzero) {
            arr[i] = 1;
            i = i + 1;
        }
        while (i < counttwo + countone + countzero) {
            arr[i] = 2;
            i = i + 1;
        }
    }

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			int n=s.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++) {
				arr[i]=s.nextInt();
			}
	
			sort012(arr);
			for(int i=0;i<n;i++) {
				System.out.print(arr[i]+ " ");
			}
			System.out.println();
			t--;
		}

	}

}
