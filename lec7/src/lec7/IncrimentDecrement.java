package lec7;

public class IncrimentDecrement {

	public static void main(String[] args) {
//		int a=10;
//		a++;    //postincriment  inc after the value get print.
//		++a;    //preincriment   increace before the value get printed.
//		System.out.println(a);
		
		
		int a = 10;
		System.out.println(a++);
		a++;
		++a;
		System.out.println(a);
		
		int b = ++a;
		System.out.println(b);
		System.out.println(a);
		
		a = 4;
		a *= 2;
		System.out.println(a);
		
		a ^= 2;
		System.out.println(a);
	
		int ans2 = 2 + 3 * 4;
		System.out.println(ans2);
		int ans = (2 * 3)/2;
		System.out.println(ans);

	}

}
