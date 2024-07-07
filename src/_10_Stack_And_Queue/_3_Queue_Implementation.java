package _10_Stack_And_Queue;

public class _3_Queue_Implementation {

	protected int[] data;
	protected int front=0;
	private int size=0;
	
	public _3_Queue_Implementation() {
		this.data=new int[5];
	}
	
	public _3_Queue_Implementation(int cap) {
		this.data=new int[cap];
	}
	
	public boolean isEmpty() {
		return this.size==0;
	}
	
	public boolean isFull() {
		return this.size==this.data.length;
	}
	
	public int size() {
		return this.size;
	}
	
	public void enqueue(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Baklol Queue Full hai");
		}
		int idx=(this.front+this.size)%this.data.length;
		this.data[idx]=item;
		this.size++;
	}
	
	public int dequeue() throws Exception {
		if(isEmpty()) {
			throw new Exception("Baklol Queue Empty hai");
		}
		int item=this.data[this.front];
		this.front=(this.front+1)%this.data.length;
		this.size--;
		return item;
	}
	
	
	public int getFront() throws Exception {
		if(isEmpty()) {
			throw new Exception("Baklol Queue Empty hai");
		}
		int item=this.data[this.front];
		return item;
	}
	
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(this.data[(this.front+i)%this.data.length]+" -> ");
		}
		System.out.println();
	}

	public static void main(String[] args) throws Exception {
		_3_Queue_Implementation qq=new _3_Queue_Implementation();
		System.out.println(qq.isEmpty());
		qq.enqueue(10);
		qq.enqueue(20);
		qq.enqueue(30);
		qq.enqueue(40);
		qq.enqueue(50);
		System.out.println(qq.isFull());
		qq.display();
		qq.dequeue();
		qq.dequeue();
		qq.display();
		qq.enqueue(60);
		qq.enqueue(70);
		qq.display();
		qq.dequeue();
		qq.dequeue();
		qq.dequeue();
		qq.display();
		System.out.println(qq.getFront());
		qq.display();
	}
}
