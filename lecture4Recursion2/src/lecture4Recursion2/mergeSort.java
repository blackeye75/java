package lecture4Recursion2;

import java.util.Scanner;

public class mergeSort {

	public static void mergeSort(int a[]) {
		if(a.length<=1) {
			return ;
		}
		int b[]=new int [a.length/2];
		int c[]=new int [a.length-b.length];
		
		for(int i=0;i<a.length/2;i++) {
			b[i]=a[i];
		}
		for(int i=a.length/2;i<a.length;i++) {
			c[i-a.length/2]=a[i];
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);
	}
	
	public static void merge(int[] s1,int[] s2,int[] d ) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<s1.length&&j<s2.length) {
			if(s1[i]<=s2[j]) {
				d[k]=s1[i];
				i++;
				k++;
			}else {
				d[k]=s2[j];
				j++;
				k++;
			}
		}
		//copying remaining element form source to destination
		if(i<s1.length) {
			while(i<s1.length) {
				d[k]=s1[i];
				i++;
				k++;
			}
		}if(j<s2.length) {
			if(j<s2.length) {
				d[k]=s2[j];
				j++;
				k++;
			}
		}
	}
	
	//1st apporach
	
	 public static int[] takeInput() {
	        Scanner s = new Scanner(System.in);
	        int size = s.nextInt();
	        int arr[] = new int[size];
	        for (int i = 0; i < size; i++) {
	            arr[i] = s.nextInt();
	        }
	        return arr;
	    }

	    public static void printArray(int input[]) {
	        for(int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + " ");
	        }
	    }

	public static void main(String[] args) {
		 int[] input = takeInput();
	        mergeSort(input);
	        printArray(input);
		

	}

}
