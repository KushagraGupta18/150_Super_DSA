package _10_Stack_And_Queue;

public class _4_Dynamic_Queue extends _3_Queue_Implementation {

	@Override
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			int[] arr=new int[2*this.data.length];
			for(int i=0;i<this.data.length;i++) {
				arr[i]=data[(this.front+i)%this.data.length];
			}
			this.data=arr;
			this.front=0;
		}
		
		super.enqueue(item);
	}
	
	public static void main(String[] args) throws Exception {
		_4_Dynamic_Queue dq=new _4_Dynamic_Queue();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.display();
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		dq.display();
		dq.enqueue(60);
		dq.enqueue(70);
		dq.display();
		dq.enqueue(80);
		dq.display();
		System.out.println(dq.size());
		System.out.println(dq.getFront());

	}
	
}
