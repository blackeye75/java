//Binary Search
//Send Feedback
//You are given an integer array 'A' of size 'N', sorted in non-decreasing order. You are also given an integer 'target'.
//Your task is to write a function to search for 'target' in the array 'A'. If it exists, return its index in 0-based indexing. If 'target' is not present in the array 'A', return -1.
//Note:
//You must write an algorithm whose time complexity is
//O(LogN)
//Example:
//Input: 'N' = 7 'target' = 3
//'A' = [1, 3, 7, 9, 11, 12, 45]
//Output: 1
//Explanation: A = [1, 3, 7, 9, 11, 12, 45],
//The index of element '3' is 1.
//Hence, the answer is '1'.
//Input format:
//The first line contains an Integer 'N', which denotes
//the size of the array/list.
//The second line contains 'N' single space-separated
//integers representing the elements in the array/list.
//The third line contains the value of 'target' to be
//searched for in the array/list.
//Output Format :
//Return the index at which 'target' is present for each
//test case, -1 otherwise.

package question;

import java.util.Scanner;

public class BinarySearch {
	public static int search(int []nums, int target) {
	      return search(nums, target, 0, nums.length-1);
	    }
	    public static int search(int[] nums,int target,int si,int ei){
	        //   int si=0;
	        // int ei=nums.length-1;
	         if(si>ei){
		            return -1;
		        }
		        int midIndex=(si+ei)/2;
		        if(nums[midIndex]==target){
		            return midIndex;
		        }else if(nums[midIndex]<target){
		            return search(nums,target,midIndex+1,ei);
		        }else{
		            return search(nums,target,si,midIndex-1);
		        }
	    }
	public static void main(String[] args) {
		  Scanner s = new Scanner(System.in);
	        int n = s.nextInt();
	        int arr[] = new int[n];

	        for (int i = 0; i < n; i++) {
	            arr[i] = s.nextInt();
	        }

	        int x = s.nextInt();
	        int result = search(arr, x);
	        System.out.print(result);

	}

}
