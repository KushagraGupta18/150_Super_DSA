package _18_Graph;

import java.util.*;

public class _8_Kruskals_Algo {
//0-1-MST
	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _8_Kruskals_Algo(int v){
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {	//v-->no. of vertex
			map.put(i, new HashMap<>());
		}
	}
	public void AddEdge(int v1, int v2,int cost) {
		map.get(v1).put(v2, cost);//v1-->map get kra then put v2 and cost
		map.get(v2).put(v1, cost);//v2-->map get kra then put v1 and cost
	}
	
	
	public class EdgePair{
		int e1;
		int e2;
		int cost;
		public EdgePair(int e1,int e2,int cost) {
			this.e1=e1;
			this.e2=e2;
			this.cost=cost;	
		}
		@Override
		public String toString() {
			return e1+" - "+e2+" @ "+cost;
		}
	}
	
	public ArrayList<EdgePair> getAllEdge(){
		ArrayList<EdgePair> list=new ArrayList<>();
		for(int e1:map.keySet()) {
			for(int e2:map.get(e1).keySet()) {
				EdgePair eg=new EdgePair(e1,e2,map.get(e1).get(e2));
				list.add(eg);
			}
		}
		return list;
	}
	public void kruskalAlgo() {
		int ans=0;
		_7_DSU ds=new _7_DSU();
		for(int k:map.keySet()) {
			ds.createSet(k);
		}
		ArrayList<EdgePair> ll=getAllEdge();
		Collections.sort(ll,new Comparator<EdgePair>() {
			@Override
			public int compare(EdgePair o1, EdgePair o2) {
				return o1.cost - o2.cost;
			}
		});
		for(EdgePair edge:ll ) {
			int e1=edge.e1;
			int e2=edge.e2;
			int re1=ds.find(e1);
			int re2=ds.find(e2);
			if(re1==re2) {
				//nothing(because representative element of both is same if we add this edge then our graph will be cyclic)
			}
			else {
				System.out.println(edge);
				ans+=edge.cost;
				ds.union(re1, re2);
			}
		}
		System.out.println(ans);
	}
	
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();//no of vertex
		_8_Kruskals_Algo ks=new _8_Kruskals_Algo(n);
		int m=sc.nextInt();//no. of edges
		for(int i=0;i<m;i++) {
			int v1=sc.nextInt();
			int v2=sc.nextInt();
			int cost=sc.nextInt();
			ks.AddEdge(v1, v2, cost);
		}
		ks.kruskalAlgo();
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

//ans--->17




