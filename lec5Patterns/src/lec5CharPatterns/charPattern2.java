//ABCD
//BCDE
//CDEF
//DEFG

package lec5CharPatterns;

import java.util.Scanner;

public class charPattern2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i =1;
		int n=s.nextInt();
		while(i<=n) {
			int j=1;
			char startingchar=(char)('A'+i-1);
			while(j<=n) {
				System.out.print(startingchar);
				startingchar++;
				j++;
			}
			System.out.println();
			i++;
			
		}
		

	}

}
