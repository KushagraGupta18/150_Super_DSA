package Binary_Tree;
import java.util.*;
public class Binary_tree_implementation {
	Scanner sc=new Scanner(System.in);
	class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	public Binary_tree_implementation(){
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
	
	
	public void display() {
		display(this.root);
	}
	private void display(Node nn) {
		if(nn==null) {
			return;
		}
		String str="";
		int data=nn.data;
		str="<---"+data+"--->";
		if(nn.left!=null) {
			str=nn.left.data+str;
		}
		else {
			str="."+str;
		}
		if(nn.right!=null) {
			str=str+nn.right.data;
		}
		else {
			str=str+".";
		}
		System.out.println(str);
		display(nn.left);	//visit left sub tree
		display(nn.right);	//visit right sub tree
		
	}

	
	public int min() {
		return min(this.root);
	}
	private int min(Node nn) {
		if(nn==null) {
			return Integer.MAX_VALUE;
		}
		int lmin=min(nn.left);
		int rmin=min(nn.right);
		return Math.min(lmin, Math.min(rmin, nn.data));
	}
	
	
	public int max() {
		return max(this.root);
	}
	private int max(Node nn) {
		if(nn==null) {
			return Integer.MIN_VALUE;
		}
		int lmax=max(nn.left);
		int rmax=max(nn.right);
		return Math.max(lmax, Math.max(rmax, nn.data));
	}
	
	
	public boolean find(int item) {
		return find(this.root,item);
	}
	private boolean find(Node nn, int item) {
		if(nn==null) {
			return false;
		}
		if(nn.data==item) {
			return true;
		}
		return find(nn.left,item)|| find(nn.right,item);
	}
	
	
	public int height() {
		return height(this.root);
	}	
	private int height(Node nn) {
		if(nn==null) {
			return -1;
		}
		int lht=height(nn.left);	//let height of single node is 0
		int rht=height(nn.right);
		return Math.max(lht, rht)+1;
	}
	
	
	
	
	
	public static void main(String[] args) {
		Binary_tree_implementation bt=new Binary_tree_implementation();
		//input ---> 10 true 20 true 70 false false false true 90 false true 11 false false
		bt.display();
		System.out.println(bt.min());
		System.out.println(bt.max());
		System.out.println(bt.find(30));
		System.out.println(bt.find(90));
		System.out.println(bt.height());
		
	}
}
