public class StackA<T> {
	public int size; //how much data is in the stack
	public T[] arr; //the main array
	public int cap; //maximum size
	public int top; //reference to the top index
	
	public StackA() {
		this(20);
	}
	public StackA(int cap) {
		this.cap = cap;
		this.size = 0;
		this.top = -1;
		arr = (T[]) new Object[size];
	}
	public T pop() {
		if (size == 0) {
			return null;
		}
		size--;
		T ret = arr[top];
		arr[top] = null;
		return ret;
	}
	public boolean push(T data) {
		if (size == cap) {
			return false;
		}
		size++;
		top++;
		arr[top] = data;
		return true;
	}
	public T peek() {
		if (top == -1) {
			return null;
		} else {
			return arr[top];
		}
	}
}
