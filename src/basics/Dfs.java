package basics;
import java.util.*;

public class Dfs {
	
	static Vector<Vector<Integer>> v;
	static boolean visited[];
	
	public static void addEdge(int a, int b) {
		if(a==b)
			return;
		(v.get(a)).add(b);
		(v.get(b)).add(a);
	}
	
	public static void traverse(int index) {
		System.out.println(index);
		Vector<Integer> allV = v.get(index);
		visited[index] = true;
		int n = allV.size();
		for(int i = 0;i<n;i++) {
			if(visited[allV.get(i)]==true)
				continue;
			traverse(allV.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		int n = 4;
		v = new Vector<Vector<Integer>>(n);
		visited = new boolean[n];
		for(int i = 0;i<n;i++)
			v.add(new Vector<Integer>());
		addEdge(0, 1);
		addEdge(1, 3);
		addEdge(3, 2);
//		addEdge(2, 3);
//		addEdge(3, 3);
////		System.out.println(v);
		traverse(0);		
	}
	
}
