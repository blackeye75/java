//Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
//Input Format :
//3 integers - S, E and W respectively 


//0                                   
//100 
//20
//Sample Output 1:
//0   -17
//20  -6
//40  4
//60  15
//80  26
//100 37

package lecture4;

import java.util.Scanner;

public class farenhiteToCelTabel {

	public static void main(String[] args) {
//		Scanner s = new Scanner (System.in);
//		int S=s.nextInt();
//		int W=s.nextInt();
//		int E=s.nextInt();
//		//int i=S;
//		while(S<=E) {
//			int celcius=((S-32)*5/9);
//			System.out.println(S + " " + celcius);
//			S+=W;
//		}
		Scanner s= new Scanner(System.in);
		int S=s.nextInt();
		int E=s.nextInt();
		int W=s.nextInt();
		int celcius=0;;
		for(int i=S;i<=E;i+=W){
			 celcius=((i-32)*5)/9;
		System.out.println( i + " " + celcius);
		}
		
	}
		

	}


