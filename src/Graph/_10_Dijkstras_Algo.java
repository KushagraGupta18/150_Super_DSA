package Graph;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;


public class _10_Dijkstras_Algo {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _10_Dijkstras_Algo(int v){
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {	//v-->no. of vertex
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2,int cost) {
		map.get(v1).put(v2, cost);//v1-->map get kra then put v2 and cost
		map.get(v2).put(v1, cost);//v2-->map get kra then put v1 and cost
	}
	
	public class DijkstrasPair{
		int vtx;
		String acqvtx;
		int cost;
		public DijkstrasPair(int vtx,String acqvtx,int cost) {
			this.vtx=vtx;
			this.acqvtx=acqvtx;
			this.cost=cost;//this.cost-->class ka data member hai and cost constructor ke andr local variable hai 
		}
		public String toString() {
			return this.vtx+" via "+this.acqvtx+" @ "+this.cost;
		}
	}
	
	public void dijkstrasAlgo() {
		PriorityQueue<DijkstrasPair> pq=new PriorityQueue<DijkstrasPair>(new Comparator<DijkstrasPair>() {
			@Override
			public int compare(DijkstrasPair p1, DijkstrasPair p2) {
				return p1.cost-p2.cost;//for asscending order sort
			}
		});
		HashSet<Integer> visited=new HashSet<>();
		pq.add(new DijkstrasPair(1,"1",0));
		while(!pq.isEmpty()) {
			//remove
			DijkstrasPair dp=pq.poll();
			
			//ignore
			if(visited.contains(dp.vtx)) {
				continue;
			}
			
			//visited
			visited.add(dp.vtx);
			
			//print
			System.out.println(dp);
			//nbrs
			for(int nbrs:map.get(dp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int noc=dp.cost+map.get(dp.vtx).get(nbrs);
					DijkstrasPair np=new DijkstrasPair(nbrs,dp.acqvtx+nbrs,noc);
					pq.add(np);
				}
			}
		}
	}
	public static void main(String [] args) {
		_10_Dijkstras_Algo g=new _10_Dijkstras_Algo(7);
		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		g.dijkstrasAlgo();
	}
}
