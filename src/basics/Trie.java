package basics;

public class Trie {
	
	static class node{
		node arr[] = new node[26];
		boolean compelete = false;
	}
	
	public static void insert(String word, node root) {
		int n = word.length();
		for(int i = 0;i<n;i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if(root.arr[index]==null) {
//				create new node here
				node newNode = new node();
				root.arr[index] = newNode;
				root = newNode;
			}
			else {
//				move here
				root = root.arr[index];
			}
		}
		root.compelete = true;
	}
	
	public static boolean check(String word, node root) {
		for(int i = 0;i<word.length();i++) {
			int index = word.charAt(i) - 'a';
			if(root.arr[index]==null) {
				return false;
			}
			else {
				root = root.arr[index];
			}
		}
//		check if this is leaf node
		if(root.compelete==true)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		node root = new node();
		insert("samyak", root);
		insert("samy", root);
		System.out.println(check("samy", root));;
		
	}
	
}
