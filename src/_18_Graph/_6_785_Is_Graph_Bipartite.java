package _18_Graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class _6_785_Is_Graph_Bipartite {

	public static void main(String[] args) {
		int[][]graph = {{1,2,3},{0,2},{0,1,3},{0,2}};
		System.out.println(isBipartite(graph));
	}
	
	public static boolean isBipartite(int[][] graph) {
		HashMap<Integer, HashMap<Integer,Integer>> map=new HashMap<>();
		for(int i=0;i<graph.length;i++) {	//n-->no. of vertex
			map.put(i, new HashMap<>());
		}
		
		for(int i=0;i<graph.length;i++) {
			for (int j = 0; j < graph[i].length; j++) {
				map.get(i).put(graph[i][j],0);
			}
		}
		
		return isBipartiteBST(map);
    }
	public static boolean isBipartiteBST(HashMap<Integer, HashMap<Integer,Integer>> map) {
		
		Queue<pair> qq=new LinkedList<>();
		HashMap<Integer,Integer> visited=new HashMap<>();
		for(int src:map.keySet()) {
			if(visited.containsKey(src)) {
				continue;
			}
			pair bp=new pair(src,0);
			qq.add(bp);
			while(!qq.isEmpty()) {
				//remove
				pair r=qq.remove();
				//ignore(if already visited) and check for length of cycle
				if(visited.containsKey(r.vtx) && r.d!=visited.get(r.vtx)) {		//this tells us graph contains cycle
					//check 
					return false;
				}
				//visited mark
				visited.put(r.vtx,r.d);
				//Self work
//				System.out.print(r+" ");
				//nbrs add krna
				for(int nbrs:map.get(r.vtx).keySet()) {
					if(!visited.containsKey(nbrs)) {
						pair nbp=new pair(nbrs,r.d+1);
						qq.add(nbp);
					}
				}
			}
		}
		return true;//if graph is acyclic
	}

}
class pair{
	int vtx;
	int d;
	public pair(int vt, int d) {
		this.vtx=vt;
		this.d=d;
	}
}
