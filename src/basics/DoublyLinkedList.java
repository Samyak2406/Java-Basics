package basics;

public class DoublyLinkedList {
	
	static class node{
		node prev = null;
		node next = null;
		int value;
		node(int value){
			this.value = value;
		}
	}
	
	public static node insert(node root, int value) {
		if(root == null) {
			root = new node(value);
			return root;
			
		}
		else {
			node prev = root, temp = root;
			while(temp!=null) {
				prev = temp;
				temp = temp.next;
			}
			node newNode = new node(value);
			prev.next = newNode;
			newNode.prev = prev;
			return root;
		}
	}
	
	public static node delete(node root, int value) {
		while(root!=null && root.value == value) {
			root = root.next;
			if(root == null)
				return null;
			root.prev = null;
		}
		
			node temp = root.next, prev = root;
			while(temp!=null) {
				
				if(temp.value == value) {
					if(temp.next == null) {
						prev.next = null;
						return root;
					}
					prev.next = temp.next;
					temp = temp.next;
					temp.prev = prev;
					continue;
				}
				prev = temp;
				temp = temp.next;
			}
			return root;
		}
	
	public static void print(node root) {
		while(root!=null) {
			System.out.println(root.value);
			root=root.next;
		}
	}
	
	public static void main(String[] args) {
		node root = null;
		root = insert(root, 10);
//		System.out.println(root.value);
		root = delete(root, 10);
		root = insert(root, 15);
		root = insert(root, 10);
		root = insert(root, 10);
		root = insert(root, 10);
		root = delete(root, 10);
		print(root);
		
	}
	
}
