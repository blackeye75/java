package break_continue;

public class continueDemo {

	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
		System.out.println();
		
       for(int k=1; k<=10;k++) {
    	   if(k==5) {
    		   continue;   //no need to increment 
    		               //there after like while loop.
    	   }
    	   System.out.println(k);
       }
	}

}
