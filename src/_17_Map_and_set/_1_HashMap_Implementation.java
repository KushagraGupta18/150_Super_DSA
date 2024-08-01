package _17_Map_and_set;
import java.util.*;
public class _1_HashMap_Implementation<K,V> {

	public class Node{
		K key;
		V value;
		Node next;
		public Node() {
			// TODO Auto-generated constructor stub
		}
		public Node(K key, V value){
			this.key=key;
			this.value=value;
		}
	}
	
	private ArrayList<Node> bucketarr;
	private int size;
	
	public _1_HashMap_Implementation(int x) {
		this.bucketarr=new ArrayList<>();
		for(int i=0;i<x;i++){
			this.bucketarr.add(null);
		}
	}
	
	public _1_HashMap_Implementation() {
		this(4);	//by default 4 size bucketarr
	}
	
	
	
	public void put(K key, V value) {
		int bn=hashfunction(key);
		Node temp=this.bucketarr.get(bn);//particular bucket first node address
		while(temp!=null) {
			if(temp.key.equals(key)) {
				temp.value=value;
				return;
			}
			temp=temp.next;
		}
		Node nn=new Node(key,value);
		temp=this.bucketarr.get(bn);
		nn.next=temp;
		this.bucketarr.set(bn, nn);
		this.size++;
		double lf=(1.0*this.size)/this.bucketarr.size();
		double thf=2.0;
		if(lf>thf) {
			rehashing();
		}
	}
	
	
	private void rehashing() {
		ArrayList<Node> nba=new ArrayList<>();	//nba--->newbucketarr
		for(int i=0;i<this.bucketarr.size()*2;i++) {
			nba.add(null);
		}
		ArrayList<Node> oba=this.bucketarr;		//oba---->oldbucketarr
		this.bucketarr=nba;
		this.size=0;
		for(Node node:oba) {
			while(node!=null) {
				put(node.key,node.value);
				node=node.next;
			}
		}
	}

	public V get(K key) {
		int bn=hashfunction(key);
		Node temp=this.bucketarr.get(bn);//particular bucket first node address
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return temp.value;
			}
			temp=temp.next;
		}
		return null;
	}
	
	public boolean containsKey(K key) {
		int bn=hashfunction(key);
		Node temp=this.bucketarr.get(bn);//particular bucket first node address
		while(temp!=null) {
			if(temp.key.equals(key)) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}
	
	
	public V remove(K key) {
		int bn=hashfunction(key);
		Node temp=this.bucketarr.get(bn);//particular bucket first node address
		
		Node prev=null;
		Node curr=temp;
		while(curr!=null) {
			if(curr.key.equals(key)) {
				break;
			}
			prev=curr;
			curr=curr.next;
		}
		if(curr==null) {	//if data nhi mila hai
			return null;
		}
		this.size--;
		if(prev==null) {
			this.bucketarr.set(bn,curr.next);
			curr.next=null;
		}
		else {
			prev.next=curr.next;
			curr.next=null;
		}
		return curr.value;
	}
	
	@Override
	public String toString() {
		String s="{";
		for(Node node:bucketarr) {
			while(node!=null) {
				s=s+"{ "+ node.key+"="+node.value+"}, ";
				node=node.next;
			}
		}
		s+="}";
		return s;
	}
	
	public int hashfunction(K key) {
		int bn=key.hashCode()%this.bucketarr.size();
		if(bn<0) {
			bn+=this.bucketarr.size();//for positive remainder
		}
		return bn;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		_1_HashMap_Implementation<String, Integer> map=new _1_HashMap_Implementation<>();
		map.put("Riya", 90);
		map.put("Nitish", 77);
		map.put("Akash", 67);
		map.put("Zaid", 76);
		map.put("Omika", 88);
		map.put("Puneet", 77);
		System.out.println(map);
		map.put("Omika", 8);
		System.out.println(map);
		
		System.out.println(map.get("Raj"));
		System.out.println(map.get("Riya"));
		System.out.println(map.get("Omika"));
		
		System.out.println(map.containsKey("Raj"));
		System.out.println(map.containsKey("Riya"));
		System.out.println(map.containsKey("Omika"));
		
		System.out.println(map.remove("Raj"));
		System.out.println(map);
		System.out.println(map.remove("Riya"));
		System.out.println(map);
		System.out.println(map.remove("Omika"));
		System.out.println(map);
		
	}
	
	
	
}
