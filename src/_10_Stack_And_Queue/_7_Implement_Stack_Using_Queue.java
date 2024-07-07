package _10_Stack_And_Queue;
public class _7_Implement_Stack_Using_Queue extends _4_Dynamic_Queue{


	private _4_Dynamic_Queue data;
	
	public _7_Implement_Stack_Using_Queue() {
		data=new _4_Dynamic_Queue();
	}
	
	public boolean isEmpty() {
		return data.isEmpty();
	}
	public int size() {
		return this.data.size();
	}

	public void push(int item) throws Exception {
		_4_Dynamic_Queue temp=new _4_Dynamic_Queue();
		while(!this.data.isEmpty()) {
			temp.enqueue(this.data.dequeue());
		}
		data.enqueue(item);
		while(!temp.isEmpty()) {
			data.enqueue(temp.dequeue());
		}
	}
	
	public int pop() throws Exception {
		return this.data.dequeue();
	}	
	public int peek() throws Exception {
		return this.getFront();
	}
	
	public static void main(String[] args) throws Exception {
		_7_Implement_Stack_Using_Queue st=new _7_Implement_Stack_Using_Queue();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st.isEmpty());
		System.out.println(st.size());
	}
	

}
