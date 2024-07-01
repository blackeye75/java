package questions;

import java.util.HashMap;
import java.util.Scanner;

public class PrintIntersection {

	public static void printIntersection(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int key : arr1) {

//			if(map.containsKey(key)) {
//				map.put(key, map.get(key)+1);
//			}else {
//				map.put(key, 1);
//			}

			map.put(key, map.getOrDefault(key, 0) + 1); // get the key value and if not present return default value
														// i.e. 0
		}

		for (int i = 0; i < arr2.length; i++) {
			if (map.containsKey(arr2[i])) {
				System.out.println(arr2[i]);
				if (map.get(arr2[i]) > 1) {
					map.put(arr2[i], map.get(arr2[i]) - 1);
				} else {
					map.remove(arr2[i]);
				}
			}
		}
	}

	public static int[] takeInput(int size) {
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter size for first array");
		int size1 = s.nextInt();
		System.out.println("Enter size for second array");
		int size2 = s.nextInt();

		System.out.println("Enter element in first array");

		int arr1[] = takeInput(size1);

		System.out.println("Enter element in second array");

		int arr2[] = takeInput(size2);
		
		printIntersection(arr1, arr2);

	}

}
