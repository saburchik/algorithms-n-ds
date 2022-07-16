import java.util.Arrays;

public class Fibonacci {

	public static void main(String[] args) {
		int n = 10;
		long[] mem = new long[n+1];
		
		Arrays.fill(mem, -1);
		
		System.out.println(fibEffectiv(100));
	}
	
	// == So slowly example:
	// O(2^n)
	private static long fibNaive(int n) {
		if(n <= 1)
			return n;
		return fibNaive(n-1) + fibNaive(n-2);
	}
	// == Already better, than above example:
	private static long fibNaiveCorrect(int n, long[] mem) {
		if(mem[n] != -1)
			return mem[n];
		if(n <= 1)
			return n;
		long result = fibNaiveCorrect(n-1, mem) + fibNaiveCorrect(n-2, mem);
		mem[n] = result;
		return result;
	}
	// == So fast example, but here we're use more memory;
	// == Also, it's linear algorithm:
	// == O(n)
	private static long fibEffectiv(int n) {
		// O(n)
		long[] arr = new long[n+1];
		arr[0] = 0;
		arr[1] = 1;
		// n= 2 => 1
		// n= 3 => 2
		// n= 4 => 3
		
		// O(n+n) => O(2n) => O(n)
		
		for(int i = 2; i<=n; i++) 
			arr[i] = arr[i-1] + arr[i-2];
		return arr[n];
	}

}
