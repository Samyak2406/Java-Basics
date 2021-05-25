package basics;
import java.util.*;

public class WordFrequency {
	public static void main(String args[]) {
		Vector<String> words = new Vector<>(); 
		Scanner sc = new Scanner(System.in);
		String inp = sc.nextLine();
//		System.out.println(inp);
		Map<String, Integer> m = new TreeMap<String, Integer>();
		String word = "";
		for(int i = 0; i<inp.length();i++) {
			if(inp.charAt(i) == ' ' || i+1 == inp.length()) {
				if(i+1 == inp.length() && inp.charAt(i)!=' ')
					word+=inp.charAt(i);
				if(word!="") {
					System.out.println(word);
					if(m.containsKey(word)) {
						m.put(word, m.get(word)+1);
					}
					else {
						m.put(word, 1);
					}
				}
				word = "";
			}
			else {
				word += inp.charAt(i);
			}
		}
//		print all key value pair here
		System.out.println(m);
	}
}
