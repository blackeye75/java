package function;

import java.util.Scanner;

public class NcRBymakingFunction {
	public static int factorial(int n) {
		int ans =1;
		for(int i=1;i<=n;i++) {
			ans*=i;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		int n= s.nextInt();
		int r= s.nextInt();
		int numerator=factorial(n);
		int denomenator=factorial(r);
		int denomenator2=factorial(n-r);
		int ans=numerator/(denomenator*denomenator2);
	    System.out.println(ans);
		

	}

}
