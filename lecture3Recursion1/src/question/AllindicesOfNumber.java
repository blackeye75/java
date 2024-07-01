package question;

import java.util.Scanner;

public class AllindicesOfNumber {

	public static int[] allindices(int[] input, int x) {
//		int[] output = new int[input.length];
//		return allindices(input, x, 0, output, 0);
//	}
//
//	public static int[] allindices(int[] input, int x, int startIndex, int output[], int outputIndex) {
//		if (startIndex == input.length) {
//			int result[] = new int[outputIndex];
//			System.arraycopy(output, 0, result, 0, outputIndex);
//			return result;
//		}
//		if(input[startIndex]==x) {
//			output[outputIndex]=startIndex;
//			return allindices(input, x, startIndex + 1, output, outputIndex + 1);
//		}else {
//			return allindices(input, x, startIndex+1, output, outputIndex);
//		}
		
		//itterativley
		
//		int count=0;
//		for(int i=0;i<input.length;i++) {
//			if(input[i]==x) {
//				count++;
//			}
//		}
//		int result[]=new int[count];
//		int resultIndex=0;
//		
//		for(int i=0;i<input.length;i++) {
//			if(input[i]==x) {
//				result[resultIndex]=i;
//				resultIndex++;
//			}
//		}
//		return result;
		
		//coding ninja solution
		
		return allindices(input, x,0);
	}
	
	public static int[] allindices(int input[],int x,int startIndex) {
		if(startIndex==input.length) {
			int output[]=new int[0];
			return output;
		}
		int smalloutput[]=allindices(input, x, startIndex+1);
		if(input[startIndex]==x) {
			int output[]=new int[smalloutput.length+1];
			output[0]=startIndex;
			for(int i=0;i<smalloutput.length;i++) {
				output[i+1]=smalloutput[i];
			}
			return output;
		}else {
			return smalloutput;
		}
	}

	static Scanner s = new Scanner(System.in);

	public static int[] takeInput() {
		int size = s.nextInt();
		int[] input = new int[size];
		for (int i = 0; i < size; i++) {
			input[i] = s.nextInt();
		}
		return input;
	}

	public static void main(String[] args) {

		int[] input = takeInput();
		int x = s.nextInt();
		int output[] = allindices(input, x);
		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + " ");
		}
	}

}
