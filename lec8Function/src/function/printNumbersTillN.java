//my shit.


package function;

import java.util.Scanner;

public class printNumbersTillN {
    public static int print(int n) {
    	
    	int i=1;
    	while(i<=n) {
    	System.out.println(i);
    	i++;
    	}
    	return n;
    }
	public static void main(String[] args) {
	Scanner s = new Scanner (System.in);
	int n= s.nextInt();
	int toPrint=print(n);
	//System.out.println(toPrint);

	}

}
