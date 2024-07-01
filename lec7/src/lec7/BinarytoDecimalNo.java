//Given a binary number as an integer N, convert it into decimal and print.
//A binary number can be converted into a decimal number by picking up the last digit and then
//multiplying each digit with 2 raised to the power of its place value and then adding them in a
//continuous manner.
//For example, in the case of 1100, start picking up the last digit multiplied by 2’s respective
//powers and add them up.So,
//1100=0*2^(0)+0*2^(1)+1*2^(2)+1*2^(3)=0+0+4+8=12

package lec7;

import java.util.Scanner;

public class BinarytoDecimalNo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		int num = s.nextInt();
//		int decimal = 0, power = 1;
//		for (; num > 0;) {
//			int lastDigit = num % 10;
//			decimal = decimal + lastDigit * power;
//			power *= 2;
//			num /= 10;
//		}
//		System.out.println(decimal);
		//using while loop.
		
		int num=s.nextInt();
		int decimal=0,power=1;
		while(num>0) {
			int lastDigit=num%10;
			decimal=decimal+lastDigit*power;
			power=power*2;
			num=num/10;
		}
		
		System.out.println(decimal);
		
	}
}
