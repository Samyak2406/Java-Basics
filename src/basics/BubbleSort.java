package basics;
import java.util.*;

public class BubbleSort {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vector<Integer> v = new Vector<Integer>();
		for(int i = 0;i<n;i++)
			v.add(sc.nextInt());
		for(int i = 0;i<n;i++) {
			for(int j = i+1;j<n;j++) {
				if(v.get(j)<v.get(i)) {
					Collections.swap(v, i, j);
				}
			}
		}
		System.out.println(v);
	}
}
