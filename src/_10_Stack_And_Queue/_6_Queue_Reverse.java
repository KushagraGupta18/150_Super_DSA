package _10_Stack_And_Queue;

public class _6_Queue_Reverse extends _4_Dynamic_Queue{

	public static void main(String[] args) throws Exception {
		_6_Queue_Reverse dq=new _6_Queue_Reverse();
		dq.enqueue(10);
		dq.enqueue(20);
		dq.enqueue(30);
		dq.enqueue(40);
		dq.enqueue(50);
		dq.display();
		System.out.println("*****************************");
		reverse(dq);
		dq.display();;
		
	}

	public static void reverse(_6_Queue_Reverse dq) throws Exception {
		if(dq.isEmpty()) {
			return;
		}
		int x=dq.dequeue();
		reverse(dq);
		dq.enqueue(x);	
	}

}
