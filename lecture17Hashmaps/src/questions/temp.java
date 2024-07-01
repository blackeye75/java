package questions;

import java.util.Arrays;

public class temp {
	
	public static int max(int arr[]) {
		int max=0;
		for(int i=0;i<arr.length-1;i++) {
			int count=1;
			if(arr[i]==arr[i+1]) {
				count++;
				max=arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int arr[]= {1,1,2,2,2,1,1,2,2,3,4,1,2,1,4,4,4,4,4,4};
		
		int ans=max(arr);
				System.out.println(ans);
//		
		int min=Arrays.stream(arr).min().getAsInt();
		int max=Arrays.stream(arr).max().getAsInt();
		
		System.out.println(max +" "+ min);
		

	}

}
