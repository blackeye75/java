//Given a character, you need to print the ASCII value of that character.

package lec3;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char c=s.next().charAt(0);
		System.out.println((int)(c));

	}

}
