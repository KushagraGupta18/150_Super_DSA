package _18_Graph;

import java.util.HashMap;
import java.util.HashSet;

public class _3_print_All_Path {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _3_print_All_Path(int v) {
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
	
	public void printAllPath(int src, int des, HashSet<Integer> visited,String ans) {
		if(src==des) {
			System.out.println(ans+src);
			return;
		}
		visited.add(src);
		for(int nbrs:map.get(src).keySet()) {
			if(!visited.contains(nbrs)) {
				printAllPath(nbrs, des,visited,ans+src+" ");
			}
		}
		visited.remove(src);
	}
	
	
	public static void main(String[] args) {
		_3_print_All_Path g=new _3_print_All_Path(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.display();
		g.printAllPath(1, 6,new HashSet<>(),"");
	}
}
