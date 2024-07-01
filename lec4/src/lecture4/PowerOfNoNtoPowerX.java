//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
//Note : For this question, you can assume that 0 raised to the power of 0 is 1.
//Sample Input 1 :
//	 3 4
//	Sample Output 1 :
//	81
//	Sample Input 2 :
//	 2 5
//	Sample Output 2 :
//	32

package lecture4;

import java.util.Scanner;

public class PowerOfNoNtoPowerX {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int ans=1;
		//my solution
//		for(int i=1;i<=n;i++) {
//			ans =ans*x;
//		}
//		System.out.println(ans);
		
		//coding ninja solution
//		int i=1;
//		while(i<=n) {
//			ans= ans*x;
//			i++;
//		}
//		System.out.println(ans);
		
		while(n>0) {
			ans*=x;
			n--;
		}
		System.out.println(ans);	

	}

}
