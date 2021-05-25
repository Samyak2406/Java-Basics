package basics;
import java.util.*;

public class AllSubsequences {
	
	static Set<String> set = new HashSet<String>();
	
	public static void rec(String s, int index, String word) {
//		System.out.println(word);
		set.add(word);
		int n=s.length(), left = n-index-1;
		if(left<=0)
			return;
//		there are 2 cases
		
		rec(s, index+1, word);
		rec(s, index+1, word+s.charAt(index));
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		String word = "";
		for(int i=0;i<input.length();i++) {
			word+=input.charAt(i);
			rec(input, i+1, word);
		}
		System.out.println(set);
	}
}
