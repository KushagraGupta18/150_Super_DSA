package _15_OOPS_2;
//Comparable
//comparable mai jha class likhte hai vhi usse implement kr skte hai bs but comparator mai class likhne ke baad bhi alag se implement kr skte hai
public class _4_Cars implements Comparable<_4_Cars>{
	int price;
	int speed;
	String color;
	
	public _4_Cars(){
		
	}
	public _4_Cars(int price, int speed,String color) {
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
		_4_Cars[] car=new _4_Cars[5];
//		System.out.println(car[1]);//null
		car[0] = new _4_Cars(200, 10, "White");// price speed color
		car[1] = new _4_Cars(1000, 20, "Black");
		car[2] = new _4_Cars(345, 3, "Yellow");
		car[3] = new _4_Cars(34, 89, "Grey");
		car[4] = new _4_Cars(8907, 6, "Red");
		display(car);
		sort(car);
		System.out.println("************************************");
		display(car);
	}
	
	public static void display(_4_Cars[] car) {
		for (int i = 0; i < car.length; i++) {
			System.out.println(car[i]+" ");
		}
	}
	
	
	public static<T extends Comparable<T>> void sort(T[] arr) {	//by extends we set the boundary for comparable
		//pass
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length-turn; i++) {
				if(arr[i].compareTo(arr[i+1])>0) {
					T t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
	}
	
	@Override
	public int compareTo(_4_Cars o) {
		// TODO Auto-generated method stub
		return this.speed-o.speed;	//speed
//		return o.price-this.price;	//price
//		return this.color.compareTo(o.color);
	}
}
