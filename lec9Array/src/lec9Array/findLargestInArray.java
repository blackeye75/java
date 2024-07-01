package lec9Array;

import java.util.Scanner;

public class findLargestInArray {
	public static int largestinArray(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static int[] takeInput() {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static void PrintArray(int[] arr) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=takeInput();
		PrintArray(arr);
		int largest=largestinArray(arr);
		System.out.println("larges="+largest);
	}

}
