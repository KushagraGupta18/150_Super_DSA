package _4_ArrayList;
import java.util.*;
public class _2_Intro_ArrayList {

	public static void main(String[] args) {
	
		//By this line bydefault array is created of size 10. And we can only access those elements that are stored in arraylist.
		//if we add 3 element in array than we can only access 0 to size-1 index. thats why we can say that we are add elements in Arraylist contiguously.
		//After filling 10 elements in arraylist. Our array is fully filled and then our array is resize its capacity by (oldcap+oldcap/2)+1 that is (10+10/2)+1=16 . Now capacity of arraylist is 16
		
		
		ArrayList<Integer> list=new ArrayList<>();//by this line an empty list is made in heap
				//Always use wrapper class or any other class in these brackets . Never use primitive datatype
		System.out.println(list);
		 
		
		//add
		list.add(10);
		list.add(20);
		System.out.println(list);
		
		//add at index(range of index is 0 to size)
		list.add(0,30);
		System.out.println(list);
		
		//set-->update the value at particular index
		list.set(0, 5);//we pass two parameters index and value
		System.out.println(list);
		
		//size
		System.out.println(list.size());
		
		
		//delete(range 0 to size-1)
		System.out.println(list.remove(1));
		System.out.println(list);
	
		
		//get(range 0 to size-1)
		System.out.println(list.get(0));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}
	
		System.out.println();
		
		
		
		//For each loop
		for(int item:list) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		int[] arr= {10,20,30};
		for(int item:arr) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		
		int[][] ar= {{10,20,30},{40,50,60},{20,70,80}};
		for(int[] a:ar) {
			for(int item:a) {
				System.out.print(item+" ");
			}
			System.out.println();
		}
		
		//user input in arraylist
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> ll=new ArrayList<>();
		for(int i=0;i<3;i++) {
			ll.add(sc.nextInt());
		}
		System.out.println(ll);
		
		//sort
		Collections.sort(ll);
		System.out.println(ll);
		
	}
	
}
