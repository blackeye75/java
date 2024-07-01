//1234
//1234  printing j in i th row
//1234
//1234


package lec5Patterns;
import java.util.Scanner;
public class pattern2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(j);
				j++;	
			}
			System.out.println();
			i++;
		}

	}

}
