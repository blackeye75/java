//Reverse String Wordwise
//Send Feedback
//Reverse the given string word wise. That is, the last word in given string should come at 1st place, last second word at 2nd place and so on. Individual words should remain as it is.
//Input format :
//String in a single line
//Output format :
//Word wise reversed string in a single line
//Constraints :
//0 <= |S| <= 10^7
//where |S| represents the length of string, S.
//Sample Input 1:
//Welcome to Coding Ninjas
//Sample Output 1:
//Ninjas Coding to Welcome
//Sample Input 2:
//Always indent your code
//Sample Output 2:
//code your indent Always

package lecture11String;

import java.util.Scanner;

public class reverseStringWordWise {
     public static String reverseWordwise(String str) {
//    	 String result="";
//    	 int i=str.length()-1;
//    	 int end=str.length();
//    	 while(i>=0) {
//    		 if(str.charAt(i)==' ') {
//    			 result=result+str.substring(i+1,end)+" ";
//    			 end=i;
//    		 }
//    		 i--;
//    	 }
//    	 result=result+str.substring(i+1,end);
//    	 return result;
    	 int end = str.length() - 1,start,j;
 		String result ="",word = "";
 		for(int i= str.length() - 1;i >= 0;i--) {
 			if(str.charAt(i) == ' ') {
 				start = i + 1;
 				word = "";
 				for(j = start;j <= end;j++) {
 					word += str.charAt(j);
 				}
 				end  = i - 1;
 				result = result + word + " ";
 			}
 		}
 		word = "";
 		for(j = 0;j <= end;j++) {
 			word = word + str.charAt(j);
 		}
 		result += word;
 		return result;
 	}
     
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str=s.nextLine();
		System.out.println(reverseWordwise(str));
	}

}


/*
------------------------------

public static String reverseWordWise(String input) {

	String[] words = str.split(" ");

	for (int i = 0; i < words.length / 2; i++) {

		String temp = words[i];
		words[i] = words[words.length - 1 - i];

		words[words.length - 1 - i] = temp;
	}

  return String.join(" ", words);
}

*/


/*

public static String reverseWordwise(String str) {
        // Reverse the entire string.
        String reversedString = new StringBuilder(str).reverse().toString();

        // Split the reversed string on whitespace characters.
        String[] words = reversedString.split("\\s+");

        // Reverse the individual words.
        for (int i = 0; i < words.length; i++) {
            words[i] = new StringBuilder(words[i]).reverse().toString();
        }

        // Join the reversed words back together with whitespace characters in between.
        return String.join(" ", words);
    }
}

*/


