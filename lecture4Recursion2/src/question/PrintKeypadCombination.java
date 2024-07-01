package question;

import java.util.Scanner;

public class PrintKeypadCombination {
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

	public static void printKeypad(int input) {
		printKeypad(input, "");
	}

	public static void printKeypad(int n, String OutputSoFar) {
		if (n == 0) {
			System.out.println(OutputSoFar);
			return;
		}
		int lastdigit = n % 10;
		char Options[] = numberOptions(lastdigit);
		for (int i = 0; i < Options.length; i++) {
			printKeypad(n / 10, Options[i] + OutputSoFar);

		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		printKeypad(input);
	}

}
