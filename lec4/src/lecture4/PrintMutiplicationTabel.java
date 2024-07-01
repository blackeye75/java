//Write a program to print multiplication table of n
//Sample Input 1 :
//2
//Sample Output 1 :
//2
//4
//6
//8
//10
//12
//14
//16
//18
//20

package lecture4;

import java.util.Scanner;

public class PrintMutiplicationTabel {

	public static void main(String[] args) {
	Scanner s= new Scanner (System.in);
	int num=s.nextInt();
	for(int i=1;i<=10;i++) {
		System.out.println(num*i);
	}

	}

}
