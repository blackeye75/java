//Quick Sort Code
//Send Feedback
//Given the 'start' and the 'end" positions of the array 'input'.
//Your task is to sort the elements between 'start' and 'end' using quick sort.
//Note :
//Make changes in the input array itself.
//Input format :
//Line 1: Integer Ni.e. Array size
//Line 2: Array elements (separated by space)
//Output format :
//Array elements in increasing order (separated by space)
//Sample Input 1:
//6
//268543
//Sample Output 1 :
//234568
//Sample Input 2 :
//5
//12357
//Sample Output 2 :
//12357
//Constraints :
//1 <= N <= 10^3
//0 <= input[i] <= 10^9

package question;

import java.util.Scanner;

public class QuickSort {
	
	public static int partition(int input[],int start,int end){
		  int pivot=input[start];
		  int count =0;
		  for(int i=start+1;i<=end;i++)
		  {
		      if(input[i]<=pivot)
		    {
		      count++;
		    }
		  } 
		    int pivotIndex=start+count;
		    int temp=input[start];
		    input[start]=input[pivotIndex];
		    input[pivotIndex]=temp;
		    
		    int i=start;
		    int j=end;
		    while(i<pivotIndex && j>pivotIndex)
		    {
		      if(input[i]<=pivot)
		     {
		        i++;
		      }
		      else if(input[j]>pivot)
		       {
		        j--;
		       }
		        else 
		          {
		          int tempo=input[i];
		          input[i]=input[j];
		          input[j]=tempo;
		          i++;
		          j--;
		        }
		      }
		     
		return pivotIndex;
		}  
			public static void quickSort(int[] input,int startIndex, int endIndex) {
			 if(startIndex>=endIndex)
		    {
		      return;
		    }
		  int p = partition(input,startIndex,endIndex);
		  quickSort(input,startIndex,p-1);
		  quickSort(input,p+1,endIndex);
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
	       quickSort(input, 0, input.length - 1);
	        for(int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + " ");
	        }
		
	}

}
