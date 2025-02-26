//Tower of Hanoi
//Send Feedback
//Tower of Hanoi is a mathematical puzzle where we have
//three rods and n disks. The objective of the puzzle is to
//move all disks from source rod to destination rod using
//third rod (say auxiliary). The rules are :
//1) Only one disk can be moved at a time.
//2) A disk can be moved only if it is on the top of a rod.
//3) No disk can be placed on the top of a smaller disk.
//Print the steps required to move n disks from source rod to
//destination rod.
//Source Rod is named as 'a', auxiliary rod as 'b' and
//destination rod as 'c'.
//Input Format :
//Integer n
//Output Format :
//Steps in different lines (in one line print source and
//destination rod name separated by space)
//Constraints :
//0<= n <= 20
//Sample Input 1 :
//2
//Sample Output 1
//a b
//а с
//b c
//Sample Input 2 :
//3
//Sample Output 2 :
//a c
//a b
//c b
//a c
//ba
//b c
//а с
package question;

import java.util.Scanner;

public class ToweOFHanoi {
	
//	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
//		if(disks==1){
//			System.out.println(source+" "+destination);
//			return;
//		}
//		towerOfHanoi(disks-1, source, destination, auxiliary);
//		System.out.println(source+" "+destination);
//		towerOfHanoi(disks-1, auxiliary, source, destination);
//	}
	 public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
	        if(disks == 0) {
	            return;
	        }
	        
	        if(disks == 1) {
	            System.out.println(source + " " + destination);
	            return;
	        }

	        towerOfHanoi(disks - 1, source, destination, auxiliary);
	        System.out.println(source + " " + destination);
	        towerOfHanoi(disks - 1, auxiliary, source, destination);
	    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
	    towerOfHanoi(n, 'a', 'b', 'c');
	}

}
