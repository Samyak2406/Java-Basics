package basics;
import java.util.*;

public class PalindromeChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		boolean ans = true;
		for(int i = 0;i<n/2;i++) {
			if(s.charAt(i)!=s.charAt(n-1-i))
				ans=false;
		}
		System.out.println("The input string is palindrome is : " + ans);
	}
}
