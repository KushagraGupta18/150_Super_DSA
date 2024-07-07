package _10_Stack_And_Queue;


public class _8_Implementation_Queue_Using_Stack extends _2_Dynamic_Stack{

	private _2_Dynamic_Stack data;
	
	public _8_Implementation_Queue_Using_Stack() {
		data=new _2_Dynamic_Stack();
	}
	public boolean isEmpty() {
		return this.data.isEmpty();
	}
	public void enqueue(int item) throws Exception {
		this.data.push(item);
	}
	public int size() {
		return this.data.size();
	}
	public int dequeue() throws Exception {
		_2_Dynamic_Stack temp=new _2_Dynamic_Stack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x=this.data.pop();
		while(temp.size()!=0) {
			this.data.push(temp.pop());
		}
		return x;
	}
	public int getFront() throws Exception {
		_2_Dynamic_Stack temp=new _2_Dynamic_Stack();
		while(this.data.size()!=1) {
			temp.push(this.data.pop());
		}
		int x=this.data.peek();
		while(temp.size()!=0) {
			this.data.push(temp.pop());
		}
		return x;
	}
	
	public static void main(String[] args) throws Exception {
		_8_Implementation_Queue_Using_Stack dq=new _8_Implementation_Queue_Using_Stack();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		System.out.println(dq.getFront());
		System.out.println(dq.dequeue());
		System.out.println(dq.dequeue());
		System.out.println(dq.getFront());
		System.out.println(dq.size());

	}
	
	

}
