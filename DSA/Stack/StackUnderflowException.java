package stack;

@SuppressWarnings("serial")
public class StackUnderflowException extends Exception{

	public StackUnderflowException(String msg) {
		super(msg);
	}
}
