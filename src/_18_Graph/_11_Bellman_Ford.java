package _18_Graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _11_Bellman_Ford {

	
HashMap<Integer, HashMap<Integer, Integer>> map;
	
	public _11_Bellman_Ford(int v) {
		map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());
		}
	}

	public void AddEdge(int v1, int v2, int cost) {
		map.get(v1).put(v2, cost);//only v1 se v2 ke beech mai edge
		//map.get(v2).put(v1, cost);		(for directed graph)

	}
	class EdgePair{
		int e1;
		int e2;
		int cost;
		public EdgePair(int e1, int e2, int cost) {
			this.e1=e1;
			this.e2=e2;
			this.cost=cost;
		}
		@Override
		public String toString() {
			return this.e1+" "+this.e2+" @ "+this.cost;
		}
		
	}
	public List<EdgePair> GetAllEdge(){
		List<EdgePair> ll=new ArrayList<>();
		for(int e1:map.keySet()) {
			for(int e2:map.get(e1).keySet()) {
				int cost=map.get(e1).get(e2);
				ll.add(new EdgePair(e1,e2,cost));
			}
		}
		return ll;
	}
	
	public void BellMan() {
		List<EdgePair> ll=GetAllEdge();
		int v=map.size();
		int[] dis=new int[v+1];
		for(int i=2;i<dis.length;i++) {
			dis[i]=10000000;//we do not put max value due to overflow condition
		}
		//relax v-1 times
		for(int i=1;i<=v;i++) {//relax one more time to check is there any changes in our array . if there any changes then our graph is negative weight cycle
			for(EdgePair e:ll) {
				int e1=e.e1;
				int e2=e.e2;
				int oldcost=dis[e2];
				int newcost=dis[e1]+e.cost;
				if(i==v && newcost<oldcost) {
					System.out.println("-ive weight ka cycle hai");
					return;
				}
				if(oldcost>newcost) {
					dis[e2]=newcost;
				}
			}
		}
		for(int i=1;i<dis.length;i++) {
			System.out.print(dis[i]+" ");
		}
	}
	public static void main(String[] args){
		_11_Bellman_Ford bfd=new _11_Bellman_Ford(5);
		bfd.AddEdge(1, 2, 8);
//		bfd.AddEdge(2, 5, -2);			//for -ve weight weight cycle
		bfd.AddEdge(2, 5, 2);
		bfd.AddEdge(5, 2, 1);
		bfd.AddEdge(4, 5, 4);
		bfd.AddEdge(3, 4, -3);
		bfd.AddEdge(1, 3, 4);
		bfd.AddEdge(1, 4,5);
		bfd.BellMan();
		
	}
	
	
	
}


