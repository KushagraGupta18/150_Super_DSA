package Graph;

import java.util.HashMap;

public class _12_Topological_Sort {

	//Kahn's Algorithm
		HashMap<Integer, HashMap<Integer, Integer>> map=new HashMap<>();
		public _12_Topological_Sort(int v) {
			for(int i=1;i<=v;i++) {
				map.put(i, new HashMap<>());
			}
		}
		public void AddEdge(int v1 ,int v2) {//Add edge
			map.get(v1).put(v2, 0);//v1--->v2 (unweighted )
			
		}
}
