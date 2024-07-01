package function;

import java.util.Scanner;

public class PrintPrimeNoTillN {
	public static boolean isPrime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}
	public static void printPrime(int n) {
		for(int i=2;i<=n;i++) {
			boolean yesPrime=isPrime(i);
			if(yesPrime) {
				System.out.println(i);
			}
			
		}
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		printPrime(n);

	}

}
