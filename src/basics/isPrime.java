package basics;

import java.util.*;

public class isPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = true;
		for(int i=2;i<Math.sqrt(n);i++) {
			if(n%i==0) {
				ans=false;
			}
		}
		if(n<2)
			ans = false;
		System.out.println(ans);
	}
}
