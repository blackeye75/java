//Remove Consecutive Duplicates
//Send Feedback
//For a given string(str), remove all the consecutive duplicate characters.
//Example:
//Input String: "aaaa"
//Expected Output: "a"
//
//Input String: "aabbbcc"
//Expected Output: "abc"
// Input Format:
//The first and only line of input contains a string without any leading and trailing spaces. All the characters in the string would be in lower case.
//Output Format:
//The only line of output prints the updated string.
//Note:
//You are not required to print anything. It has already been taken care of.
//Constraints:
//0 <= N <= 10^6
//Where N is the length of the input string.
//
//Time Limit: 1 second
//Sample Input 1:
//aabccbaa
//Sample Output 1:
//abcba
//Sample Input 2:
//xxyyzxx
//Sample Output 2:
//xyzx

package lecture11String;

import java.util.Scanner;

public class removeConsecutivedublicates {
	public static String Remove(String str) {
//		String result = "";
//		char ch = str.charAt(0);
//		result += ch;
//		for (int i = 1; i < str.length(); i++) {
//			if (str.charAt(i) == ch) {
//
//			} else {
//				result += str.charAt(i);
//				ch = str.charAt(i);
//			}
//		}
//		return result;
		
		int n=str.length();
		if(n==0) {
			return str;
		}
		String ans="";
		int StartIndex=0;
		while(StartIndex<n) {
			char uniqueChar=str.charAt(StartIndex);
			int nextUniqueCharIndex=StartIndex+1;
			while(nextUniqueCharIndex<n&&str.charAt(nextUniqueCharIndex)==uniqueChar) {
				nextUniqueCharIndex+=1;
			}
			 ans+=uniqueChar;
			StartIndex=nextUniqueCharIndex;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String ans = Remove(str);
		System.out.println(ans);

	}

}
