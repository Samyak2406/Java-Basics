package basics;
import java.util.*;

public class fibonacci {
	static long dp[];
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n<=0)
			return;
		dp = new long[Math.max(2, n)];
			dp[0] = 0;
			dp[1] = 1;
		long ans = fibR(n);		
		System.out.println(ans);
//		0 1 1 2 3 5
	}
	
	public static long fibR(int n) {
//		System.out.println(n);
		if(n<=2) {
			return dp[n-1];
		}
		else if(dp[n-1]!=0)
			return dp[n-1];
		else {
			return dp[n-1] = fibR(n-1) + fibR(n-2);
		}
			
	}
}
