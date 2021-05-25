package basics;

public class BST {
	
	static class node{
		int data;
		node left, right;
		node(int data){
			this.data = data;
		}
	}
	
	static node insert(node root, int data) {
		if(root==null) {
			root = new node(data);
			return root;
		}
		node temp = root;
		while(true) {
			if(temp.data>=data) {
				if(temp.left == null) {
					temp.left = new node(data);
					return root;
				}
				else {
					temp = temp.left;
				}
			}
			else {
				if(temp.right == null) {
					temp.right = new node(data);
					return root;
				}
				else {
					temp = temp.right;
				}
			}
		}			
	}
	
	public static void inorder(node root) {
		if(root==null)
			return;
		if(root.left!=null)
			inorder(root.left);
		System.out.println(root.data);
		if(root.right!=null)
			inorder(root.right);
	}
	
		public static void main(String[] args) {
			node root = null;
			root = insert(root, 10);
			root = insert(root, 105);
			root = insert(root, 155);
			root = insert(root, 210);
			root = insert(root, 15);
			root = insert(root, 20);
//			Sorted list
			inorder(root);
		}
}
