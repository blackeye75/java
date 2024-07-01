package function;
import java.util.Scanner;

public class chechPrime {
public static boolean isprime(int n) {
	for(int i=2;i<n;i++) {
		if(n%i==0)
			return false;
		
	}
	return true;
}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n= s.nextInt();
	boolean ansPrime=isprime(n);
    System.out.println(ansPrime);
	}

		

	}


