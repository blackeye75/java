//Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
//Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

//Sample Input 1:
//132456
//
//
//Sample Output 1:
//12 9
//
//
//Explanation of sample input 1 :
//The sum of even digits = 2 + 4 + 6 = 12
//The sum of odd digits = 1 + 3 + 5 = 9
//

package lecture4;

import java.util.Scanner;

public class SumOfEvenAndOddTilN {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		
//		my solution
		
//		int num=s.nextInt();
//		int temp=1;
//		int soe=0,soo=0;
//		while(temp!=0) {
//			temp=num%10;
//			if(temp%2==0) {
//				 soe=soe+temp;
//			}if(temp%2!=0) {
//				soo=soo+temp;
//			}
//		num=num/10;	
//		}
//		System.out.println(soe) ;
//		System.out.println(soo) ;
		
		//coding ninja solution
		int num=s.nextInt();
		int sumEven=0;
		int sumOdd=0;
		while(num>0) {
			int lastDigit=num%10;
			if(lastDigit%2==0)
				 sumEven=sumEven+lastDigit;
			if(lastDigit%2!=0)
				sumOdd=sumOdd+lastDigit;
			num=num/10;
		}
	     System.out.println(sumEven);
	     System.out.println(sumOdd);
	}

}
