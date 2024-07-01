package lec12TwoDimensionlArray;

import java.util.Scanner;

public class LargestColumnSum {
 public static int[][] takeInput(){
	 Scanner s= new Scanner(System.in);
	 System.out.println("Enter no of row");
	 int row=s.nextInt();
	 System.out.println("Enter no of column");
	 int col=s.nextInt();
	 int arr[][]=new int[row][col];
	 for(int i=0;i<row;i++) {
		 for(int j=0;j<col;j++) {
			 System.out.println("Enter element for row "+i+" Enter Element for column "+j);
			 arr[i][j]=s.nextInt();
		 }
	 }
	 return arr;
 }
 public static void print2darray(int[][] arr) {
	 for(int i=0;i<arr.length;i++) {
		 for(int j=0;j<arr[i].length;j++) {
			 System.out.print(arr[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
 public static int largestColSum(int[][] arr) {
	int row=arr.length;
	int col=arr[0].length;
	int largest=Integer.MIN_VALUE;
	for(int j=0;j<col;j++) {
		int sum=0;
		for(int i=0;i<row;i++) {
			sum=sum+arr[i][j];
		}
		if(sum>largest) {
			largest=sum;
		}
	}
	return largest;
 }
	public static void main(String[] args) {
		int [][] arr=takeInput();
		System.out.println();
		print2darray(arr);
		System.out.println();
		System.out.println("Largest column sum "+largestColSum(arr));

	}

}
