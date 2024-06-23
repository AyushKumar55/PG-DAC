package stack;

public interface Stack<T> {

	void push(T element);
	void pop() throws StackUnderflowException;
	void peek();
	boolean isEmpty();
	boolean isFull();
}
