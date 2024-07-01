package lec7;

import java.util.Scanner;

public class decimalToBinary {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
//		int n=s.nextInt();
//		int rem=0;
//		long ans=0,placeVlaue=1;
//		while(n>0) {
//			rem=n%2;
//			ans=ans+rem*placeVlaue;
//			placeVlaue*=10;
//			n/=2;
//		}
//		System.out.println(ans);
		
		int n = s.nextInt () ;
		long binary = 0, pow = 1;
		while(n > 0) {
		int lastBit = n % 2;
		binary += lastBit * pow;
		pow *= 10;
		n = n / 2;
		}
		System.out.println (binary);

	}

}
