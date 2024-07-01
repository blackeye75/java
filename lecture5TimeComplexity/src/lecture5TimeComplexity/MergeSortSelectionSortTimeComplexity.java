package lecture5TimeComplexity;

import java.util.Arrays;

public class MergeSortSelectionSortTimeComplexity {

	// Merge Sort
	public static void mergeSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int n = arr.length;
		if (n > 1) {
			int mid = n / 2;
			int[] left = Arrays.copyOfRange(arr, 0, mid);
			int[] right = Arrays.copyOfRange(arr, mid, n);
			mergeSort(left);
			mergeSort(right);
			merge(arr, left, right);
		}
	}

	private static void merge(int[] arr, int[] left, int[] right) {
		int i = 0, j = 0, k = 0;
		while (i < left.length && j < right.length) {
			if (left[i] <= right[j]) {
				arr[k++] = left[i++];
			} else {
				arr[k++] = right[j++];
			}
		}
		while (i < left.length) {
			arr[k++] = left[i++];
		}
		while (j < right.length) {
			arr[k++] = right[j++];
		}
	}

	// Selection Sort
	public static void selectionSort(int[] arr) {
		if (arr == null || arr.length <= 1) {
			return;
		}
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}
	}

	public static void main(String[] args) {
//int[] arr = { 12, 11, 13, 5, 6, 7 };
		for(int n=10;n<=10000000;n*=10) {
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=arr.length-1;
			}
			// Measure time taken by Merge Sort
			long mergeStartTime = System.currentTimeMillis();
			mergeSort(arr);
			long mergeEndTime = System.currentTimeMillis();
			long mergeTimeTaken = mergeEndTime - mergeStartTime;
			System.out.println("Merge Sort Time Taken: " + mergeTimeTaken + " milliseconds");
		}

		

		// Reset array for Selection Sort
		//arr = new int[] { 12, 11, 13, 5, 6, 7 };
		
		for(int n=10;n<=10000000;n*=10) {
			int arr[]=new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=arr.length-1;
			}
			// Measure time taken by Selection Sort
			long selectionStartTime = System.currentTimeMillis();
			selectionSort(arr);
			long selectionEndTime = System.currentTimeMillis();
			long selectionTimeTaken = selectionEndTime - selectionStartTime;
			System.out.println("Selection Sort Time Taken: " + selectionTimeTaken + " milliseconds");
		}

		
	}
}


