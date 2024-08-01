package _15_OOPS_2;
//Comparator
import java.util.Arrays;
import java.util.Comparator;

public class _5_Cars{
	int price;
	int speed;
	String color;
	
	public _5_Cars(){
		
	}
	public _5_Cars(int price, int speed,String color) {
		this.price=price;
		this.speed=speed;
		this.color=color;
	}
	
	@Override
	public String toString() {
		return "P : " + this.price + " S: " + this.speed + " C:" + this.color;
	}
	
	
	
	
	public static void main(String[] args) {
		
//		int[] arr=new int[7];
		_5_Cars[] car=new _5_Cars[5];
//		System.out.println(car[1]);//null
		car[0] = new _5_Cars(200, 10, "White");// price speed color
		car[1] = new _5_Cars(1000, 20, "Black");
		car[2] = new _5_Cars(345, 3, "Yellow");
		car[3] = new _5_Cars(34, 89, "Grey");
		car[4] = new _5_Cars(8907, 6, "Red");
		display(car);
//		sort(car,new carComparatorSpeed());
//		sort(car,new carComparatorPrice());
//		sort(car,new carComparatorColor());
		Arrays.sort(car,new Comparator<_5_Cars>() {

			@Override
			public int compare(_5_Cars o1, _5_Cars o2) {
				// TODO Auto-generated method stub
				return o1.speed-o2.speed;
			}
			
		});
		
		System.out.println("************************************");
		display(car);
	}
	
	public static void display(_5_Cars[] car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]+" ");
		}
	}
	
	
	
	public static<T> void sort(T[] arr,Comparator<T> camp) {	//by extends we set the boundary for comparable
		//pass
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length-turn; i++) {
				if(camp.compare(arr[i],arr[i+1])>0) {
					T t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
	}
	
}
class carComparatorSpeed implements Comparator<_5_Cars>{
	@Override
	public int compare(_5_Cars o1, _5_Cars o2) {
		// TODO Auto-generated method stub
		return o1.speed-o2.speed;
	}
	
	
}
class carComparatorPrice implements Comparator<_5_Cars>{
	@Override
	public int compare(_5_Cars o1, _5_Cars o2) {
		// TODO Auto-generated method stub
		return o2.price-o1.price;
	}
	
}
class carComparatorColor implements Comparator<_5_Cars>{
	@Override
	public int compare(_5_Cars o1, _5_Cars o2) {
		// TODO Auto-generated method stub
		return o1.color.compareTo(o2.color);
	}
	
}