package basics;
import java.util.*;

public class Bfs {
	
	static Vector<Vector<Integer>> v;
	
	public static void addEdge(int a, int b) {
		if(a==b)
			return;
		(v.get(a)).add(b);
//		(v.get(b)).add(a); // For directed graph
	}
	
	public static void traverse(int index, int n) {
		boolean visited[] = new boolean[n];
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(index);
		visited[index] = true;
		while(q.size()>0) {
			int element = q.peek();
			System.out.println(element);
			q.remove();
			Vector<Integer> neighbours = v.get(element);
			
			for(int i = 0; i<neighbours.size();i++) {
//				for every vertex add their neighbours as they are at same height from the index
				if(!visited[neighbours.get(i)]) {
					q.add(neighbours.get(i));
				}
				visited[neighbours.get(i)] = true;
			}
		}
	}
	
	public static void main(String[] args) {
		int n = 4;
		v = new Vector<Vector<Integer>>();
		
		for(int i = 0;i<n;i++) {
			v.add(new Vector<Integer>());
		}
		addEdge(0, 1);
		addEdge(0, 2);
		addEdge(1, 2);
		addEdge(2, 0);
		addEdge(2, 3);
		
		traverse(2, n);
			
	}
}
