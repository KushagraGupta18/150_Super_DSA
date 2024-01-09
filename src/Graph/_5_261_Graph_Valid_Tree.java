//leetcode question number--->261
package Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

public class _5_261_Graph_Valid_Tree {
	//for a valid tree graph should be acyclic and connected(component ==1)
	public static void main(String[] args) {
		int n=4;
		int[][] edges= {{0,1},{0,2},{0,3},{1,4}};
		System.out.println(validTree(n,edges));
		
	}
	public static boolean validTree(int n , int[][] edges) {
		HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
		for(int i=0;i<=n;i++) {	//n-->no. of vertex
			map.put(i, new HashMap<>());
		}
		for(int i=0;i<edges.length;i++) {
			int v1=edges[i][0];
			int v2=edges[i][1];
			map.get(v1).put(v2, 0);//cost kuch bhi daaldo because undirected unweighted graph hai
			map.get(v2).put(v1, 0);
		}
		return isTree(map);
	}
	public static boolean isTree(HashMap<Integer, HashMap<Integer,Integer>> map) {
		
		Stack<Integer> st=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		int count=0;
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			st.push(src);
			while(!st.isEmpty()) {
				//remove
				int r=st.pop();
				//ignore(if already visited)
				if(visited.contains(r)) {		//this tells us graph contains cycle
					return false;//this will show graph contains cycle or not
				}
				//visited mark
				visited.add(r);
				//Self work
//				System.out.print(r+" ");
				//nbrs add krna
				for(int nbrs:map.get(r).keySet()) {
					if(!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
			count++;
		}
		return count==1;
	}

}
