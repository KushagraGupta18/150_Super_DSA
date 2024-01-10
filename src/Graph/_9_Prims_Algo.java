package Graph;

import java.util.*;

public class _9_Prims_Algo {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _9_Prims_Algo(int v){
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {	//v-->no. of vertex
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2,int cost) {
		map.get(v1).put(v2, cost);//v1-->map get kra then put v2 and cost
		map.get(v2).put(v1, cost);//v2-->map get kra then put v1 and cost
	}
	
	public class PrimsPair{
		int vtx;
		int acqvtx;
		int cost;
		public PrimsPair(int vtx,int acqvtx,int cost) {
			this.vtx=vtx;
			this.acqvtx=acqvtx;
			this.cost=cost;//this.cost-->class ka data member hai and cost constructor ke andr local variable hai 
		}
		public String toString() {
			return this.vtx+" via "+this.acqvtx+" @ "+this.cost;
		}
	}
	
	public void primsAlgo() {
		int ans=0;
		PriorityQueue<PrimsPair> pq=new PriorityQueue<PrimsPair>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair p1, PrimsPair p2) {
				return p1.cost-p2.cost;//for asscending order sort
			}
		});
		HashSet<Integer> visited=new HashSet<>();
		pq.add(new PrimsPair(1,1,0));
		while(!pq.isEmpty()) {
			//remove
			PrimsPair pp=pq.poll();
			
			//ignore
			if(visited.contains(pp.vtx)) {
				continue;
			}
			
			//visited
			visited.add(pp.vtx);
			
			//print
			System.out.println(pp);
			ans+=pp.cost;
			//nbrs
			for(int nbrs:map.get(pp.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					PrimsPair np=new PrimsPair(nbrs,pp.vtx,map.get(pp.vtx).get(nbrs));
					pq.add(np);
				}
			}
		}
		System.out.println(ans);
	}
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//no of vertex
		_9_Prims_Algo pm=new _9_Prims_Algo(n);
		int m=sc.nextInt();//no. of edges
		for(int i=0;i<m;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int cost=sc.nextInt();
			pm.AddEdge(v1, v2, cost);
		}
		pm.primsAlgo();
	}

}


//input
//4
//5
//1 2 10
//2 3 15
//1 3 5
//4 2 2
//4 3 40

//output--->17