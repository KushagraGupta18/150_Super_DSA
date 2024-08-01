//leetcode question number->543



package _13_Binary_Tree;

public class _3_543_Diameter_of_a_binary_tree {

	public class TreeNode {

		int val;
		TreeNode left;
		TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
        	this.val = val;
        	this.left = left;
        	this.right = right;
        }	
	}
	
	//complexity of this code is O(n^2)
//	class Solution {
//	    public int diameterOfBinaryTree(TreeNode root) {
//	        if(root==null) {
//	        	return 0;
//	        }
//	    	int ld=diameterOfBinaryTree(root.left);	//ld--->left diameter
//	    	int rd=diameterOfBinaryTree(root.right);//rd--->right diameter
//	    	int sd=height(root.left)+height(root.right)+2;//sd--->self diameter
//	    	return Math.max(ld, Math.max(rd, sd));
//	    }
//	    private int height(TreeNode nn) {
//			if(nn==null) {
//				return -1;
//			}
//			int lht=height(nn.left);	//let height of single TreeNode is 0
//			int rht=height(nn.right);
//			return Math.max(lht, rht)+1;
//		}
//	}
	
	
	//complexity of this code is O(n)--->optimised code
	class Solution {
		public int diameter(TreeNode root) {
	        return diameterOfBinaryTree(root).diameter;
	    }
		public diapair diameterOfBinaryTree(TreeNode root) {
			if(root==null) {
				return new diapair();
			}
			diapair ldp=diameterOfBinaryTree(root.left);	//ldp--->left diapair
			diapair rdp=diameterOfBinaryTree(root.right);	//rdp--->right diapair
			diapair sdp=new diapair();						//sdp--->self diapair
			sdp.height=Math.max(ldp.height,rdp.height)+1;
			int diameter=ldp.height+rdp.height+2;			
	        sdp.diameter=Math.max(ldp.diameter,Math.max(rdp.diameter,diameter));
			return sdp;
		}
	}
	class diapair {
		int diameter=0;
		int height=-1;
	}
}

