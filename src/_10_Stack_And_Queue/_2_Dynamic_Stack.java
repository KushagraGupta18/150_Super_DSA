package _10_Stack_And_Queue;

public class _2_Dynamic_Stack extends _1_Stack_Implementation {
	@Override
	public void push(int item) throws Exception {
		if(this.isFull()) {
			int[] arr=new int[this.data.length*2];
			for(int i=0;i<this.data.length;i++) {
				arr[i]=this.data[i];
			}
			this.data=arr;
		}
		super.push(item);
	}
	
	public static void main(String[] args) throws Exception {
		_2_Dynamic_Stack ds=new _2_Dynamic_Stack();
		ds.push(10);
		ds.push(20);
		ds.push(30);
		ds.push(40);
		ds.push(50);
		ds.Display();
		ds.push(60);
		ds.Display();
		
	}
}
