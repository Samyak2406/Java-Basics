package basics;

public class FastPower {
	
	static int fp(int a, int b) {
		int ans = 1;
		
		while(b>0) {
			if(b%2==1)
				ans *= a;
			b/=2;
			a=a*a;
		}
		
		return ans;
	}
	
	public static void main(String[] args) {
		int a = 11, b = 20;
		System.out.println(fp(a, b));
	}
}
