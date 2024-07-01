package lecture11String;

import java.util.Scanner;

public class Stringpalindrome {
public static boolean checkpalindrome(String str) {
	String reversedString="";
	for(int i=str.length()-1;i>=0;i--) {
		reversedString+=str.charAt(i);
	}
	if(reversedString.equals(str)) {
		return true;
	}else {
		return false;
	}
}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
       // System.out.println(checkpalindrome(str));		
       boolean ans=checkpalindrome(str);
       System.out.println(ans);
	}

}
