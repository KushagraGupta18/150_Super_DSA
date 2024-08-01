package _18_Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class _4_BFS_DFS_BFT_DFT {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _4_BFS_DFS_BFT_DFT(int v) {
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {	//v-->no. of vertex
			map.put(i, new HashMap<>());
		}
	}
	
	public void AddEdge(int v1, int v2,int cost) {
		map.get(v1).put(v2, cost);//v1-->map get kra then put v2 and cost
		map.get(v2).put(v1, cost);//v2-->map get kra then put v1 and cost
	}
	
	public void display() {
		for(int item:map.keySet()) {
			System.out.println(item + "--->" +map.get(item));
		}
	}
	
	public boolean BFS(int src, int des) {
		Queue<Integer> qq=new LinkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		qq.add(src);
		while(!qq.isEmpty()) {
			//remove
			int r=qq.remove();
			//ignore(if already visited)
			if(visited.contains(r)) {		//this tells us graph contains cycle
				continue;
			}
			//visited mark
			visited.add(r);
			//Self work
			if(r==des) {
				return true;
			}
			//nbrs add krna
			for(int nbrs:map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					qq.add(nbrs);
				}
			}
		}
		return false;
	}
	
	public boolean DFS(int src, int des) {
		Stack<Integer> st=new Stack<>();
		HashSet<Integer> visited=new HashSet<>();
		st.push(src);
		while(!st.isEmpty()) {
			//remove
			int r=st.pop();
			//ignore(if already visited)
			if(visited.contains(r)) {		//this tells us graph contains cycle
				continue;
			}
			//visited mark
			visited.add(r);
			//Self work
			if(r==des) {
				return true;
			}
			//nbrs add krna
			for(int nbrs:map.get(r).keySet()) {
				if(!visited.contains(nbrs)) {
					st.push(nbrs);
				}
			}
		}
		return false;
	}
	
	public int BFT() {
		Queue<Integer> qq=new LinkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		int count=0;
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			qq.add(src);
			while(!qq.isEmpty()) {
				//remove
				int r=qq.remove();
				//ignore(if already visited)
				if(visited.contains(r)) {		//this tells us graph contains cycle
					continue;
				}
				//visited mark
				visited.add(r);
				//Self work
				System.out.print(r+" ");
				//nbrs add krna
				for(int nbrs:map.get(r).keySet()) {
					if(!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}
			}
			count++;
		}
		System.out.println();
		return count;//count will return no. of connected component in the graph
	}
	
	
	public int DFT() {
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
					continue;
				}
				//visited mark
				visited.add(r);
				//Self work
				System.out.print(r+" ");
				//nbrs add krna
				for(int nbrs:map.get(r).keySet()) {
					if(!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
			}
			count++;
		}
		System.out.println();
		return count;//count will return no. of connected component in the graph
	}
	
	
	public boolean isCycle() {
		Queue<Integer> qq=new LinkedList<>();
		HashSet<Integer> visited=new HashSet<>();
		for(int src:map.keySet()) {
			if(visited.contains(src)) {
				continue;
			}
			qq.add(src);
			while(!qq.isEmpty()) {
				//remove
				int r=qq.remove();
				//ignore(if already visited)
				if(visited.contains(r)) {		//this tells us graph contains cycle
					return true;
				}
				//visited mark
				visited.add(r);
				//Self work
//				System.out.print(r+" ");
				//nbrs add krna
				for(int nbrs:map.get(r).keySet()) {
					if(!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}
			}
		}
		System.out.println();
		return false;//count will return no. of connected component in the graph
	}
	
	
	public static void main(String[] args) {
		_4_BFS_DFS_BFT_DFT g=new _4_BFS_DFS_BFT_DFT(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
//		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
//		g.display();
		System.out.println(g.BFS(1 ,6));
		System.out.println(g.DFS(1, 6));
		System.out.println(g.BFT());	////count will return no. of connected component in the graph
		//if count is 1 then our graph is connected otherwise disconnected
		System.out.println(g.DFT());
		System.out.println(g.isCycle());
	}

}
