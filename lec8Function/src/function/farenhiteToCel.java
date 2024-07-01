//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
//Note: You don't have to write the main function or take input. It has already been taken care of. Just write the code that prints Fahrenheit to Celsius table in the function itself.
//Input Format :
//3 integers - S, E and W respectively

package function;

import java.util.Scanner;

public class farenhiteToCel {
	public static void tabel(int s,int e,int w) {
		for(int i=s;s<=e;s+=w) {
			int clecius=(s-32)*5/9;
			System.out.println(s +" "+clecius);
		}
		return;
	}

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 int s=sc.nextInt();
	 int e=sc.nextInt();
	 int w=sc.nextInt();
	 tabel(s,e,w);
	}

}
