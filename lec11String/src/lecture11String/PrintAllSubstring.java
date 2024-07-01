package lecture11String;

import java.util.Scanner;

public class PrintAllSubstring {
	public static void Substring(String str) {
//		for(int start=0;start<=str.length();start++) {
//			for(int end=start;end<str.length();end++) {
//				System.out.println(str.substring(start,end+1));
//			}

		/// apporach 2
//		for(int len=1;len<=str.length();len++){
//	          //We have to print all strings with length as "len"
//	          for(int start=0;start<=str.length()-len;start++){
//	              int end=start+len-1;
//	              System.out.println(str.substring(start,end+1));
//	          }
//		
//		}
		//apporach 3

		int n = str.length();
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				for (int k = i; k <= j; ++k) {
					System.out.print(str.charAt(k)+" ");
				}
			}
			System.out.println();

		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		Substring(str);

	}

}
