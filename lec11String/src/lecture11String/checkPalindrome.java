package lecture11String;

import java.util.Scanner;

public class checkPalindrome {
public static boolean checkpalindrome(String str) {
	int start=0,end=str.length()-1;
	while(start<end) {
		if(str.charAt(start)!=str.charAt(end))
			return false;
		else
			start++;
		end--;
	}
	return true;
}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
	    System.out.println(checkpalindrome(str));

	}

}

//public static boolean isPalindrome(String str) {
//	String reversedString ="";
//	for (int i = str.length() - 1; i >= 0; i--) {
//		reversedString += str.charAt(i);
//	}
//	if (reversedString.equals(str)) {
//		return true;
//	} else {
//		return false;
//	}
//}
