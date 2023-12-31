package Binary_search_tree;

public class BST_implementation {

	public class Node{
		int data;
		Node left;
		Node right;
	}
	
	private Node root;
	
	public BST_implementation(int[] in) {
		
		this.root=createTree(in,0 , in.length-1);

	}

	private Node createTree(int[] in, int si, int ei) {
		if(si>ei) {
			return null;
		}
		int mid=(si+ei)/2;
		Node nn=new Node();
		nn.data=in[mid];
		nn.left=createTree(in, si, mid-1);
		nn.right=createTree(in, mid+1,ei);
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
	
	
	public static void main(String[] args) {
		int[] arry= {10,20,30,40,50,60,70,80};
		BST_implementation bst=new BST_implementation(arry);
		bst.display();
	}
	

}
