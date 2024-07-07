package _11_Linked_List;

public class _1_Linked_List_Implemenation {

	public class Node{
		int data;
		Node next;
		public Node(int item) {
			this.data=item;
		}
		
	}
	
	private Node head;
	private Node tail;
	private int size;
	public void addFirst(int item) {
		Node nn=new Node(item);
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			nn.next=head;
			head=nn;
			size++;
		}
	}
	public void addLast(int item) {
		Node nn=new Node(item);
		if(size==0) {
			head=nn;
			tail=nn;
			size++;
		}
		else {
			tail.next=nn;
			tail=nn;
			size++;
		}
	}
	public void addAtIndex(int item, int k) throws Exception {
		if(k<0 || k>size) {
			throw new Exception("Baklol yha pr add nhi kr skta");
		}
		if(k==0) {
			addFirst(item);
		}
		else if(k==size) {
			addLast(item);
		}
		else {
			Node nn=new Node(item);
			Node k_1th=getNode(k-1);
			nn.next=k_1th.next;
			k_1th.next=nn;
			size++;
		}
	}
	
	
	public Node getNode(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Baklol range mai daal");
		}
		Node temp=head;
		for(int i=0;i<k;i++) {
			temp=temp.next;
		}
		return temp;
	
	}

	public Node getFirst() throws Exception {
		if(size==0) {
			throw new Exception("Baklol linkedlist mai element to daal");
		}
		return head;
	}
	public Node getLast() throws Exception {
		if(size==0) {
			throw new Exception("Baklol linkedlist mai element to daal");
		}
		return tail;
	}
	
	public Node removeFirst() throws Exception {
		if(size==0) {
			throw new Exception("Baklol linkedlist mai element to daal");
		}
		Node rem=head;
		Node temp=head.next;
		head.next=null;
		head=temp;
		size--;
		return rem;
	}
	
	public Node removeLast() throws Exception {
		if(size==0) {
			throw new Exception("Baklol linkedlist mai element to daal");
		}
		else if(size==1) {
			return removeFirst();
		}
		Node rem=tail;
		Node temp=getNode(size-2);
		temp.next=null;
		tail=temp;
		size--;
		return rem;
	}
	
	public Node removeAtIndex(int k) throws Exception {
		if(k<0 || k>=size) {
			throw new Exception("Baklol linkedlist mai element to daal");
		}
		else if(k==0) {
			return removeFirst();
		}
		else if(k==size-1) {
			return removeLast();
		}
		
		Node rem=getNode(k);
		Node k_1th=getNode(k-1);
		k_1th.next=rem.next;
		rem.next=null;
		size--;
		return rem;
	}
	
	
	
	
	
	public void Display() {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String[] args) throws Exception {
		_1_Linked_List_Implemenation ll=new _1_Linked_List_Implemenation();
		ll.addFirst(1);
		ll.addFirst(2);
		ll.Display();
		ll.addLast(3);
		ll.addLast(4);
		ll.Display();
		System.out.println(ll.getNode(2).data);
		ll.addAtIndex(5, 2);
		ll.Display();
		System.out.println(ll.getFirst().data);
		System.out.println(ll.getLast().data);
		System.out.println(ll.removeFirst().data);
		ll.Display();
		System.out.println(ll.removeLast().data);
		ll.Display();
		System.out.println(ll.removeAtIndex(1).data);
		ll.Display();
		
		
	}
}
