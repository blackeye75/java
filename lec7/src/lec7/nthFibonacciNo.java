//The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//    F(n) = F(n - 1) + F(n - 2), 
//    Where, F(1) = 1, F(2) = 1
//
//
//Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.


package lec7;

import java.util.Scanner;

public class nthFibonacciNo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=1,b=1;
		for(int i=1;i<n;i++) {
			int c=a+b;
			a=b;
			b=c;
			
		}
		System.out.println(a);

	}

}
