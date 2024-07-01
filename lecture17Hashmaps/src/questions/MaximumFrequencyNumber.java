//Problem statement
//You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
//
//If two or more elements are having the maximum frequency, return the element which occurs in the array first.
//
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints:
//0 <= N <= 10^8
//Time Limit: 1 sec
//Sample Input 1 :
//13
//2 12 2 11 12 2 1 2 2 11 12 2 6 
//Sample Output 1 :
//2
//Sample Input 2 :
//6
//7 2 2 4 8 4
//Sample Output 2 :
//2
//Explanation:
//Here, both element '2' and element '4' have same frequency but '2' ocurr first in orignal array that's why we are returning '2' as output. 

package questions;

import java.util.HashMap;

public class MaximumFrequencyNumber {

	public static int maxFrequencyNumber(int[] arr) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
//		HashMap<Integer, Integer> countMap = new HashMap<>();
//
//		for (int i = 0; i < arr.length; i++) {
//			int ele = arr[i];
//			if (countMap.containsKey(ele)) {
//				countMap.put(ele, countMap.get(ele) + 1);
//			} else {
//				countMap.put(ele, 1);
//			}
//
//		}
//
//		int maxCount = Integer.MIN_VALUE, maxEle = arr[0];
//		for (int i = 0; i < arr.length; i++) {
//			if (countMap.get(arr[i]) > maxCount) {
//				maxCount = countMap.get(arr[i]);
//				maxEle = arr[i];
//			}
//		}
//		return maxEle;
//	}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i : arr) {
			if (map.containsKey(i)) {
				map.put(i, map.get(i) + 1);
			} else {
				map.put(i, 1);
			}
		}
		int maxCount=Integer.MIN_VALUE,maxElement=arr[0];
		for(int i:arr) {
			if(map.get(i)>maxCount) {
				maxCount=map.get(i);
				maxElement=i;
			}
		}
		return maxElement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3, 4, 3, 4, 4, 4, 2 };
		System.out.println(maxFrequencyNumber(a));

	}

}
