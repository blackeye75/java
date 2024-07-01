package question;

import java.util.Scanner;

public class RemoveDublicateRecursevliy {
	
	public static String removeDublicate(String str){
        //itterativley

        // String ans="";
        // char c=str.charAt(0);
        // ans=ans+c;
        // for(int i=1;i<str.length();i++){
        //     if(str.charAt(i)==c){

        //     }else{
        //         ans=ans+str.charAt(i);
        //         c=str.charAt(i);
        //     }
        // }
        // return ans;

        //recursivley

        // if(str.length()==0){
        //     return str;
        // }
        // if(str.length()>=2&&str.charAt(0)==str.charAt(1)){
        //     return removeDublicate(str.substring(1));
        // }else{
        //     return str.charAt(0)+removeDublicate(str.substring(1));
        // }

        //coding ninjas solution
        if(str.length()<=1){
            return str;
        }
        if(str.charAt(0)==str.charAt(1)){
            return removeDublicate(str.substring(1));
        }else{
            return str.charAt(0)+removeDublicate(str.substring(1));
        }
    }

	public static void main(String[] args) {
		  Scanner s= new Scanner(System.in);
	        String str=s.next();
	        System.out.println(removeDublicate(str));

	}

}
