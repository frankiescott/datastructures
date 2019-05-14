public class QueueL<T> {
	Node head;
	Node tail;
	
	public QueueL() {
		this.head = null;
		this.tail = null;
	}
	class Node {
		public T data;
		public Node next;
		
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	public void enqueue(T data) {
		Node n = new Node(data);
		if (head == null) { //if list is empty
			head = n;
			tail = n;
		} else {
			tail.next = n; 
			tail = n;
		}
	}
	public T dequeue() {
		if (head == null) { //if list is empty
			return null;
		}
		T ret = head.data; //store data
		head = head.next; //remove reference to node
		return ret;
	}
	public T peek() {
		if (head == null) {
			return null;
		}
		return head.data;
	}
}
