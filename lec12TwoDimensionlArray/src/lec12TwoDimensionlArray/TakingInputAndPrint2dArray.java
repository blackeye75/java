package lec12TwoDimensionlArray;

import java.util.Scanner;

public class TakingInputAndPrint2dArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		//for declaring 2d array
		System.out.println("Enter no of row in arrary");
		int row=s.nextInt();
		System.out.println("Enter no of coloumn in array");
		int coloumn=s.nextInt();
		int arr[][]=new int [row][coloumn];
		//taking input in array
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				System.out.println("give value for row "+ i + " give value for coloumn "+ j);
				arr[i][j]=s.nextInt();
			}
		}
		//for printing
		for(int i=0;i<row;i++) {
			for(int j=0;j<coloumn;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
