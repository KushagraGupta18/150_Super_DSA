package _13_Binary_Tree;

import java.util.LinkedList;
import java.util.Scanner;

public class _2_Binary_tree_Traversal {

	Scanner sc=new Scanner(System.in);
	class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public _2_Binary_tree_Traversal(){
		this.root=createTree();
	}
	private Node createTree() {
		Node nn=new Node();
		int item=sc.nextInt();
		nn.data=item;
		Boolean hlc=sc.nextBoolean();
		if(hlc==true) {//has left child-->hlc
			nn.left=createTree();
		}
		Boolean hrc=sc.nextBoolean();
		if(hrc==true) {	//has right child--->hrc
			nn.right=createTree();
		}
		return nn;
	}
	
	
	public void preorder() {
		preorder(this.root);
		System.out.println();
	}
	private void preorder(Node nn) {
		if(nn==null) {
			return;
		}
	
		System.out.print(nn.data+" ");
		preorder(nn.left);
		preorder(nn.right);
	}
	
	
	public void postorder() {
		postorder(this.root);
		System.out.println();
	}
	private void postorder(Node nn) {
		if(nn==null) {
			return;
		}
	
		postorder(nn.left);
		postorder(nn.right);
		System.out.print(nn.data+" ");
	}
	
	
	public void inorder() {
		inorder(this.root);
		System.out.println();
	}
	private void inorder(Node nn) {
		if(nn==null) {
			return;
		}
		
		inorder(nn.left);
		System.out.print(nn.data+" ");
		inorder(nn.right);
	}
	
	
	public void levelorder() {
		levelorder(this.root);
		System.out.println();
	}
	private void levelorder(Node nn) {
		LinkedList<Node> queue=new LinkedList<>();
		//Queue<Node> queue=new LinkedList<>();(inheritance)
		queue.add(nn);	//add last
		while(!queue.isEmpty()) {
			Node rv=queue.remove();		//remove first
			System.out.print(rv.data+" ");
			if(rv.left!=null) {
				queue.add(rv.left);
			}
			if(rv.right!=null) {
				queue.add(rv.right);
			}
		}
		
	}

	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		_2_Binary_tree_Traversal bt=new _2_Binary_tree_Traversal();
		//input ---> 10 true 20 true 70 false false false true 90 false true 11 false false
		bt.preorder();
		bt.postorder();
		bt.inorder();
		bt.levelorder();
	}
	
	
}
