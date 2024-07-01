package lecture2;
import java.util.Scanner;
public class farenhiteToCel {

	public static void main(String[] args) {
	Scanner s= new Scanner(System.in);
	int farenhite=s.nextInt();
	int cel=((farenhite-32)*5)/9;
	System.out.println(cel);
	
	

	}

}
