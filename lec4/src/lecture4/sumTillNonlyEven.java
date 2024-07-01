//Given a number N, print sum of all even numbers from 1 to N.

package lecture4;

import java.util.Scanner;

public class sumTillNonlyEven {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=2;
		int sum=0;
		while(n>=i) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	
		

	}

}
