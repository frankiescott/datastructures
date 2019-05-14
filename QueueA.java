//circular queue using an array
public class QueueA<T> {
	public T[] arr;
	public int size; //total size
	public int cap; //max size
	public int head;
	public int tail;
	
	public QueueA() {
		arr = (T[]) new Object[10];
		this.cap = cap;
		this.size = 0;
		this.head = -1; //we increment before adding data so initalize
		this.tail = -1; //index references to -1
	}
	public QueueA(int cap) {
		arr = (T[]) new Object[cap];
		this.cap = cap;
		this.size = 0;
		this.head = -1; //we increment before adding data so initalize
		this.tail = -1; //index references to -1
	}
	public boolean enqueue(T data) {
		if (size == cap) { //if list is full
			return false;
		}
		if (head == -1) { //if list is empty
			head++;
			tail++;
		} else if (tail + 1 == cap) { //if the slot next to tail is out of bounds
			tail = 0; //set tail to the first index
		} else {
			tail++;
		}
		arr[tail] = data;
		size++;
		return true;
	}
	
	public T dequeue() {
		if (size == 0) {
			return null;
		}
		T ret = arr[head]; //store data
		arr[head] = null; //clear out the index to be re-used
		if (head == tail) { //if there's only one element in the queue
			head = -1; //we can reset the pointers
			tail = -1;
		} else if (head + 1 == cap) { //if the slot next to head is out of bounds
			head = 0; //set head to first index
		} else {
			head++; //increment head pointer
		}
		size--;
		return ret;
	}
}
