//Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

package lec7;

import java.util.Scanner;

public class TermsOfAp {

	public static void main(String[] args) {
		//  my code using while loop.
		Scanner s= new Scanner (System.in);
//		 int sum=0,n=1,i=1;
//		 int x=s.nextInt();
//		   while(n<=x){
//		    sum=(3*i)+2;
//		    if(sum%4!=0){
//		      System.out.println(sum);
//		      n++;
//
//		    }
//		    i++;
//		   }
		   // coding ninja solution
		   int n=s.nextInt();
		   int current =1;
		   for(int count=1;count<=n;/*count++*/) {
			   int num= (3 * current) + 2;
			   if(num%4!=0) {
				   System.out.println(num);
				   count++;
			   }  
//			   }else {
//				   count--;
//			   }
			   current++;
		   }

	}

}
