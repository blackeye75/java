//Transpose of a Matrix
//Send Feedback
//You are given a matrix ‘MAT’. Print the transpose of the matrix. The transpose of a matrix is obtained by changing rows to columns and columns to rows. In other words, transpose of a matrix A[][] is obtained by changing A[i][j] to A[j][i].
//For example:
//Let matrix be : 
//1 2
//3 4
//
//Then transpose of the matrix will be: 
//1 3
//2 4
//Input Format :
//The first line of input contains an integer ‘T’, denoting the number of test cases.
//
//The first line of each test case contains two space-separated integers, ‘M’ and ‘N’, representing the size of the matrices.
//
//The next ‘M’  lines of each test case contain ‘N’ space-separated integers, representing the elements of ‘MAT’.
//Output Format :
//For each test case, print the transpose of the matrix.
//
//Print output of each test case in a separate line.
//Note :
//You do not need to print anything. It has already been taken care of. Just implement the given function. 
//Constraints :
//1 <= T <= 10
//1 <= M, N <= 3*10^3
//0 <= MAT[i][j] <= 10^7
//
//Time Limit: 1 sec
//Sample Input 1 :
//2
//2 2
//1 2
//3 4
//3 2
//1 2 
//2 3
//3 4
//Sample Output 1 :
//1 3
//2 4
//1 2 3
//2 3 4
//Explanation For Sample Input 1 :
//For test case 1: 
//The transpose of the matrix will be: 
//1 3
//2 4
//
//For test case 2:    
//The transpose of the matrix will be: 
//1 2 3
//2 3 4
//Sample Input 2 :
//2
//2 3
//1 2 3 
//3 4 5
//2 1
//1
//2
//Sample Output 2 :
//1 3
//2 4 
//3 5
//1 2

package lec12TwoDimensionlArray;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static int[][] transpose(int[][] arr,int n,int m){
		int newArray[][]=new int[n][m];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				newArray[j][i]=arr[i][j];
			}
		}
		return newArray;
	}
	public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int t=s.nextInt();
       for(int k=0;k<t;k++) {
    	   int m=s.nextInt();
    	   int n=s.nextInt();
    	   int arr[][]=new int[m][n];
    	   for(int i=0;i<m;i++) {
    		   for(int j=0;j<n;j++) {
    			   arr[i][j]=s.nextInt();   
    		   }
    	   }
    	   int ans[][]=new int [n][m];
    	    ans=transpose(arr, n, m);
    	   for(int i=0;i<n;i++) {
    		   for(int j=0;j<m;j++) {
    			   System.out.print(ans[i][j]+" ");
    		   }
    		   System.out.println();
    	   }
       }
	}

}
