//Merge Sort Code
//Send Feedback
//You are given the starting '' and the ending 'r' positions of the array 'ARR'.
//You must sort the elements between 'I' and 'r'.
//Note:
//Change in the input array itself. So no need to return
//or print anything.
//Example:
//Input: 'N' = 7,
//'ARR' = [2, 13, 4, 1, 3, 6, 28]
//Output: [1 2 3 4 6 13 28]
//Explanation: After applying 'merge sort' on the input
//array, the output is [1 2 3 4 6 13 28].
//Input format:
//The first line contains an integer <em>**'N'**</em>
//representing the size of the array/list.
//The second line contains 'N' single space-separated
//integers representing the elements in the array/list.
//Output format :
//You don't need to return anything. In the output, you
//will see the array after you do the modification.
//Sample Input 1:
//7
//2 13 4 1 3 6 28
//Sample Output 1:
////1 2 3 4 6 13 28
////Explanation of Sample Output 1:
//Explanation of Sample Output 1:
//After applying 'merge sort' on the input array, the
//output is [1 2 3 4 6 13 28].
//Sample Input 2:
//5
//93620
//Sample Output 2:
//02369
//Explanation of Sample Output 2:
//After applying 'merge sort' on the input array, the
//output is [0 2 3 6 9].
//Constraints :
//1 <= N <= 10^3
//0 <= ARR[i] <= 10^9

package question;

import java.util.Scanner;

public class MergeSortCode {
	
	public static void mergeSort(int []input,int start,int end){
	      if(start<end){
	        int mid=(start+end)/2;
	        mergeSort(input,start,mid);
	        mergeSort(input,mid+1,end);
	        merge(input,start,mid,end);
	      }
	    }
	  	public static void merge(int arr[], int start, int mid, int end) 
	    { 
	        // Find sizes of two subarrays to be merged 
	        int n1 = mid - start + 1; 
	        int n2 = end - mid; 
	  
	        /* Create temp arrays */
	        int L[] = new int [n1]; 
	        int R[] = new int [n2]; 
	  
	        /*Copy data to temp arrays*/
	        for (int i=0; i<n1; ++i) 
	            L[i] = arr[start + i]; 
	        for (int j=0; j<n2; ++j) 
	            R[j] = arr[mid + 1+ j]; 

	        int i = 0, j = 0; 
	  
	        // Initial index of merged subarry array 
	        int k = start; 
	        while (i < n1 && j < n2) 
	        { 
	            if (L[i] <= R[j]) 
	            { 
	                arr[k] = L[i]; 
	                i++; 
	            } 
	            else
	            { 
	                arr[k] = R[j]; 
	                j++; 
	            } 
	            k++; 
	        }   
	        /* Copy remaining elements of L[],R[]
			ex-[1,8,10] [9,15] -->here 15 will be copied as the rest element in the array
				[1,8,22] [9,15] --> here 22 will be copied as it is the only element
		*/
	        while (i < n1) 
	        { 
	            arr[k] = L[i]; 
	            i++; 
	            k++; 
	        } 
	        while (j < n2) 
	        { 
	            arr[k] = R[j]; 
	            j++; 
	            k++; 
	        } 
	    }

	
	 public static int[] takeInput() {
	        Scanner s = new Scanner(System.in);
	        int size = s.nextInt();
	        int arr[] = new int[size];
	        for (int i = 0; i < size; i++) {
	            arr[i] = s.nextInt();
	        }
	        return arr;
	    }

	    public static void printArray(int input[]) {
	        for(int i = 0; i < input.length; i++) {
	            System.out.print(input[i] + " ");
	        }
	    }
	public static void main(String[] args) {
		  int[] input = takeInput();
	        mergeSort(input, 0, input.length - 1);
	        printArray(input);

	}

}
