//Given a number N, figure out if it is a member of fibonacci series or not. Return true if the number is member of fibonacci series else false.
//Fibonacci Series is defined by the recurrence
//    F(n) = F(n-1) + F(n-2)
//where F(0) = 0 and F(1) = 1

package function;

import java.util.Scanner;

public class fibonaciiNoOrNot {
	public static boolean fibonacciSeries(int n) {
		int a=0,b=1,c;
		while(n>=a) {
			c=a+b;
			a=b;
			b=c;
			if(a==n) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		boolean ansFibonaci=fibonacciSeries(n);
		System.out.println(ansFibonaci);

	}

}
