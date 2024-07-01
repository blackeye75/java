//string str=abc def ghi
    //output=cba fed igh

package lecture11String;

import java.util.Scanner;

public class reverseEachWordOfString {
	public static String reverseEachWord(String str) {
		String ans="";
		int currentWordStart=0;
		int i=0;
		for(;i<str.length();i++){
			if(str.charAt(i)==' ') {
				//reverse current word
				int currentWordEnd=i-1;
				String reversedWord="";
				for(int j=currentWordStart;j<=currentWordEnd;j++) {
					reversedWord=str.charAt(j)+reversedWord;
					
				}
				//add it to final string(ans)
				ans+=reversedWord+" ";
				currentWordStart=i+1;
			}
		}
		int currentWordEnd=i-1;
		String reversedWord="";
		for(int j=currentWordStart;j<=currentWordEnd;j++) {
			reversedWord=str.charAt(j)+reversedWord;
		}
		ans+=reversedWord;
		return ans;
		
	}
	
  public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	String str=s.nextLine();
	System.out.println(reverseEachWord(str));
}
}
