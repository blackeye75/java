package removeDublicates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RemoveDublicates {
	
	public static ArrayList<Integer> removeDublicates(int a[]){
		ArrayList<Integer> output=new ArrayList<Integer>();
		HashMap<Integer,Boolean> seen=new HashMap<Integer, Boolean>();
		
		
		for(int i=0;i<a.length;i++) {
			if(seen.containsKey(a[i])) {
				continue;
			}
			output.add(a[i]);
			seen.put(a[i], true);
		}
		return output;
	}
	
	
	
	 public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int size=s.nextInt();
		System.out.println("size "+ size);
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=s.nextInt();
		}
		ArrayList<Integer> ans=removeDublicates(arr);
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
	}
}
