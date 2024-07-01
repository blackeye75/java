//Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1.
//
//Sample Input 1 :
//8
//Sample Output 1 :
//2 4
package lecture4;

import java.util.Scanner;

public class PirngFactorOfN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		//my solution
//		int count = 0;
//		for (int i = 2; i < num; i++) {
//			if (num % i == 0) {
//				System.out.print(i + " ");
//				count++;
//			}
//		}
//		if (count < 1)
//			System.out.println("-1");
		
		//coding ninja solution
		boolean a=false;
		int i=2;
		while(i<=num/2) {
			if(num%i==0)
				System.out.print(i + " ");
			i++;
			a=true;
		}
		if(a==false)
			System.out.println("-1");
	}

}
