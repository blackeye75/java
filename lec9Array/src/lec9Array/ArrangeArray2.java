//question is same as arrangeArray.java

package lec9Array;

import java.util.Scanner;

public class ArrangeArray2 {
	public static void ArrangeArray(int[] arr,int n) {
		int leftIndexNo=0,rightIndexNo=n-1;
		int counter=1;
		while(leftIndexNo<=rightIndexNo) {
			if(counter%2==1) {
				arr[leftIndexNo]=counter;
				leftIndexNo+=1;
				counter++;
			}else {
				arr[rightIndexNo]=counter;
				rightIndexNo--;
				counter++;
			}
		}
	}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		while(t>0) {
			
		int n=s.nextInt();
		int arr[]=new int[n];
		ArrangeArray(arr, n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] +" ");
		}
			t--;
		}
	}

}
