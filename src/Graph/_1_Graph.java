package Graph;

import java.util.HashMap;

public class _1_Graph {

	HashMap<Integer, HashMap<Integer,Integer>> map;
	public _1_Graph(int v){
		this.map=new HashMap<>();
		for(int i=1;i<=v;i++) {
			map.put(i, new HashMap<>());
			
		}
	}
}
