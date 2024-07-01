//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
//Print the prime numbers in different lines.

package break_continue;
import java.util.Scanner;
public class allPrimeNoprintTillN {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//        int n=sc.nextInt();
//        for(int i=2 ;i<=n;i++)
//        {
//            int count=0;
//            for(int j=2;j<=i;j++)
//            {
//                if(i%j==0)
//                count++;
//            }
//            if(count==1)
//                System.out.println(i);
//        }
		
		//coding ninjas solution.
		
		 int n=s.nextInt();
	        for(int i=2;i<=n;i++){
	        	boolean isPrime=true;
	          for(int j=2;j<i;j++){
	            if(i%j==0){
	              isPrime=false;
	            //  break;
	            }
	          }
	          if(isPrime){
	            System.out.println(i);
	          }
	        }

	}

}
