public class StackL<T> {
	Node head;
	
	class Node {
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
			this.next = null;
		}
	}
	public void push(T data) {
		Node n = new Node(data);
		if (head == null) {
			head = n;
		} else {
			n.next = head;
			head = n;
		}
	}
	public T pop() {
		if (head == null) {
			return null;
		} else {
			T ret = head.data;
			head = head.next;
			return ret;
		}
	}
	public T peek() {
		if (head == null) {
			return null;
		}
		return head.data;
	}
	
}
