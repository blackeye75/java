//Largest Row or Column
//Send Feedback
//For a given two-dimensional integer array/list of size (N x M), you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
//Note :
//If there are more than one rows/columns with maximum sum, consider the row/column that comes first. And if ith row and jth column has the same largest sum, consider the ith row as answer.
//Input Format :
//The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.
//
//First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.
//
//Second line onwards, the next 'N' lines or rows represent the ith row values.
//
//Each of the ith row constitutes 'M' column values separated by a single space.
//Output Format :
//For each test case, If row sum is maximum, then print: "row" <row_index> <row_sum>
//OR
//If column sum is maximum, then print: "column" <col_index> <col_sum>
//It will be printed in a single line separated by a single space between each piece of information.
//
//Output for every test case will be printed in a seperate line.
// Consider :
//If there doesn't exist a sum at all then print "row 0 -2147483648", where -2147483648 or -2^31 is the smallest value for the range of Integer.
//Constraints :
//1 <= t <= 10^2
//1 <= N <= 10^3
//1 <= M <= 10^3
//Time Limit: 1sec
//Sample Input 1:
//1
//3 2
//6 9 
//8 5 
//9 2 
//Sample Output 1:
//column 0 23
//Sample Input 2:
//1
//4 4
//6 9 8 5 
//9 2 4 1 
//8 3 9 3 
//8 7 8 6 
//Sample Output 2:
//column 0 31

package lec12TwoDimensionlArray;

import java.util.Scanner;

public class LargestRowOrcolumn {
	public static void largestRowOrCol(int arr[][]) {
//		int row=arr.length;
//		int col=arr[0].length;
//		if(row==0&&col==0) {
//			return;
//		}
//		int largestRow=Integer.MIN_VALUE;
//		int rowSum=0;
//		int rowNo=0;
//		for(int i=0;i<row;i++) {
//			rowSum=0;
//			for(int j=0;j<col;j++) {
//				rowSum=rowSum+arr[i][j];
//			}
//			if(rowSum>largestRow) {
//				largestRow=rowSum;
//				rowNo=i;
//			}
//		}
//		int  largestCol=Integer.MIN_VALUE;
//		 int colSum=0;
//		 int colNo=0;
//		 for(int j=0;j<col;j++) {
//			 colSum=0;
//			 for(int i=0;i<row;i++) {
//				 colSum=colSum+arr[i][j];
//			 }
//			 if(colSum>largestCol) {
//				 largestCol=colSum;
//				 colNo=j;
//			 }
//		 }
//		 if(largestRow>largestCol) {
//			 System.out.println("rwo "+rowNo+" "+largestRow);
//		 }if(largestRow<largestCol) {
//			 System.out.println("column "+colNo+" "+largestCol);
//		 }
		//using boolean
		boolean isRow=true;
		int largestSum=Integer.MIN_VALUE;
		int No=0;
		
		int row=arr.length;
		if(row==0) {
			System.out.println("row"+No+" "+largestSum );
		}
		int col=arr[0].length;
		
		for(int i=0;i<row;i++) {
			int rowSum=0;
			for(int j=0;j<col;j++) {
				rowSum+=arr[i][j];
			}
			if(rowSum>largestSum) {
				largestSum=rowSum;
				No=i;
			}
		}
		
		for(int j=0;j<col;j++) {
			int colSum=0;
			for(int i=0;i<row;i++) {
				colSum+=arr[i][j];
			}
			if(colSum>largestSum) {
				largestSum=colSum;
				No=j;
				isRow=false;
			}
		}
		if(isRow) {
			System.out.println("Row "+" "+No+" "+largestSum);
		}else {
			System.out.println("Column "+" "+No+" "+largestSum);
		}
		 
		
	}

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t=s.nextInt();
		for(int k=0;k<t;k++) {
			int row=s.nextInt();
			int col=s.nextInt();
			int arr[][]=new int[row][col];
			for(int i=0;i<row;i++) {
				for(int j=0;j<col;j++) {
					arr[i][j]=s.nextInt();
				}
			}	
			largestRowOrCol(arr);
		}

	}

}
