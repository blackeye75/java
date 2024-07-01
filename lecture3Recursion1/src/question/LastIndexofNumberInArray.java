//last index of number
//send feedback
//given an array of length n and an integer x, you need to find and return the last index of integer x present in the array. return -1 if it is not present in the array.
//last index means - if x is present multiple times in the array, return the index at which x comes last in the array.
//you should start traversing your array from 0, not from (n - 1).
//do this recursively. indexing in the array starts from 0.
//input format :
//line 1 : an integer n i.e. size of array
//line 2 : n integers which are elements of the array, separated by spaces
//line 3 : integer x
//output format :
//last index or -1
//constraints :
//1 <= n <= 10^3
//sample input :
//4
//9 8 10 8
//8
//sample output :
//3

package question;

import java.util.Scanner;

public class LastIndexofNumberInArray {

	public static int lastIndex(int input[], int x) {
		
//		int index = 0;
//		int size = input.length;
//		for (int i = 0; i < size; i++) {
//
//			if (input[i] == x) {
//				index = i;
//				for (int j = i; j < size; j++) {
//					if (input[j] == x) {
//						index = j;
//					}
//				}
//				return index;
//			}
//		}
//		return -1;
		
		//creating copy of array
		
//		 if(input.length==0){
//		 	return -1;
//		 }
//		 int smallArray[]=new int[input.length-1];
//		 for(int i=1;i<input.length;i++){
//		 	smallArray[i-1]=input[i];
//		 }
//		 int k=lastIndex(smallArray,x);
//		 if(k!=-1){
//		 	return k+1;
//		 }else{
//		 	if(input[0]==x){
//		 		return 0;
//		 	}else{
//		 		return -1;
//		 	}
//		 }
		
		return lastIndex(input,x,0);  //helper function
	}
	
	//without copying the array
	
	public static int lastIndex(int a[],int x,int si){
		if(si==a.length){
			return -1;
		}
		int k=lastIndex(a,x,si+1);
		if(k!=-1){
			return k;
		}else{
			if(a[si]==x){
				return si;
			}else{
				return -1;
			}
		}
	}
	
static Scanner s = new Scanner(System.in);
	
	public static int[] takeInput(){
		int size = s.nextInt();
		int[] input = new int[size];
		for(int i = 0; i < size; i++){
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		System.out.println(lastIndex(input, x));
	}

}
