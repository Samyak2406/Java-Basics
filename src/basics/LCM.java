package basics;

public class LCM {
	
	public static int gcd(int a, int b) {
		if(a==0)
			return b;
		return gcd(b%a, a);
	}
	
	public static void main(String[] args) {
		int a = 100, b = 15;
		System.out.println(a*b/gcd(a, b));
	}
}
