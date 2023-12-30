//leetcode question number--->113

package Binary_Tree;

import java.util.*;

public class _113_path_sum_2 {

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
	class Solution {
	    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
	        List<List<Integer>> list=new ArrayList<>();
	        List<Integer> curr=new ArrayList<>();
	        haspathsum(root,targetSum,list,curr);
	        return list;
	    }
	    public void haspathsum(TreeNode root, int targetSum,List<List<Integer>> list, List<Integer> curr ){
	        if(root==null){
	            return;
	        }
	        if(root.left==null && root.right==null && targetSum-root.val==0){
	            curr.add(root.val);
	            list.add(new ArrayList<>(curr));// to ensure that a new instance of the ArrayList is added to the list, 
	            curr.remove(curr.size()-1);
	        }
	        curr.add(root.val);
	        haspathsum(root.left,targetSum-root.val,list,curr);
	        haspathsum(root.right,targetSum-root.val,list,curr);
	        curr.remove(curr.size()-1);
	        return;
	    }
	           
	}
}
