//calculating combinations of given number. By formula NcR=n!/r!*(n-r)!  


package function;

import java.util.Scanner;

public class NcR {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n=s.nextInt();
		int r=s.nextInt();
		int numerator=1;
		for(int i=1;i<=n;i++) {
			numerator*=i;
		}
		int denomenator=1;
		for(int i=1;i<=r;i++)
		{
			denomenator*=i;
		}
		int denomemenator2=1;
		for(int i =1;i<=n-r;i++) {
			denomemenator2*=i;
		}
		System.out.println(numerator/(denomenator*denomemenator2));
	}

}
