package basics;

public class ZeroOneKnapsack {
	
	public static void main(String[] args) {
		int weights[] = {1, 2, 3}, values[] = {10, 15, 40};
		int bag = 6;
		
		int wsize = weights.length, vsize = values.length;
		
		int dp[][] = new int[wsize+1][bag+1];
		
		for(int i = 1; i<=wsize;i++) {
			for(int j=1;j<=bag;j++) {
//				choice 1 -> Take the element
				int val1= dp[i-1][j];
//				choice 2 -> Dont take it choose prev choice
				int val2 = 0;
				if(weights[i-1]<=j) {
					 val2 = values[i-1] + dp[i-1][j - weights[i-1]];
				}
				
				dp[i][j] = Math.max(val1, val2); //Select the better one
//				System.out.println(dp[i][j]);
			}
		}
		System.out.println(dp[wsize][bag]);
		
	}
}
