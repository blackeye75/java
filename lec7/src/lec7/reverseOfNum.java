//Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
//Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

package lec7;

import java.util.Scanner;

public class reverseOfNum {

	public static void main(String[] args) {
	Scanner s= new Scanner (System.in);
//	int n=s.nextInt();
//	int revNum=0;
//	for(int temp=n;temp>0;) {
//		int lastDigit=temp%10;
//		revNum=revNum*10+lastDigit;
//		temp=temp/10;
//		
//	}
//	System.out.println(revNum);
	
	//using while loop
	int n=s.nextInt();
	int revNum=0;
	int temp=n;
	while(temp >0) {
		int lastDigit=temp%10;
		revNum=revNum*10+lastDigit;
		temp=temp/10;
	}
	
	System.out.println(revNum);

	}

}
