package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveConsecutiveDublicates {
	public static ArrayList<Integer> removeConsecutiveDublicate(int arr[]) {
		ArrayList<Integer> result = new ArrayList<>();
		result.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[i - 1]) {
				result.add(arr[i]);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		ArrayList<Integer> result=removeConsecutiveDublicate(arr);
		for(int i=0;i<result.size();i++) {
			System.out.print(result.get(i)+" ");
		}

	}

}
