package break_continue;

import java.util.Scanner;

public class breakDemo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//     int n=s.nextInt();
//     int d=2;
//     boolean divided=false;
//     while(n>d) {
//    	if (n%d==0) {
//    		divided=true;
//    		break;
//    	}
//    	d++;
//     }
//     if(divided) {
//    	 System.out.println("not prime");
//    
//     }else {
//    	 System.out.println("prime");
//     }
// 
		// using for loop

		int n = s.nextInt();
		boolean divided = false;
		for (int d = 2; d < n; d++) {
			if (n % d == 0) {
				divided = true;
				break;
			}
		}
		if (divided) {
			System.out.println("not prime");

		} else {
			System.out.println("prime");
		}

	}

}
