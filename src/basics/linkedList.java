package basics;

public class linkedList {
	
	static class node{
		int value;
		node next;
		
		node(int value){
			this.value = value;
			next = null;
		}
		
	}
	
	public static node insert(int value, node root) {
		if(root==null) {
			return new node(value);
		}
		node temp = root;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next = new node(value);
		return root;
	}
	
	public static node delete(int element, node root) {
		while(root != null && root.value == element) {
//			System.out.println(root.value);
			root=root.next;
		}
		
		if(root!=null) {
			node temp = root.next;
			node prev = root;
			while(temp!=null) {
				if(temp.value == element) {
					prev.next = temp.next;
					temp = temp.next;
					continue;
				}
				prev = temp;
				temp = temp.next;
			}
		}
		return root;
	}
	
	public static void print(node root) {
		while(root!=null) {
			System.out.println(root.value);
			root = root.next;
		}
	}
	
	public static void main(String[] args) {
//		node root = new node(0);
//		System.out.println(root.value);
		node root = null;
		root = insert(10, root);
		root = insert(15, root);
//		print(root);
		root = delete(15, root);
		print(root);
//		System.out.println((root.next).value);
	}
}
