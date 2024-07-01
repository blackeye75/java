//Return Keypad Code
//Send Feedback
//Given an integer n, using phone keypad find out all the possible strings that can be made using digits of input n.
//Return empty string for numbers 0 and 1.
//Note :
//1. The order of strings are not important.
//2. Input and output has already been managed for
//you. You just have to populate the output array and
//return the count of elements populated in the output
//array.
//Input Format :
//Integer n
//Output Format :
//All possible strings in different lines

package question;

import java.util.Scanner;

public class ReturnKeypasCombination {
	public static char[] numberOptions(int n) {
		switch (n) {
		case 2:
			char options2[] = { 'a', 'b', 'c' };
			return options2;

		case 3:
			char options3[] = { 'd', 'e', 'f' };
			return options3;

		case 4:
			char options4[] = { 'g', 'h', 'i' };
			return options4;

		case 5:
			char options5[] = { 'j', 'k', 'l' };
			return options5;

		case 6:
			char options6[] = { 'm', 'n', 'o' };
			return options6;

		case 7:
			char options7[] = { 'p', 'q', 'r', 's' };
			return options7;

		case 8:
			char options8[] = { 't', 'u', 'v' };
			return options8;

		case 9:
			char options9[] = { 'w', 'x', 'y', 'z' };
			return options9;

		default:
			char options[] = { '\0' };
			return options;
		}
	}

	public static String[] keypad(int n) {
		if (n == 0) {
			String ans[] = { "" };
			return ans;
		}
		int lastDigit = n % 10;
		int smallerNumber = n / 10;
		String smallAns[] = keypad(smallerNumber);
		char options[] = numberOptions(lastDigit);
		String ans[] = new String[smallAns.length * options.length];
		int k = 0;
		for (int i = 0; i < smallAns.length; i++) {
			for (int j = 0; j < options.length; j++) {
				ans[k] = smallAns[i] + options[j];
				k++;
			}
		}
		return ans;

	}

	// using if else Statment
//	public static String[] SingleDigit(int n) {
//		if (n <= 1 || n > 10) {
//			System.exit(0);
//		}
//		if (n == 2) {
//			String output[] = { "a", "b", "c" };
//			return output;
//		} else if (n == 3) {
//			String output[] = { "d", "e", "f" };
//			return output;
//		} else if (n == 4) {
//			String output[] = { "g", "h", "i" };
//			return output;
//		} else if (n == 5) {
//			String output[] = { "j", "k", "l" };
//			return output;
//		} else if (n == 6) {
//			String output[] = { "m", "n", "o" };
//			return output;
//		} else if (n == 7) {
//			String output[] = { "p", "q", "r", "s" };
//			return output;
//		} else if (n == 8) {
//			String output[] = { "t", "u", "v" };
//			return output;
//		} else {
//			String output[] = { "w", "x", "y", "z" };
//			return output;
//		}
//
//	}
//
//	public static String[] keypad(int n) {
//		if (n == 0) {
//			String output[] = { "" };
//			return output;
//		}
//		String smallerNoarray[] = keypad(n / 10);
//		String SingleDigitOutput[] = SingleDigit(n % 10);
//		String output[] = new String[smallerNoarray.length * SingleDigitOutput.length];
//		int k = 0;
//		for (int i = 0; i < smallerNoarray.length; i++) {
//			for (int j = 0; j < SingleDigitOutput.length; j++) {
//				output[k] = smallerNoarray[i] + SingleDigitOutput[j];
//				k++;
//			}
//		}
//		return output;
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		String output[] = keypad(input);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}

}
