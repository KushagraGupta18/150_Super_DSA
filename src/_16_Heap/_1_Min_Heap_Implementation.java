package _16_Heap;
import java.util.*;
public class _1_Min_Heap_Implementation {

	private ArrayList<Integer> data=new ArrayList<>();
	
	
	//add(log n)
	public void add(int item) {
		this.data.add(item);
		upheapify(this.data.size()-1);
	}
	private void upheapify(int ci) {
		int pi=(ci-1)/2;//parent index
		if(this.data.get(pi)>this.data.get(ci)) {
			swap(pi,ci);
			upheapify(pi);
		}
	}
	public void swap(int i, int j) {
		int ith=this.data.get(i);
		int jth=this.data.get(j);
		this.data.set(i, jth);
		this.data.set(j, ith);
		
	}
	
	
	//remove(log n)
	
	public int remove() {
		swap(0,this.data.size()-1);
		int rv=this.data.remove(this.data.size()-1);
		downheapify(0);
		
		return rv;
	}
	private void downheapify(int pi) {
		int lci=2*pi+1;
		int rci=2*pi+2;
		int min=pi;
		if(lci<this.data.size() && this.data.get(lci)<this.data.get(min)) {
			min=lci;
		}
		if(rci<this.data.size() && this.data.get(rci)<this.data.get(min)) {
			min=rci;
		}
		if(min!=pi) {
			swap(min,pi);
			downheapify(min);
		}	
	}
	
	public int getmin() {
		return this.data.get(0);
	}
	public int size() {
		return this.data.size();
	}
	public void display() {
		System.out.println(this.data);
	}
	public static void main(String[] args) {
		_1_Min_Heap_Implementation pq=new _1_Min_Heap_Implementation();
		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(5);
		pq.add(7);
		pq.add(3);
		pq.add(2);
		pq.add(-10);
		System.out.println(pq.getmin());
		pq.display();
		System.out.println(pq.remove());
		System.out.println(pq.remove());
		pq.display();
		
		
	}
	
}
