//Problem statement
//Given a random integer array A of size N. Find and print the count of pair of elements in the array which sum up to 0.
//
//
//
//Note:
//Array A can contain duplicate elements as well.
//Detailed explanation ( Input/output format, Notes, Images )
//Constraints :
//0 <= N <= 10^4
//Time Limit: 1 sec
//Sample Input 1:
//5
//2 1 -2 2 3
//Sample Output 1:
//2
//Explanation
//(2,-2) , (-2,2) will result in 0 , so the answer for the above problem is 2.

package questions;

import java.util.HashMap;

public class Pair_Sum_to_0 {

	public static int PairSum(int[] input, int size) {
		if (size == 0)
			return 0;

//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int key : input) {
//			if (map.containsKey(key)) {
//				map.put(key, map.get(key) + 1);
//			} else {
//				map.put(key, 1);
//			}
//		}
//		/*
//		 * for (Integer i: map.keySet()) { System.out.println(i + ": " + map.get(i)); }
//		 * System.out.println();
//		 */
//		int countPairs = 0;
//		for (Integer i : map.keySet()) {
//			if (map.containsKey(-i) && i != 0) {
//				// System.out.println("Found the negative of " + i);
//				countPairs = countPairs + (map.get(i) * map.get(-i));
//				// System.out.println("Current count of pairs: "+countPairs);
//				// map.remove(i);
//			}
//			// System.out.println();
//		}
//		countPairs = countPairs / 2;
//		if (map.containsKey(0)) {
//			int val = map.get(0);
//			countPairs = countPairs + (val * (val - 1)) / 2;
//		}
//		return countPairs;
//	}
		HashMap<Integer, Integer> map=new HashMap<Integer, Integer>();
		
		for(int i:input) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		int countPair=0;
		for(Integer i:map.keySet()) {
			if(map.containsKey(-i)&&i!=0) {
				countPair=countPair+(map.get(i)*map.get(-i));
			}
		}
		countPair=countPair/2;
		if(map.containsKey(0)) {
			int zeroCount=map.get(0);
			countPair=countPair+(zeroCount*(zeroCount-1))/2;
		}

		return countPair;

//		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//		for(int key:input) {
//			if(map.containsKey(key)) {
//				map.put(key, map.get(key)+1);
//			}else {
//				map.put(key, 1);
//			}
//		}
//		int countPair=0;
//		for(Integer key:map.keySet()) {
//			if(map.containsKey(-key)&& key!=0) {
//				countPair=countPair+(map.get(-key)*map.get(key));
//			}
//		}
//		countPair=countPair/2;
//		if(map.containsKey(0)) {
//			int countZero=map.get(0);
//			countPair=countPair+(countZero*(countZero-1))/2;
//		}
//		return countPair;
	}

	public static void main(String[] args) {
		int arr[] = { 2,1,-2,2,3};
		System.out.println(PairSum(arr, arr.length));
	}

}
