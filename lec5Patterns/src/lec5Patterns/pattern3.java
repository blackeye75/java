//1111   
//2222   printing i in i th row
//3333
//4444

package lec5Patterns;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(i);
				j++;	
			}
			System.out.println();
			i++;
		}

	}

}
