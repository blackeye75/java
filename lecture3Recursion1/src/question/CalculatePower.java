//Calculate Power
//Send Feedback
//Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.
//Do this recursively.
//Input format :
//Two integers x and n (separated by space)
//Output Format :
//x^n (i.e. x raise to the power n)
//Constraints :
//0 <= x <= 30
//0 <= n <= 30
//Sample Input 1 :
// 3 4
//Sample Output 1 :
//81
//Sample Input 2 :
// 2 5
//Sample Output 2 :
//32

package question;

import java.util.Scanner;

public class CalculatePower {
	public static int power(int x, int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
		if(n==0){
			return 1;
		}
		if(x==0){
			return 0;
		}

		return x*power(x, n-1);
	}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);

		
			int x = s.nextInt();
			int n = s.nextInt();
			
			System.out.println(power(x, n));
		}
	}


