package lec7;

import java.util.Scanner;

public class forLoop {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		
//		using while loop
		
		
//		int i=1,sum=0;
//		while(i<=n) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println(sum);
		
//		using for loop
		
		
		int sum = 0;
		for (int i = 1;i <= n; i = i + 1) {
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
