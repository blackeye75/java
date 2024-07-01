package lec9Array;

import java.util.Scanner;

public class TakingInputPirntArray {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();    //ask size of array from user
		int input[]=new int[size];   //declaring array of name input and size 'size'.
		for(int i=0;i<size;i++) {           //for loop for taking input from user and store it in array
			input[i]=s.nextInt();
		}
		for(int i=0;i<size;i++) {
			System.out.print(input[i]+ " ");
		}
	System.out.println();
	}

}
