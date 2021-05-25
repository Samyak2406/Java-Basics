package basics;

import java.util.*;

public class sieve {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SOE(n);
	}
	
	public static void SOE(int n) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.add(2);
		boolean isp[] = new boolean[n];
		
		for(int i = 0; i<n;i++) {
			if(i==0) {
				isp[0] = false;
				continue;
			}
			isp[i] = true;
		}
		for(int i = 2; i*i<n;i++) {
			if(isp[i-1]==true) {
				for(int j = i*i; j<=n; j+=i) {
					isp[j-1] = false;
				}
			}
		}
		for(int i=0;i<n;i++) {
			if(isp[i])
				System.out.println(i+1);
		}
	}
	
}
