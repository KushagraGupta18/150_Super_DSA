package Binary_search_tree;
import java.util.*;
public class _4_Level_Order_Traversal {

	//making tree by level order traversal(given)
	Scanner sc=new Scanner(System.in);
	
	public class Node{
		int data;
		Node left;
		Node right;
	}
	private Node root;
	
	public _4_Level_Order_Traversal() {
		createTree();
	}

	private void createTree() {
		Queue<Node> qq=new LinkedList<>();
		Node nn=new Node();
		nn.data=sc.nextInt();
		this.root=nn;
		qq.add(nn);
		while(!qq.isEmpty()) {
			Node rv=qq.remove();
			int c1=sc.nextInt();
			int c2=sc.nextInt();
			if(c1!=-1) {
				Node n=new Node();
				n.data=c1;
				rv.left=n;
				qq.add(n);
			}
			if(c2!=-1) {
				Node n=new Node();
				n.data=c2;
				rv.right=n;
				qq.add(n);
			}
		}
	}
	public void preorder() {
		preorder(this.root);
	}
	private void preorder(Node nn) {
		if(nn==null) {
			return;
		}
		System.out.print(nn.data+" ");
		preorder(nn.left);
		preorder(nn.right);
		
	}
	
	public static void main(String[] args) {
		_4_Level_Order_Traversal lot=new _4_Level_Order_Traversal();
		lot.preorder();
	}
	
	
}
