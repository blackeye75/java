package lecture3Recursion1;

public class FibonacciNumber {
	public static int fib(int n){
//		System.out.println("fib " + n);
		if(n == 0 || n == 1){
			return n;
		}
		
		
		return fib(n - 1) + fib(n - 2);
		
	}
	public static void main(String[] args) {
		int n = 50;
		System.out.println(fib(n));
	}

}
