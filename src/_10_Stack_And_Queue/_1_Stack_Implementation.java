package _10_Stack_And_Queue;

public class _1_Stack_Implementation {

	protected int[] data;
	private int top=0;
	
	public _1_Stack_Implementation() {
		data=new int[5];
	}
	public _1_Stack_Implementation(int cap) {
		data=new int[cap];
	}
	
	public boolean isEmpty() {
		return this.top==0;
	}
	
	public boolean isFull() {
		return this.top==this.data.length;
	}
	
	public int size() {
		return this.top;		
	}
	
	public void push(int item) throws Exception {
		if(isFull()) {
			throw new Exception("Baklol Stack Full Hai");
		}
		this.data[this.top]=item;
		this.top++;
	}
	
	public int pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Baklol Stack empty hai");
		}
		this.top--;
		return this.data[this.top];
	}
	
	public int peek() throws Exception {
		if(isEmpty()) {
			throw new Exception("Baklol Stack empty hai");
		}
		return this.data[this.top-1];
	}
	
	
	public void Display() {
		for(int i=0;i<top;i++) {
			System.out.print(this.data[i]+" -> ");
		}
		System.out.println();
	}
	
	
	

	public static void main(String[] args) throws Exception {
		_1_Stack_Implementation st=new _1_Stack_Implementation();
//		System.out.println(st.isEmpty());
//		System.out.println(st.isFull());
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
//		System.out.println(st.isEmpty());
//		System.out.println(st.isFull());
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.size());
		st.Display();
		st.push(60);
		st.Display();
		st.push(70);	//gives an exception error Baklol Stack Full Hai
	}
}
