package While_loop;
import java.util.Scanner;
public class SumOfNnumbers {

	public static void main(String[] args) {
	Scanner	s=new Scanner(System.in);
	int n=s.nextInt();
	int i=1,sum=0;
	while(i<=n) {
		sum=sum+i;
		i++;
	}
	System.out.println(sum);
    System.out.println();
	}

}
