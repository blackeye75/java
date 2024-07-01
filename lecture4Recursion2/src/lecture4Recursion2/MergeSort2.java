package lecture4Recursion2;

public class MergeSort2 {
	static void mergeSort(int[] input, int Si, int Ei) {
		if (Si >= Ei) {
			return;
		}
		int mid = (Si + Ei) / 2;
		// part 1
		mergeSort(input, Si, mid);
		// part 2
		mergeSort(input, mid + 1, Ei);
		merge(input, Si, Ei);
	}

	private static void merge(int[] input, int Si, int Ei) {
		int mid = (Si + Ei) / 2;
		int ans[] = new int[Ei - Si + 1];
		int i = Si;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= Ei) {
			if (input[i] < input[j]) {
				ans[k] = input[i];
				i++;
				k++;
			} else {
				ans[k] = input[j];
				j++;
				k++;
			}
		}
		while (i <= mid) {
			ans[k] = input[i];
			i++;
			k++;
		}
		while (j <= Ei) {
			ans[k] = input[j];
			j++;
			k++;
		}

		for (int index = 0; index < ans.length; index++) {
			input[Si+index]=ans[index];
		}
	}

	public static void main(String[] args) {
		int arr[]= {5,4,3,2,1,10,8,6,9};
		mergeSort(arr, 0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
