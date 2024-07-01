package lecture10;

import java.util.Scanner;

public class BinarySearch2 {
	public static int SearchBinary(int arr[],int target) {
		int start=0,end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]==target) {
				return mid;
			}else if(arr[mid]>target){
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		int target=s.nextInt();
		System.out.print(SearchBinary(arr, target));

	}

}
