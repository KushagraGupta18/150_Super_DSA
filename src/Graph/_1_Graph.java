package Graph;

import java.util.HashMap;

public class _1_Graph {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _1_Graph(int v){
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {	//v-->no. of vertex
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2,int cost) {
		map.get(v1).put(v2, cost);//v1-->map get kra then put v2 and cost
		map.get(v2).put(v1, cost);//v2-->map get kra then put v1 and cost
	}
	
	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2)	&& map.get(v2).containsKey(v1);
	}
	
	public boolean ContainsVertex(int v1) {
		return map.containsKey(v1);
	}
	
	public int noofedges() {
		int sum=0;
		for(int key:map.keySet()) {
			sum=sum+map.get(key).size();
		}
		return sum/2;
	}
	
	public void removeedge(int v1, int v2) {
		if(ContainsEdge(v1, v2)) {
			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}
	}
	
	public void removevertex(int v1) {
		for(int item:map.get(v1).keySet()) {
//			removeedge(item,v1);//jis item pr kaam kr rha hai ye removeedge ussi ko delete maar rha tha..... Same time pr ye kaam nhi ho skta
			map.get(item).remove(v1);
		}
		map.remove(v1);
	}
	
	public void display() {
		for(int item:map.keySet()) {
			System.out.println(item + "--->" +map.get(item));
		}
	}
	    
	
	public static void main(String[] args) {
		_1_Graph g=new _1_Graph(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.display();
		System.out.println(g.noofedges());
		g.removeedge(4, 5);
		g.removevertex(4);
		g.display();
		
	}
	
	
}
